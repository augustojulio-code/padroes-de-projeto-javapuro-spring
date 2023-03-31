package com.subsystem1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String estado) {
		
		System.out.println("Cliente Salvo no CRM");
		
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(estado);
	}
	
}
