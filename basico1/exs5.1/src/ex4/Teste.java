package ex4;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Disciplina disciplina = new Disciplina();
		Aluno aluno = new Aluno();
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
		float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3: "));
		
		aluno.atribuirNotas(nota1,nota2,nota3);
		disciplina.obterMedia(5);
				
	}
}
