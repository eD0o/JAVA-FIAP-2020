package ex1;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		/* Escreva um programa em Java para calcular o sal�rio de um funcion�rio. Ao ser executado, o
		   programa dever� solicitar ao usu�rio o n�mero de horas trabalhadas e o valor da hora de trabalho
		   e ent�o dever� exibir no console o sal�rio a ser pago. Para o c�lculo do sal�rio utilize a seguinte
		   f�rmula:
	 	   salario = horas trabalhadas * valor da hora de trabalho
		 */
		
		
	    int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
	    float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora de trabalho: ")); 
	    float salario = horasTrabalhadas*valorHora;
	    JOptionPane.showMessageDialog(null,"Seu sal�rio ser� de: " + salario);
		
	}
}
