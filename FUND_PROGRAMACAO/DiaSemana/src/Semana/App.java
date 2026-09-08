package Semana;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um número entre 1 e 7: ");
		
		int dia = Integer.parseInt(leia.nextLine());
		
		switch (dia) {
		case 1 :
			System.out.println(dia = 1 + "é igual á Domingo");
			break;
		
		case 2 : 
			System.out.println(dia = 2 + "é igual á Segunda-feira");
			break;
			
		case 3 : 
			System.out.println(dia = 3 + "é igual á Terça-feira");
			break;
			
		case 4 :
			System.out.println(dia = 4 + "é igual á Quarta-feira");
			break;
			
		case 5 :
			System.out.println(dia = 5 + "é igual á Quinta-feira");
			break;
		
		case 6 :
			System.out.println(dia = 6 + "é igual á Sexta-feira");
			break;
			
		case 7 :
			System.out.println(dia = 7 + "é igual á Sabado");
			break;
			
		default :
			System.out.println("Informe um valor valido");

	}
		
	}

}
