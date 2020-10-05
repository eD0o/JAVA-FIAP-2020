package ex6;

public class TesteHora {

	public static void main(String[] args) {
		
		Hora hora = new Hora();
		
		hora.setHora(12);
		hora.setMinuto(40);
		hora.setSegundo(15);
		
		System.out.println(hora.obterHora());

	}

}
