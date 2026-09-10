package exercicio1;

public class ListaCidades {

	public static void main(String[] args) {
		
		String cidades[] = {"Valença", "Barra do Piraí", "Vassouras", "Volta Redonda", "Resende"};

		for (int i = 0; i < cidades.length; i++) {
			
			System.out.printf("%dº Posição: %s%n", (i + 1), cidades[i]);
			
		}
		
	}

}
