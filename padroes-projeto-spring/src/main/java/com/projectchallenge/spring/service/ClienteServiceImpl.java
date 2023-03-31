package com.projectchallenge.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectchallenge.spring.model.Cliente;
import com.projectchallenge.spring.model.ClienteRepository;
import com.projectchallenge.spring.model.Endereco;
import com.projectchallenge.spring.model.EnderecoRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private ViaCepService cepService;
	
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscaPorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		
		salvaCliente(cliente);
		
	}

	private void salvaCliente(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
			Endereco novoEndereco = cepService.consultacep(cep);
			enderecoRepository.save(novoEndereco);
			
			return novoEndereco;
		});
		
		cliente.setEndereco(endereco);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clientedb = clienteRepository.findById(id);
		
		if(clientedb.isPresent()) {
			salvaCliente(cliente);
		}
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
	}

}
