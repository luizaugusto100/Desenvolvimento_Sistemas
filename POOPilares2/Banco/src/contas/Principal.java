package contas;

public class Principal {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		
		conta1.setNomeCliente("Luiz");
		
		conta1.setNumeroConta("2019182429");
		
		conta1.setSaldo(100000.00);
		
		conta1.depositar(10.00);
		
		ContaBancaria conta2 = new ContaBancaria();
		
		conta2.setNomeCliente("Luana");
		
		conta2.setNumeroConta("201249679");
		
		conta2.setSaldo(100.00);
		
		conta2.depositar(-10000.00);
		
		
		
	}

}
