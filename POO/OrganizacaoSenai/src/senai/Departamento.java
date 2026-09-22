package senai;

import java.util.ArrayList;

public class Departamento {
	private int codigo;
	private String nome, telefone;
	ArrayList <Funcionario> funcionarios = new ArrayList<>();
	
	public Departamento(int codigo, String nome, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		funcionarios = new ArrayList<>();
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void exibirDados() {
		System.out.printf("Código: %f - Nome: %S - Telefone: %S", codigo, nome, telefone);
		System.out.println("  === Funcionarios ===  ");
		listarFuncionarios();
	}
	
	public void listarFuncionarios() {
		for (Funcionario f : funcionarios) 
			f.exibirDados();
	}
	
	
	

}
