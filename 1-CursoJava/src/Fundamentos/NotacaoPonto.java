package Fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		String s = "Bom dia ?".toUpperCase().replace("?", "Bia");
		s= s.concat("!");
		
		
		System.out.println(s);
	}
}
