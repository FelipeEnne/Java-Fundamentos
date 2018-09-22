package oo.heranca;

public class TestDrive {

	public static void main(String[] args) {
		carro c = new Civic();
		
		c.acelerar();
		
		System.out.println(c.getVelocidadeAtual());
		
		c = new Ferrari();
		
		c.acelerar();
		
		System.out.println(c.getVelocidadeAtual());
	}
}
