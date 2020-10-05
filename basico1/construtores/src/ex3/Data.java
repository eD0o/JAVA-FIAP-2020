package ex3;

public class Data {
	private int dia,mes,ano;
	
	public Data() {
		dia = 0;
		mes = 0;
		ano = 0;
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void validacaoDia() {
		if(getDia()<1 || getDia()>31) {
			System.out.println("ERRO: Dia incorreto, mudando para dia 1.");
			setDia(1);
		}
	}
	
	public void validacaoMes() {
		if(getMes()<1 || getMes()>12) {
			System.out.println("ERRO: Mês incorreto, mudando para o mês 1.");
			setMes(1);
		}
	}
	
	public void validacaoAno() {
		if(getAno()<1 || getAno()>2020) {
			System.out.println("ERRO: Ano incorreto, mudando para ano 2020.");
			setAno(2020);
		}
	}
	
	public void nomeDoMes() {
		switch(getMes()){
		case 1:
			System.out.println("Mês corrente: Janeiro.");
			break;
		case 2:
			System.out.println("Mês corrente: Fevereiro.");
			break;
		case 3:
			System.out.println("Mês corrente: Março.");
			break;
		case 4:
			System.out.println("Mês corrente: Abril.");
			break;
		case 5:
			System.out.println("Mês corrente: Maio.");
			break;
		case 6:
			System.out.println("Mês corrente: Junho.");
			break;
		case 7:
			System.out.println("Mês corrente: Julho.");
			break;
		case 8:
			System.out.println("Mês corrente: Agosto.");
			break;
		case 9:
			System.out.println("Mês corrente: Setembro.");
			break;
		case 10:
			System.out.println("Mês corrente: Outubro.");
			break;
		case 11:
			System.out.println("Mês corrente: Novembro.");
			break;
		case 12:
			System.out.println("Mês corrente: Dezembro.");
			break;
		default:
			System.out.println("Erro: caso não encontrado.");
		
		}
	}
	
	public void formatoData() {
		System.out.println(getDia() + "/" + getMes() + "/" + getAno());
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
