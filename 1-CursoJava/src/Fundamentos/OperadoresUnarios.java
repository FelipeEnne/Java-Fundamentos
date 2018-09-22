package Fundamentos;

public class OperadoresUnarios {
	
 public static void main(String[] args) {
	int a = 1;
	int b = 2;
	
	//incremento
	a++;
	System.out.println(a);
	--a;
	System.out.println(a);
	
	System.out.println(++a == b--);
	//System.out.println(a++ == b--);
	System.out.println(a == b);
	
	
	//complemento binario
	System.out.println(Integer.toBinaryString(50));
	System.out.println(Integer.toBinaryString(~50));
	
	
	System.out.println(!true);
}
}
