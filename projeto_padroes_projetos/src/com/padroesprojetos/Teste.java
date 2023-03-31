package com.padroesprojetos;

import com.padroesprojetos.facade.Facade;
import com.padroesprojetos.strategy.Comportamento;
import com.padroesprojetos.strategy.ComportamentoAgressivo;
import com.padroesprojetos.strategy.ComportamentoDefensivo;
import com.padroesprojetos.strategy.ComportamentoNormal;
import com.padroesprojetos.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		
		// PADRÃO DE PROJETO SINGLETON

		/*
		 * public static void main(String[] args) { // TODO Auto-generated method stub
		 * 
		 * SingletonLazy lazy = SingletonLazy.getInstance(); System.out.println(lazy);
		 * lazy = SingletonLazy.getInstance(); System.out.println(lazy);
		 * 
		 * SingletonEager eager = SingletonEager.getInstance();
		 * System.out.println(eager); eager = SingletonEager.getInstance();
		 * System.out.println(eager);
		 * 
		 * SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
		 * System.out.println(holder); holder = SingletonLazyHolder.getInstance();
		 * System.out.println(holder); }
		 */

		// PADRÃO DE PROJETO STRATEGY

		/*
		 * Comportamento defensivo = new ComportamentoDefensivo(); Comportamento normal
		 * = new ComportamentoNormal(); Comportamento agressivo= new
		 * ComportamentoAgressivo();
		 * 
		 * Robo robo = new Robo();
		 * 
		 * robo.setComportamento(normal); robo.mover(); robo.mover();
		 * robo.setComportamento(defensivo); robo.mover(); robo.mover(); robo.mover();
		 * robo.setComportamento(agressivo); robo.mover(); robo.mover(); robo.mover();
		 * robo.mover();
		 */

		// PADRÃO DE PROJETO FACADE
		
		Facade facade = new  Facade();
		facade.migrarCliente("julio", "1234568");

	}

}
