package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int [5];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.printf("Informe o %dº número: ", (i + 1));

			numeros[i] = leia.nextInt();
			
			
		}
		
		System.out.print("Números Cadastrados" + "\n");
		
		for (int numero : numeros) {
			
			System.out.print(numero + "\n");
		}
	}
}