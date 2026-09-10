package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[] notas = new double [4];
		double soma = 0;
		double media = 0;
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.printf("Informe a %dº nota: ", (i + 1));

			notas[i] = Double.parseDouble(leia.nextLine());
			
			soma += notas[i];
			
			 media = soma / notas.length;
		}
		
		System.out.println("\nNotas cadastradas: ");
		
		for (double nota : notas) {
			
			System.out.println(nota);
		}
		
		System.out.println("\nMédia: " + media);

	}

}
