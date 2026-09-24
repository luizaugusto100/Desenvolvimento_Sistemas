package mercado;

public class Lampada {
	
	private Double Watts;
	private String tipo;
	private boolean ligado;
	
	
	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	public Lampada() {
		super();
	}


	public Lampada(Double watts, String tipo, boolean ligado) {
		super();
		Watts = watts;
		this.tipo = tipo;
		this.ligado = ligado;
	}


	public Double getWatts() {
		return Watts;
	}


	public void setWatts(Double watts) {
		Watts = watts;
	}


	public String getTipo() {
		return tipo;
	}

	public void ligar() {
		this.ligado = true;{
		System.out.println("Lâmpada ligada");
	}}
	
	public void mostrarEstado() {
		if(ligado == true) {
			System.out.println("Lâmpada ligada\n");
		} else {
			System.out.println("Lâmpada desligada\n");
		}
	}
	

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void exibirDados() {
		System.out.printf("Watts: %.2f%n Tipo: %S%n Estado: ", Watts, tipo);
	}
}