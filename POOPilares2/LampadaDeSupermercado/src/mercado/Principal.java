package mercado;

public class Principal {

	public static void main(String[] args) {
		
		Lampada lamp1 = new Lampada();
		
		lamp1.setWatts(12.5);
		lamp1.setTipo("Led");
		lamp1.setLigado(true);
		
		Lampada lamp2 = new Lampada();
		
		lamp2.setWatts(2.5);
		lamp2.setTipo("Incandecente");
		lamp2.setLigado(false);		
		
		lamp1.exibirDados();
		lamp1.mostrarEstado();
		
		lamp2.exibirDados();
		lamp2.mostrarEstado();
	}
}