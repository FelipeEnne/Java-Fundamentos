package Cole��es;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	
	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<>();
		
		aprovados.add("Jo�o");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		//aprovados.add(1);ERRO
		
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
	}
	
}
