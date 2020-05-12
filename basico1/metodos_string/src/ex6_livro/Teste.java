package ex6_livro;

public class Teste {

	public static void main(String[] args) {

		Livro livro = new Livro();
		
		livro.setTituloOriginal("Lord of the Rings");
		livro.setTituloPtBR("Senhor dos Anáis");
		livro.setAnoPublicacao(1954);
		livro.setQtdPaginas(800);
		livro.setEdicao("Edição 3");
		livro.setISBN("6546416416156");
		livro.setAutor("Tolkien");
		
		
		Livro livro1 = new Livro();
		
		livro1.setTituloOriginal("Game of Thrones");
		livro1.setTituloPtBR("Guerra dos Tronos");
		livro1.setAnoPublicacao(2019);
		livro1.setQtdPaginas(2019);
		livro.setEdicao("Edição 5");
		livro.setISBN("74984948948984-321");
		
		System.out.println(livro.retornaLivros());
		System.out.println(livro1.retornaLivros());

		
	}

}
