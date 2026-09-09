package menuoperacoes;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		
		int numero1 = Integer.parseInt(leia.nextLine());
		
		System.out.print("Informe o segundo número: ");
		
		int numero2 = Integer.parseInt(leia.nextLine());
		
		System.out.print( "Opções de oprações disponiveis: \r\n" +
				"1 - Calcular a média dos números;\r\n"
				+ "2 - Subtrair o menor número do maior;\r\n"
				+ "3 - Multiplicar os números;\r\n"
				+ "4 - Dividir o primeiro número pelo segundo. \n");
		
		System.out.print("Escolha qual operação lógica gostaria de realizar: ");
		
		int opcoes = Integer.parseInt(leia.nextLine());
		
		switch (opcoes) {
		
		case 1: 
			
			System.out.println("A média dos números é igual á: " + (numero1 * numero2)/2);
			break;
			
		case 2:
			
			if (numero1 > numero2) {
				
				System.out.println("A subtração do menor pelo maior é igual á: " + (numero1 - numero2));
				
			} else {
				
				System.out.println("A subtração do menor pelo maior é igual á: " + (numero2 - numero1));
				
			}
			break;
			
		case 3: 
			
			System.out.println("A multiplicação desses números é igual á: " + numero1 * numero2);
			break;
		
		case 4: 
			
			if (numero2 != 0) {
				
				System.out.println("A divisão dos números é igual á: " + numero1 / numero2);
				
			}else {
				System.out.println("Impossível dividir por 0");
			}
			break;
			
		default :
			System.out.println("Informe um número dentro das opções.");
		};
			
		
	}

}
