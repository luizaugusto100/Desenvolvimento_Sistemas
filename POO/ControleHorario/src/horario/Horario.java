package horario;

public class Horario {
	int hora, minuto, segundo;

	public Horario() {
		hora = 00;
		minuto = 00;
		segundo = 00;
	}

	public Horario(int hora, int minuto, int segundo) {
		if (
				(hora >= 0 && hora <= 23) && 
				(minuto >= 0 && minuto <= 59) && 
				(segundo >= 0 && segundo <= 59)
			) {
			this.hora = hora;
			this.minuto = minuto;
			this.segundo = segundo;
		} else {
			System.out.println("Valores inválidos");
		}

	}

	public void exibir() {
		System.out.print(hora < 10 ? "0" + hora + ":" : hora + ":");
		System.out.print(minuto < 10 ? "0" + minuto + ":" : minuto + ":");
		System.out.println(segundo < 10 ? "0" + segundo : segundo);
	}
	
	public int calcularSegundos() {
		return (hora * 3600) + (minuto * 60) + segundo;

	}

}
