package metodos_string;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		
		JOptionPane.showMessageDialog(null,palavra.replaceAll("[AaEeOoUu]","*"));

	}

}
