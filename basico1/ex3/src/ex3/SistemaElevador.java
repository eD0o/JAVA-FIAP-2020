package ex3;

public class SistemaElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		elevador.inicializar(4, 3);
		
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		
		elevador.descer();
		
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.subir();
		elevador.subir();
	}

}