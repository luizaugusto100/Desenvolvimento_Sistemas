package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTarefas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList <String> tarefas = new ArrayList<>();
		
		String cadastrar, tarefa;
		
	
		do {
			System.out.print("digite uma tarefa: ");
			tarefa = leia.nextLine();
			
			tarefas.add(tarefa);
			
			System.out.print("Deseja cadastrar outra tarefa? ");
			cadastrar = leia.nextLine();
			
		} while (cadastrar.equalsIgnoreCase("S"));
		
		System.out.println("\nTarefas cadastradas: ");
		
		for (String tare : tarefas) {
			System.out.println(tare);
			
		}
		
		leia.close();

	}

}
