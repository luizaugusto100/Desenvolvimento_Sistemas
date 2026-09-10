package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[] temperaturas = new double [7];

		
		
		for (int i = 0; i < temperaturas.length; i++) {
			
			System.out.printf("Informe o %dª temperatura: ", (i + 1));
			temperaturas[i] = Double.parseDouble(leia.nextLine());
		}
		
		double maior = temperaturas[0];
		double menor = temperaturas[0];
		
		System.out.println("Temperaturas da Semana: ");
		
		for(double temperatura : temperaturas) {
			System.out.println(temperatura);
			
			if (temperatura > maior) {
				
				maior = temperatura;
			}
			if (temperatura < menor) {
				
				menor = temperatura;
			}
		}
		
		System.out.println("Maior temperatura: " + maior + "\n" + "Menor temperatura: " + menor);
		
	}

}
