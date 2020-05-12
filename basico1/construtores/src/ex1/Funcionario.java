package ex1;

public class Funcionario {
	private String nome;
	private long matricula;
	private Profissao profissao;
	private double salario;
	
	
	//nome da classe e os dois pontos (retorno) � o que mais diferencia construtor de m�todo
	
	public Funcionario() {
		
	}

	public Funcionario(long matricula) {
		this.matricula = matricula;
	}
	
	public Funcionario(long matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public Funcionario(long matricula,String nome, Profissao profissao) {
		this.matricula = matricula;
		this.nome = nome;
		this.profissao = profissao;
	}
	
	
	public void exibirDadosFuncionario() {
		System.out.println(
				"Nome: ".concat(getNome())
				.concat("\nMatr�cula: ").concat(String.valueOf(getMatricula()))
				.concat("\nProfiss�o: ").concat(getProfissao().getNome())
				.concat("\nSal�rio: ").concat(String.valueOf(getSalario()))
				);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
