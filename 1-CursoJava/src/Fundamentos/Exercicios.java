package Fundamentos;

public class Exercicios {

	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		double celsius = 35;
		double fahrenheit = 0;
		
		
		
		fahrenheit = celsius*1.8 + 32;
		
		System.out.println(fahrenheit);
		
		
		//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		celsius = 0;
		
		celsius = (fahrenheit - 32)/1.8;
		
		System.out.println(celsius);
		
		//Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
		
		double peso = 80;
		double altura = 1.8;
		double imc = 0;
		
		imc  = peso/(altura*altura);
		
		System.out.println(imc);
		
		//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
		
		
	}
	
}
