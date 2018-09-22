package Fundamentos;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		int z = 5;
		
		//Operadores + - * / %
		int soma = x + y + z + 6;
		System.out.println(soma);
		System.out.println(x - y - z );
		
		//cuidado com precedencia 
		
		System.out.println(x + z * y / 2);
		System.out.println((x + z) * y / 2);
		
		System.out.println(10 % 3);
		
	}
	
}
