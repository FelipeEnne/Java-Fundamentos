package Fundamentos;

public class VariaveiseConstantes {
	
	public static void main(String[] args) {
		
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		
		System.out.println("area � " + area + " m2.");
		
		System.out.printf("area � %f m2 \n", area);
		
		System.out.printf("area � %.2f m2", area);
	}

}
