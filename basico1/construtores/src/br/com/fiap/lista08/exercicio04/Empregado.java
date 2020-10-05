package br.com.fiap.lista08.exercicio04;

public class Empregado {
	
	private String nome;
	private String funcao;
	private float salario;
	
	
	public Empregado() {
		// TODO Auto-generated constructor stub
	}
	
	public Empregado(String nome, String funcao, float salario) {
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}
	

	public float aumentarSalrio(float valorAumento) {
		
		setSalario(getSalario()+valorAumento);
		
		return getSalario();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void exibicao() {
		
		System.out.println("Nome: " + getNome() + ", Função: " + getFuncao() + ", Salário: " + getSalario());
		
	}
	
	
	
}
