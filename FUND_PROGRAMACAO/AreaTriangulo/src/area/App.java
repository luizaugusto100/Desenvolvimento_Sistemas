package area;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        double base, altura;

	        do {
	            System.out.print("Base: "); base = sc.nextDouble();
	            System.out.print("Altura: "); altura = sc.nextDouble();

	            if (base <= 0 || altura <= 0) {
	                System.out.println("Erro: as medidas devem ser maiores que zero.");
	            }

	        } while (base <= 0 || altura <= 0);

	        System.out.printf("Area: %.2f%n", base * altura / 2);

	        sc.close();
		

	}

}