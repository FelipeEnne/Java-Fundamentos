package Fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean exTrab1 = false;
		boolean exTrab2 = true;
		
		boolean comprSover = exTrab1 || exTrab2;
		
		boolean comprTV50 = exTrab1 && exTrab2;
		
		boolean comprTV32 = exTrab1 ^ exTrab2;
		
		
		System.out.println("Sorvete = " + comprSover);
		System.out.println("TV50 = " + comprTV50);
		System.out.println("TV32 = " + comprTV32);
		
		//unatio
		System.out.println("Fome = " + !comprSover);
		 
	}
}
