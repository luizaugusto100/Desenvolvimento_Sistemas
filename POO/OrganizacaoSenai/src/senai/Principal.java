package senai;

public class Principal {

	public static void main(String[] args) {
		UnidadeSenai u = new UnidadeSenai("SENAI Valença");
		
		Departamento deparA = new Departamento(1,"Tecnologia da Informação", "24066680");
		Departamento deparB = new Departamento(2,"Administração", "24020637");
		
		Funcionario f1 = new Funcionario(1, "Julia", "Marketing e Venda", 2000);
		Funcionario f2 = new Funcionario(2, "Maria", "Analísta de Dados", 2500);
		Funcionario f4 = new Funcionario(3, "Emiliano", "Marketing e Vendas", 2000);
		Funcionario f3 = new Funcionario(4, "Luiz", "Analísta de Dados", 2500);
		
		
	}
	
}
