package Classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		this(1,1,2017);
	}
	
	Data(int dia , int m, int a){
		this.dia = dia;
		mes = m;
		ano = a;
	}
	
	
	String formatar()
	{
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
}
