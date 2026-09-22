package horario;

public class Principal {

	public static void main(String[] args) {
		Horario hora1 = new Horario();

		hora1.exibir();

		Horario hora2 = new Horario();

		hora2.hora = 8 ;
		hora2.minuto = 15 ;
		hora2.segundo = 30;

		System.out.println(hora2.minuto);

		hora2.exibir();
		System.out.println(hora2.calcularSegundos());

		Horario hora3 = new Horario(14, 20, 5);
		hora3.exibir();
		System.out.println(hora3.calcularSegundos());

	}

}
