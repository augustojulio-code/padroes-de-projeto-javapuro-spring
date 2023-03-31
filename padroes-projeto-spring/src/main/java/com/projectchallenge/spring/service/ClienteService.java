package com.projectchallenge.spring.service;

import com.projectchallenge.spring.model.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	Cliente buscaPorId(Long id);
	void inserir(Cliente cliente);
	void atualizar(Long id, Cliente cliente);
	void delete(Long id);
	
}
