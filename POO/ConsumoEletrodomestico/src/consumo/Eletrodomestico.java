package consumo;

public class Eletrodomestico {
	String nome;
	double potenciaWatts, horasPorDia;
	
	public Eletrodomestico() {
		nome = "";
		potenciaWatts = 0;
		horasPorDia = 0;
	}

	public Eletrodomestico(String nome, double potenciaWatts, double horasPorDia) {
		this.nome = nome;
		this.potenciaWatts = potenciaWatts;
		this.horasPorDia = horasPorDia;
		
	}
	
	public double consumoDiarioWh() {
		return potenciaWatts * horasPorDia; 
		
	}
	
	public double consumoMensalWh() {
		return consumoDiarioWh() * 30; 
		
	}
	
	public double consumoAnualWh() {
		return consumoMensalWh() * 12; 
		
	}
	
	public double gastoMensal(double precoKwh) {
		return (consumoMensalWh() /1000) * precoKwh; 
		
	}
	
	public void exibirRelatorio(double precoKwh) {
		System.out.println("Nome: " + nome);
		System.out.printf("Potência: %.2f W%n" , potenciaWatts);
		System.out.printf("Uso diário: %.2f horas%n", horasPorDia);
		System.out.printf("Consumo diário: %.0f Wh%n", consumoDiarioWh());
		System.out.printf("Consumo mensal: %.0f Wh%n", consumoMensalWh());
		System.out.printf("Consumo Anual: %.0f Wh%n", consumoAnualWh());
		System.out.printf("Custo mensal: R$ %.2f%n", gastoMensal(precoKwh));
		System.out.printf("Tarifa: %.2f KWh%n", precoKwh);
	}
	
	
	
	
	
	
}
