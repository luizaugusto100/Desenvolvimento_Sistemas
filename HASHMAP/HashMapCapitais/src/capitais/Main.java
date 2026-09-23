package capitais;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("São Paulo", "São Paulo");
		capitais.put("Minas Gerais", "Belo Horizonte");
		capitais.put("Bahia", "Salvador");
		capitais.put("Paraná", "Curitiba");
		
		System.out.println("\nLista de Estados e Capitais: \n");
		
		for(Map.Entry<String, String> capital : capitais.entrySet()) {
			System.out.println(
					"Estado " + capital.getKey()
					+ " Capital " + capital.getValue()
					);
		}
		
		System.out.println("\n\nInforme o estado que deseja saber a capital. ");
		String estado = input.nextLine();
		
		if (capitais.containsKey(estado)){
			String capital = capitais.get(estado);
			System.out.println("Capital encontrada " + capital);
			
		}
		else {
			System.out.println("Estado não encontrado.");
			
		}
			input.close();
	}
}
