package nac_edu_85915;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		PetShop petshop = new PetShop();
		
		JOptionPane.showMessageDialog(null,
				"Bem-vindo ao PetShop " + petshop.getNome() + 
				"\n Estamos no endereço: " + petshop.getLocalizacao() +  " com o telefone: " + petshop.getTelefone() +
				"\n ~~~~~~~~PREÇOS~~~~~~~~" + 
				"\n Examinar R$70\n" + 
				"\n Banhos:" + 
				"\n - Porte pequeno R$40" + 
				"\n - Porte médio R$50" + 
				"\n - Porte grande R$60\n" + 
				"\n Vacinar: " + 
				"\n - Cachorro e Gato R$100" + 
				"\n - Outros R$150"
				);
		JOptionPane.showMessageDialog(null,"Para responder as perguntas, digite '1' para SIM e '2' para NÃO");
		
		int qtdAnimais = Integer.parseInt(JOptionPane.showInputDialog("Quantos animais serão cuidados?"));
		
		while(qtdAnimais<1) {
			qtdAnimais = Integer.parseInt(JOptionPane.showInputDialog("ERRO [NÃO PODE SER MENOR QUE 0]: Quantos animais serão cuidados?"));
		}
		
		int resposta;
		
		for(int i=1;i<=qtdAnimais;i++) {
						
			animal.setNome(JOptionPane.showInputDialog("Qual o nome do pet " + i + " ?"));
				animal.setTipo(JOptionPane.showInputDialog("O " + animal.getNome() + " é cachorro, gato ou outro? - (c/g/o)?"));
				animal.setPorte(JOptionPane.showInputDialog("Qual o porte do " + animal.getNome() + " - (p/m/g)?"));	
			
						
			resposta = 1;
			while(resposta == 1) {
				
				int op = Integer.parseInt(JOptionPane.showInputDialog("Qual opção você deseja?" + 
						"\n 1 -> Examinar R$70\n" + 
						"\n 2 -> Banhos:" + 
						"\n - Porte pequeno R$40" + 
						"\n - Porte médio R$50" + 
						"\n - Porte grande R$60\n" + 
						"\n 3 -> Vacinar: " + 
						"\n - Cachorro e Gato R$100" + 
						"\n - Outros R$150\n" +
						"\n 4 -> Total"
						));
				
				switch(op) {
					case 1:
						petshop.examinar(animal);
						break;
					case 2:
						petshop.banhar(animal);
						break;
					case 3:
						petshop.vacinar(animal);
						break;
					case 4:
						petshop.exibirTotal();
						break;
					default:
						JOptionPane.showMessageDialog(null,"Digite corretamente as opções de 1 - 4");
						break;
						
				}
				resposta = Integer.parseInt(JOptionPane.showInputDialog("Deseja mais algum serviço? (1 - SIM/2 - NÃO)"));
			}
		}
		petshop.exibirTotal();
    }	
}
