package investimento;

public class App {

	public static void main(String[] args) {
		
		double valorCarlos = 3000;
        double valorJoao = valorCarlos / 3;

        int qtdMeses = 0;

        while (valorCarlos > valorJoao) {
            valorCarlos = valorCarlos * 1.02;
            valorJoao = valorJoao * 1.05;

            qtdMeses++;
        }

        System.out.println("Quantidade de meses: " + qtdMeses);
        System.out.printf("Valor investido do Carlos: R$%.2f%n", valorCarlos);
        System.out.printf("Valor investido do João: R$%.2f%n", valorJoao);

	}

}
