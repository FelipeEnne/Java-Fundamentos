package Controle;

import java.util.Scanner;

public class doWhile {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double somaNotas = 0;
		double notas = 0;
		double numeroNotas = 0;
		
		do {
			notas = scan.nextDouble();
			if (notas <=10 && notas >=0) {
				somaNotas += notas;
				numeroNotas++;
			}
			
		}while(notas != -1);
		
		scan.close();
		System.out.printf("A média é %.2f", somaNotas / numeroNotas);
	}
	
}
