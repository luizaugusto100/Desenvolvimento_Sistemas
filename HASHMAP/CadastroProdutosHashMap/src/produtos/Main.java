package produtos;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		HashMap<Integer, Produto> produtos = new HashMap<>();
		
		produtos.put(101, new Produto("Suco de uva", 12.90, 10));
		produtos.put(102, new Produto("Arroz", 21.55, 20));
		produtos.put(103, new Produto("Fanta laranja", 6.00, 10));
		produtos.put(104, new Produto("Guaraviton", 3.50, 5));
		
		for(Map.Entry<Integer, Produto> produto : produtos.entrySet()) {
			produto.getValue().exibirDados();
		}
		
		System.out.println("Informe o código do produto: ");
		int codigo = Integer.parseInt(leia.nextLine());
		
		if(produtos.containsKey(codigo)) {
			produtos.get(codigo).exibirDados();
		} else {
			System.out.println("Produto não encontrado! ");
		}
		
		leia.close();

	}

}