package area;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a base do triangulo: ");
		int base = Integer.parseInt(leia.nextLine());
		
		System.out.print("Informe a altura do triangulo: ");
		int altura = Integer.parseInt(leia.nextLine());
		
		do {
			
			System.out.println("Informe valores maiores que 0");
			
		} while (base <= 0 && altura <= 0);
		
		if (base >= 0 || altura >= 0);{
			
			System.out.print();
			System.out.print((base * altura)/2);
		
		}

	}

}