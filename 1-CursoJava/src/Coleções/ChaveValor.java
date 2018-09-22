package Coleções;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ChaveValor {

	
	public static void main(String[] args) {
		Map<Integer,String> apro = new HashMap<>();
		
		apro.put(1, "Pedro");
		apro.put(2, "Ana");
		apro.put(3, "Bia");
		apro.put(4, "Carlos");
		
		System.out.println(apro.keySet());
		System.out.println(apro.values());
		System.out.println(apro.entrySet());
		
		apro.put(3, "Beatriz");
		System.out.println(apro.get(3));
		
		System.out.println(apro.containsKey(4));
		System.out.println(apro.containsValue("Bia"));
		
		System.out.println("Chaves");
		for (Integer id : apro.keySet()) {
			System.out.println(id);
		}
		
		System.out.println("Valores");
		for (String nome : apro.values()) {
			System.out.println(nome);
		}
		
		System.out.println("Chave/Valores");
		for(Entry<Integer,String> regis:apro.entrySet()) {
			System.out.println(regis);
			System.out.println(regis.getKey() + "  "+ regis.getValue());
		}
		
		
	}
}
