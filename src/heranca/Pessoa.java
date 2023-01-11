package heranca;

public class Pessoa {
	
	private String nome;
	private int matricula;
	private int idade;
	
	public Pessoa(String nome, int matricula, int idade) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}
	
	public Pessoa() {
		
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
