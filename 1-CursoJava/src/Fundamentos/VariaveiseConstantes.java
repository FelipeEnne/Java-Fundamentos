package Fundamentos;

public class VariaveiseConstantes {
	
	public static void main(String[] args) {
		
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		
		System.out.println("area é " + area + " m2.");
		
		System.out.printf("area é %f m2 \n", area);
		
		System.out.printf("area é %.2f m2", area);
	}

}
