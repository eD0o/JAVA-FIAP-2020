package br.com.projeto.implementacao;

import javax.swing.JOptionPane;

import br.com.projeto.dao.CargoDAO;
import br.com.projeto.exception.Excecao;

public class TesteAtualizarCargo {

	public static void main(String[] args) {
		try {
			CargoDAO dao = new CargoDAO();
			
			System.out.println(dao.modifySalary(JOptionPane.showInputDialog
					("Digite o cargo: ")) + " salário(s) foi(ram) alterados(s)");

			
			dao.fechar();
		}
		
		catch(Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		}

		
	}
	

}
