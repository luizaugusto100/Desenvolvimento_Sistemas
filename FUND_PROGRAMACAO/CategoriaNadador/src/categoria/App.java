package categoria;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a idade do nadador: ");
		int nadador = Integer.parseInt(leia.nextLine());
		
		if (nadador < 5) {
			System.out.println("Nenhuma categoria.");
		} else if (nadador >= 5 && nadador <= 7) {
			System.out.println("infantil.");
		} else if (nadador >= 8 && nadador <= 10) {
			System.out.println("juvenil.");
		}else if (nadador >= 11 && nadador <= 15) {
			System.out.println("adolescente.");
		}else if (nadador >= 16 && nadador <= 30) {
			System.out.println("Adulto.");
		} else {
			System.out.println("Sênior.");
		}
		

	}

}
