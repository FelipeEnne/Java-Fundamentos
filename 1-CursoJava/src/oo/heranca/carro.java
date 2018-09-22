package oo.heranca;

public class carro {

	protected int VELOCIADE_MAXIMA = 200;
	private int velocidadeAtual = 0;
	
	//de certa forma constante
	protected final void acelerarMais(int velocidade) {
		if(velocidadeAtual + velocidade >  VELOCIADE_MAXIMA ) {
			velocidadeAtual = VELOCIADE_MAXIMA;
		}else {
			velocidadeAtual += velocidade;
		}
			
	}
	
	
	
	protected final void frearMais(int velocidade) {
		if(velocidadeAtual - velocidade >  VELOCIADE_MAXIMA) {
			velocidadeAtual = 0;
		}else {
			velocidadeAtual -= velocidade;
		}
	
	}
	
	public void acelerar() {
		acelerarMais(5);
	}
	
	public void frear() {
		frearMais(5);
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	
	
}
