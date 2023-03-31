package com.padroesprojetos.facade;

import com.subsystem1.crm.CrmService;
import com.subsystem2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String estado = CepApi.getInstance().recuperaEstado(cep);
		CrmService.gravarCliente(nome, cep, estado);
	}
}
