package Classe;

public class CalculadoraTeste {

	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		
		System.out.println(calc.somar(2, 4));
		
		calc.acrescentar(10);
		
		System.out.println(calc.obterResultado());
		
		calc.limpar();
		
		System.out.println(calc.obterResultado());
		
	}
}
