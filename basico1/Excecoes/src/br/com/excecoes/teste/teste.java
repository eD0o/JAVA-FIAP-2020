package br.com.excecoes.teste;

import javax.swing.JOptionPane;

//Exce��o: AQUILO QUE A GENTE N�O CONTROLA

public class teste {
	public static void main(String[] args) {
		
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digita um n�mero a�: "));
		}catch(Exception e) {
			System.out.println("Deu ruim");
		}
		catch(NullPinterException e) {
			System.out.println("Objeto nulo.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
