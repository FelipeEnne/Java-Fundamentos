package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		///*
		String resposta1 = JOptionPane.showInputDialog("Qual � a nota 1?");
		String resposta2 = JOptionPane.showInputDialog("Qual � a nota 2?");
		
		System.out.println(resposta1 + resposta2);
		
		//converter
		double nota1= Double.parseDouble(resposta1);
		double nota2= Double.parseDouble(resposta2);
		double total = nota1 + nota2;
		
		System.out.println(total/2);
		
		//*/
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println((""+num2).length());
		
		
	}

}
