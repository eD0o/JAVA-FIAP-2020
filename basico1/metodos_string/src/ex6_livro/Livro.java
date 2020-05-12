package ex6_livro;

import java.time.LocalDate;

public class Livro {
	
	//atributos
	
	private String ISBN;
	private String tituloOriginal;
	private String tituloPtBR;
	private String autor;
	private int qtdPaginas;
	private String edicao;
	private int anoPublicacao;
	
	//construtores
	
	//métodos específicos
	
	public String retornaLivros() {
		return "Título: ".concat(getTituloOriginal())
				.concat(", Título em Português: ")
				.concat(getTituloPtBR());
	}
	
	//getters e setters

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getTituloPtBR() {
		return tituloPtBR;
	}

	public void setTituloPtBR(String tituloPtBR) {
		this.tituloPtBR = tituloPtBR;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
}
