package contas;

public class ContaBancaria {
	private String numeroConta, nomeCliente;
	private double saldo;

	public ContaBancaria(String numeroConta, String nomeCliente, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	

	public ContaBancaria() {
		
	}


	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			System.out.println("Saldo não pode ser iniciado com valor negativo!");
		}

	}

	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.printf("Deposito concluído com sucesso! saldo após o deposito: R$ %.2f%n", saldo);
		} else {
			System.out.println("Valor inválido!");
		}
	}
		
	public void sacar (double valor) {
		if(valor > 0) {
			if(valor <= saldo) {
				saldo -= valor;
				System.out.printf("Saque concluído com sucesso! saldo após o saque: R$ %.2f%n", saldo);
			} else {
				System.out.println("Saldo insuficiente!");
			}
			
		} else {
			System.out.println("Não tem como sacar valores negativos!");
		}
	}
	
	public void exibirDados() {
		System.out.printf("Número da conta: %s%nNome do cliente: %s%nSaldo: R$ %.2f%n", numeroConta, nomeCliente, saldo);
	}
	
		

}