package classes;

public class CadastroPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();

		
		pessoa1.setNome("Eduardo");
		pessoa1.setAltura(1.80F);
		pessoa1.setIdade(20);
		
		System.out.println("Nome pessoa 1: " + pessoa1.getNome());
		System.out.println("Altura pessoa 1: " + pessoa1.getAltura());
		System.out.println("Idade pessoa 1: " + pessoa1.getIdade());
		
		pessoa2.setNome("Ricardo");
		pessoa2.setAltura(1.85F);
		pessoa2.setIdade(26);
		
		System.out.println("\nNome pessoa 2: " + pessoa2.getNome());
		System.out.println("Altura pessoa 2: " + pessoa2.getAltura());
		System.out.println("Idade pessoa 2: " + pessoa2.getIdade());
		
		pessoa3.setNome("Fábio");
		pessoa3.setAltura(1.77F);
		pessoa3.setIdade(30);
		
		System.out.println("\nNome pessoa 3: " + pessoa3.getNome());
		System.out.println("Altura pessoa 3: " + pessoa3.getAltura());
		System.out.println("Idade pessoa 3: " + pessoa3.getIdade());
		
		
	}

}
