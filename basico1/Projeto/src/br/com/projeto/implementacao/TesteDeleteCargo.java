package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.dao.CargoDAO;
import br.com.projeto.exception.Excecao;

public class TesteDeleteCargo {

	public static void main(String[] args) {
		try {
			CargoDAO dao = new CargoDAO();
			
			if(dao.delete(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID a ser deletado: "))) ==0) {
				System.out.println("ID não encontrado");
			}
			
			else {
				System.out.println("Você apagou com sucesso.");
			}
			dao.fechar();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(Excecao.tratarExcecao(e));
		}
	}

}
