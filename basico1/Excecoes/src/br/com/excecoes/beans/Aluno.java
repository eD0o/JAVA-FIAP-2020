package br.com.excecoes.beans;

/*
 * Regras para um Beans/Javabeans/DTO/TO/Model/Modelo
 * 1º Todos os Atributos devem ser privados
 * 2º Um construtor com parâmetros e um sem parâmetros (com super)
 * 3º Todo atributo deve ter um getter e um setter
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
		//herança
		//instância de objeto
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
