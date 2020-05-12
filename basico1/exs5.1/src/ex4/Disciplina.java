package ex4;

import javax.swing.JOptionPane;

public class Disciplina {
	
	float nota1,nota2,nota3;
	
	public float obterMedia(float media) {
		media = (nota1 + nota2 + nota3)/3;
		JOptionPane.showMessageDialog(null, "A media das notas é: " + media);
		return media;
	}


	public float getNota1() {
		return nota1;
	}


	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}


	public float getNota2() {
		return nota2;
	}


	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}


	public float getNota3() {
		return nota3;
	}


	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}
	
}
