package ex3;

public class Elevador {
	private int andarAtual = 0;
	private int totalDeAndares;
	private int capacidade;
	private int pessoasAbordo;
	
	
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	public int getTotalDeAndares() {
		return totalDeAndares;
	}
	public void setTotalDeAndares(int totalDeAndares) {
		this.totalDeAndares = totalDeAndares;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getPessoasAbordo() {
		return pessoasAbordo;
	}
	public void setPessoasAbordo(int pessoasAbordo) {
		this.pessoasAbordo = pessoasAbordo;
	}
	
	public void inicializar(int totalDeAndares, int capacidade) {
		this.totalDeAndares = totalDeAndares;
		this.capacidade = capacidade;
		System.out.println("Iniciando elevador.");
		System.out.println("Total de andares: " + totalDeAndares);
		System.out.println("Capacidade" + capacidade);
	}
	
	public void exibirPessoasAbordo() {
		System.out.println("Quantidade de pessoas a bordo: " + pessoasAbordo);
	}
	
	public void exibirInformacaoAndar() {
		System.out.println("Andar Atual: " + andarAtual);
	}
	
	
	public void entrar() {
		if(pessoasAbordo>6) {
			setPessoasAbordo(pessoasAbordo+1);
			exibirPessoasAbordo();
		}
		
		else{
			System.out.println("Capacidade máxima atingida - por favor aguarde o próximo.");
		}
	}
	
	public void sair() {
		if(getPessoasAbordo()>0) {
			setPessoasAbordo(pessoasAbordo-1);
			exibirPessoasAbordo();
		}
		else {
			System.out.println("Não há ninguém para sair.");
		}
	}
	
	public void subir() {
		if(getAndarAtual()==totalDeAndares) {
			setAndarAtual(andarAtual+1);
			exibirInformacaoAndar();
		}
		
		else {
			System.out.println("Você já está no andar mais alto.");
		}
	}
	
	public void descer() {
		if(getAndarAtual()>0) {
			setAndarAtual(andarAtual-1);
			exibirInformacaoAndar();
		}
		
		else {
			System.out.println("Você já está no térreo.");
		}
	}
	
	
	
	
}
