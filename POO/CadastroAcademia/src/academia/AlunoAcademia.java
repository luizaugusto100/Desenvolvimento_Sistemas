package academia;

public class AlunoAcademia {
	String nome;
	int idade;
	double peso, altura;
	boolean ehMenorDeIdade;


	public AlunoAcademia(String nome, int idade, double peso, double altura, boolean ehMenorDeIdade) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.ehMenorDeIdade = ehMenorDeIdade;

	}

	void verdadeiro() {
		if (idade > 0 && idade < 18) {
			ehMenorDeIdade = true;
		} else {
			ehMenorDeIdade = false;
		}

	}
	
	double calcularIMC(){
		return peso / (altura * altura);
	}
	
	void exibirDados() {
		
		
		System.out.print("\n\nNome do aluno: " + nome);
		System.out.print("\nIdade do aluno: " + idade +" anos.");
		System.out.print("\nPeso do aluno: " + peso + " Kg.");
		System.out.print("\nAltura do aluno: " + altura + " m.");
		System.out.printf("\nIMC do aluno: %.2f", calcularIMC());
		System.out.print("\nTem direito ao desconto: " + ehMenorDeIdade);
	}
	
	
	

}
