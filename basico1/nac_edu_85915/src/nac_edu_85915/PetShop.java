package nac_edu_85915;

import javax.swing.JOptionPane;

public class PetShop {
	private String nome = "OlokoBicho\n";
	private String localizacao = "Beco da Paz";
	private String telefone = "(11)99988-7766";
	private float valorServico;
	private float valorTotal;
	
	
	
	public float examinar (Animal animal) {
		
		valorServico = 70;
		
		return valorTotal += valorServico;
		
	}
	
	public float banhar (Animal animal) {
		
		if(animal.getPorte().equals("p")){
			valorServico = 40;
		}
		
		else if(animal.getPorte().equals("m")){
			valorServico = 50;
		}
		
		else if(animal.getPorte().equals("g")){
			valorServico = 60;
		}
		
		else {
			valorServico = 0;
			JOptionPane.showMessageDialog(null, "ERRO: Digite 'p', 'm' ou 'g' como porte!");
		}
		
		return valorTotal += valorServico;
	}
	
	public float vacinar(Animal animal) {
        if (animal.getTipo().equals("c") || animal.getTipo().equals("g")) {
        	valorServico = 100;
        }
        
        else if(animal.getTipo().equals("o")){
        	valorServico = 150;
        }
        
        else {
			valorServico = 0;
			JOptionPane.showMessageDialog(null, "ERRO: Digite 'c', 'g' ou 'o' como tipo!");
		}
        
        return valorTotal += valorServico;
    }
	
	public void exibirTotal() {
		JOptionPane.showMessageDialog(null,"Total dos custos: " + valorTotal);
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public float getValor() {
		return valorServico;
	}


	public void setValor(float valor) {
		this.valorServico = valor;
	}


	public float getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
