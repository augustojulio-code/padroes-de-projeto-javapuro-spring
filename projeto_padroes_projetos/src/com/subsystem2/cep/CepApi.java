package com.subsystem2.cep;


public class CepApi {

	private static CepApi instance = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstance() {

		return instance;
	}
	
	public String recuperaCidade(String cep) {
		
		return "Barueri";
	}
	
	public String recuperaEstado(String estado) {
		
		return "SP";
	}

}
