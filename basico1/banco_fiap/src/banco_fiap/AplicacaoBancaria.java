package banco_fiap;

import java.time.LocalDate;

public class AplicacaoBancaria {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alexandre");
		aluno.setCpf("123.456.789-00");
		LocalDate dataDeNascimento = LocalDate.of(1985, 1, 16); //16/01/1985
		aluno.setDataNascimento(dataDeNascimento);

		Conta conta = new Conta();
		conta.setSaldo(1000);
		conta.setNumeroConta("923931");
		conta.setSenha("1234");
		conta.setTitular(aluno);
		
		CaixaEletronico caixaeletronico = new CaixaEletronico();
		caixaeletronico.setContaAtiva(conta);
		
		
		System.out.print("Nome do Aluno: " + conta.getTitular().getNome()+".");
		caixaeletronico.depositar(200);
		
		caixaeletronico.imprimirDadosConta();

	}
}
