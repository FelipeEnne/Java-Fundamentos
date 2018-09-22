package oo.polimorfismo;

import Controle.For;

public class Pessoa {

	
	/**
	 * Peso em Kg
	 */
	private double peso = 0;
	
	
	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}
	
	
	public double getPeso() {
		return peso;
	}
	
	
/*	public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void comer(Feijao Feijao) {
		this.peso += Feijao.getPeso();
	}
	
	public void comer(Soverte Soverte) {
		this.peso += Soverte.getPeso();
	}
	*/
	
	public void comer(Comida... comidas) {
		for(Comida c: comidas){
		this.peso += c.getPeso();
		}
	}
	
}
