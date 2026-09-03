package comparacao;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int numero = Integer.parseInt(leia.nextLine());
		
		if (numero > 20) {
			System.out.println("Maior do que 20");
		}
		else {
			System.out.println("Menor ou igual a 20");
		}
	}

}
