package Classe;

public class Produto {
	String nome;
	double preco;
	 static double desconto;
	
	//construtor padrao
	Produto(){
		
	}
	
	//dentro do () sao parametros
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
					
	}
	
	double precoComDesconto() {
		return preco - preco * desconto;
	}
	
}
