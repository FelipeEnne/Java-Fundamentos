package Controle;

import java.util.Scanner;

public class For {

	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			double somaDasNotas = 0;
			double nota = 0;
			
			for(int indice = 0; indice < 3 ; indice++ ) {
				nota = scan.nextDouble();
				somaDasNotas += nota;
				
			}
			scan.close();
			System.out.printf("A Mádia é %.f", somaDasNotas/3);
			
			
		}
}
