package Cole��es;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");

		
		System.out.println("Get");
		System.out.println(aprovados.get(1));
		
		
		System.out.println("Add");
		System.out.println(aprovados.add("Jo�o"));
		System.out.println("Size " + aprovados.size());
		
		
		System.out.println("Remover");
		System.out.println(aprovados.remove("jo�o"));
		System.out.println(aprovados.remove("Jo�o"));
		System.out.println("Size " + aprovados.size());
		
		
		for (String string : aprovados) {
			System.out.println(string);
		}
		
		
	}
	
	
}
