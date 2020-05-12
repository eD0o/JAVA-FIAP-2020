package ex1;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profissao profissao = new Profissao();
		
		profissao.setNome("Desenvolvedor");
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setMatricula(65456);
		funcionario.setNome("Eduardo");
		funcionario.setProfissao(profissao);
		funcionario.setSalario(5000);
		
		funcionario.exibirDadosFuncionario();
		
	}

}
