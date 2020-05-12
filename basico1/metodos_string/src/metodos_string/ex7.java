package metodos_string;

import javax.swing.JOptionPane;

public class ex7 {	
	
	public static void main(String[] args) {
		
		String palavra ="";
		
		do {
			palavra = JOptionPane.showInputDialog("Digite uma palavra terminada em \"ar\"");
			if(palavra.endsWith("ar")) {
				String palavraConjugada = palavra.subString(0,palavra.length() -2).concat("ou");
				JOptionPane.showMessageDialog(null,palavraConjugada);
			}
			
			else {
				JOptionPane.showMessageDialog(null,"Palavra inválida");
			}
			
		}while(!palavra.endsWith("ar"));
	}

}
