package Fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args) {
		// 1 Explicita
		float f = (float) 0.1;
		System.out.println(f);
		
		// 2 Explicita
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// 3 implicita
		int i2 = 'a';
		System.out.println(i2);
		
		// 3 implicita
		double d = 1001;
		System.out.println(d);
		
	}
}
