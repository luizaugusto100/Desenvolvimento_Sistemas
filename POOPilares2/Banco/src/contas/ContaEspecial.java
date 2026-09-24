package contas;

public class ContaEspecial extends ContaBancaria{
	
	private double limiteDeCredito = 500;

	public ContaEspecial(String numeroConta, String nomeCliente, double saldo, double limiteDeCredito) {
		super(numeroConta, nomeCliente, saldo);
		this.limiteDeCredito = limiteDeCredito;
	}

	public ContaEspecial(String numeroConta, String nomeCliente, double saldo) {
		super(numeroConta, nomeCliente, saldo);
	}

	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}

	@Override 
	
	public void sacar (double valor) {
		if(valor > 0) {
			if(valor <= getSaldo()) {
				setSaldo(getSaldo() - valor);
				limiteDeCredito += getSaldo();
				System.out.printf("Saque concluído com sucesso! saldo após o saque: R$ %.2f%n", getSaldo());
			} else {
				System.out.println("Saldo insuficiente!");
			}
			
		} else {
			System.out.println("Não tem como sacar valores negativos!");
		}
	}
}
