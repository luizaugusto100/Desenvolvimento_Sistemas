package tabuada;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        int fixo = 5;

	        System.out.println("Etapa 1 - tabuada fixa de " + fixo);

	        for (int i = 1; i <= 10; i++) {
	            System.out.printf("%d x %d = %d%n", fixo, i, fixo * i);
	        }

	        System.out.print("Etapa 2 - informe um numero: ");

	        int numero = sc.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
	        }

	        do {
	            System.out.print("Etapa 3 - informe um numero maior que zero: ");
	            numero = sc.nextInt();
	        } while (numero <= 0);

	        for (int i = 1; i <= 10; i++) {
	            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
	        }

	        sc.close();
	    

	}

}
