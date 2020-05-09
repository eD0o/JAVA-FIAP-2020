package metodos_string;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {

		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		JOptionPane.showMessageDialog(null,"A palavra em maiúsculo é: " + palavra.toUpperCase());
	}

}
