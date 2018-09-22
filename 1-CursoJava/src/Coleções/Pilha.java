package Coleções;

import java.util.Stack;

public class Pilha {

	
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		
		pilha.push("O Pequeno Principe");
		pilha.push("O Hobbit");
		pilha.push("Don Quixote");
		
		System.out.println("Peek");
		System.out.println(pilha.peek());
		
		System.out.println("Pop");
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		//System.out.println(pilha.pop());
	}
	
	
	
}
