package br.com.conexao.teste;

import java.sql.DriverManager;

public class TesteConexao {
	public static void main(String[] args) {
		//sempre colocar url, user e password
		//ORCL (mais antigos) e xe mais recentes
		//getConnection gera a conexão
		DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","rm85915","011299");
		
		//conection recebe e cria estrutura
		//statemente recebe estrutura e executa sql+
		
		
		
		
	}
}
