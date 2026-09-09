package quadradocuboraiz;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner  leia = new Scanner(System.in);
		Math.sqrt(2);
		
		int numero;

		do {
			System.out.println("Informe um número: ");
			
			numero = leia.nextInt();
			
			System.out.println("Valor digitado: " + numero);
			
			System.out.println("Quadrado: " + numero * numero);
			
			System.out.println("Cubo: " + numero * numero * numero);
			
			System.out.println("" + Math.sqrt(numero));
			
		} while (numero > 0);
	}

}
