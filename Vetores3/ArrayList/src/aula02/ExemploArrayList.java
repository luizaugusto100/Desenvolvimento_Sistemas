package aula02;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList <String> nomes = new ArrayList<>();
		
		String nome, continuar;
		
		// Preenche a lista
		do {
			System.out.print("Digite um nome: ");
			nome = input.nextLine();
			
			nomes.add(nome);
			
			System.out.print("Deseja adicionar outro nome? (s/n)");
			continuar = input.nextLine();
			
		} while (continuar.equalsIgnoreCase("S"));
		
		//Percorre e exibe a lista
		System.out.println("\nNomes cadastrados:");
		
		for (String nomeCadastrado : nomes) {
			System.out.println(nomeCadastrado);
		}

		input.close();
	}

}
