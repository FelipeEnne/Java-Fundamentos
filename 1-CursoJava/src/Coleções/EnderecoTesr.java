package Coleções;

public class EnderecoTesr {

	public static void main(String[] args) {
		
		Endereco end1 = new Endereco("Rua loop", 1, "Sala 101");
		Endereco end2 = new Endereco("Rua loop", 1, "Sala 101");
		
		
		System.out.println(end1 == end2);
		System.out.println(end1.equals(end2));
	}
	
	
}
