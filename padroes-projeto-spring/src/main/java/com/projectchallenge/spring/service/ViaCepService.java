package com.projectchallenge.spring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projectchallenge.spring.model.Endereco;

@FeignClient(name="viacep", url="https://viacep.com.br/ws")
public interface ViaCepService {
	
	@RequestMapping(method = RequestMethod.GET,value = "/{cep}/json/")
	Endereco consultacep(@PathVariable("cep") String cep);

}
