package banco_fiap;

import java.time.LocalDate;

public class Aluno {
	
	//por enquanto tudo private por conta do encapsulamento
	//m�todos getters and setters v�o deixar as vars p�blicas
	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
