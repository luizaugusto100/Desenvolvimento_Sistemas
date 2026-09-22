package estoque;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		HashMap<String, Integer> estoque = new HashMap<>();
		
		estoque.put("Teclado", 10);
		estoque.put("Mouse", 15);
		estoque.put("Monitor", 6);
		estoque.put("Notebook", 4);
		
		for(Map.Entry<String, Integer> est : estoque.entrySet()) {
			System.out.println(
					"Produto: " + est.getKey()
					+ " Quantidade no estoque: " + est.getValue()
					);
		}
		
		System.out.println("\nInforme o produto: ");
		String produto = leia.nextLine();
		
		if (estoque.containsKey(produto)){
			Integer pro = estoque.get(produto);
			System.out.println("Quantidade em estoque: " + pro);
			
			System.out.println("Digite a nova quantidade: ");
			Integer novoEstoque = Integer.parseInt(leia.nextLine());
			
			estoque.put(produto, novoEstoque);
			
			System.out.println("Estoque alterado!");
			System.out.println("Novo estoque: " + estoque.get(produto));
		}
		else {
			System.out.println("Produto não encontrado.");
			
		}
		
		System.out.println("Informe o produto que deseja remover: ");
		produto = leia.nextLine();
		
		estoque.remove(produto);
		
		for(Map.Entry<String, Integer> est : estoque.entrySet()) {
			System.out.println(
					"Produto: " + est.getKey()
					+ " Quantidade no estoque: " + est.getValue()
					);

		}
		leia.close();
	}

}
