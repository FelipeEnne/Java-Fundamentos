package Classe;

public class DataTest {

	
	public static void main(String[] args) {
		Data nascimento = new Data();
		
//		nascimento.dia = 19;
//		nascimento.mes = 11;
//		nascimento.ano = 1987;
		
		Data casamento = new Data(20,01,1996);
		
		//System.out.println(nascimento.dia + "/" + nascimento.mes + "/" +  nascimento.ano);
		//System.out.printf("%d/%d/%d\n", nascimento.dia, nascimento.mes, nascimento.ano);
		
		
		System.out.println(nascimento.formatar());
		
		
		System.out.println(casamento.formatar());
		
	}
	
	
}
