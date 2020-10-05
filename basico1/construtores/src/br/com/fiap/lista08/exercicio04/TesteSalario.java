package br.com.fiap.lista08.exercicio04;

public class TesteSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado empregado = new Empregado();
		
		empregado.setNome("João");
		empregado.setSalario(5400);
		empregado.setFuncao("Analista de Sistemas");
		
		empregado.aumentarSalrio(600);
	
		empregado.exibicao();
		
	}

}
