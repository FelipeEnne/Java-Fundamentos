package Classe;

public class ProtutoTest {

	
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		
		produto1.nome = "Notebook";
		produto1.preco = 2300;
		
		
		
		Produto produto2 = new Produto("Caneta",2.83);
		
		Produto.desconto = 0.15;
		
		System.out.println(produto1.precoComDesconto());
		System.out.println(produto2.precoComDesconto());
	}
}
