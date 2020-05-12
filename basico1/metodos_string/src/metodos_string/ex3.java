package metodos_string;

import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		char primeiraLetra = palavra.toUpperCase().charAt(0);
		palavra = palavra.substring(1, palavra.length()).toLowerCase();
		JOptionPane.showMessageDialog(null,"A palavra em minúsculo é: " + primeiraLetra + palavra);
	}
}
