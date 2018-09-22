package oo.heranca;

public class Ferrari extends carro{

	
	public Ferrari() {
		VELOCIADE_MAXIMA = 350;
	}
	
	public void acelerar() {
		super.acelerarMais(20);
	}
}
