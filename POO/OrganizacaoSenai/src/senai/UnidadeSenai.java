package senai;

import java.util.ArrayList;

public class UnidadeSenai {
	private String nome;
	ArrayList <Departamento> departamentos = new ArrayList<>();
	
	public UnidadeSenai(String nome) {
		this.nome = nome;
		departamentos = new ArrayList<>();
	}
	
	public void adicionarDepartamento(Departamento departamento) {
		departamentos.add(departamento);
	}
	public void exibirEstrutura() {
		System.out.printf("%S", nome);
		System.out.println("  === Departamentos ===  ");
		listarDepartamentos();
		System.out.println("  === Funcionarios ===  ");
	}
	
	public void listarDepartamentos() {
		for (Departamento depar : departamentos)
			depar.exibirDados();
	}
	
}
