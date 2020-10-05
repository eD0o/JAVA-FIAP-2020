package br.com.excecoes.beans;

/*
 * Regras para um Beans/Javabeans/DTO/TO/Model/Modelo
 * 1� Todos os Atributos devem ser privados
 * 2� Um construtor com par�metros e um sem par�metros (com super)
 * 3� Todo atributo deve ter um getter e um setter
 */

public class Aluno {
	private int rm;
	private String nome;
	
	public Aluno(int rm, String nome) {
		super();
		this.rm = rm;
		this.nome = nome;
	}

	public Aluno() {
		//heran�a
		//inst�ncia de objeto
		super();
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
