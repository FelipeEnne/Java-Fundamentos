package api;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = new String("Felipe");
		nome = "Fe"+"lipe";
		
		//metodos
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 2));
		System.out.println(nome.indexOf('d'));
		System.out.println(nome.charAt(3));
		System.out.println(nome.equalsIgnoreCase("felipe"));
		System.out.println(nome.startsWith("Fe"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" é legal").concat("!"));
		
		// A string é imutalvel
		
		System.out.println(nome);
		
		nome = nome.toUpperCase().substring(0,2);
		System.out.println(nome);
	}
}
