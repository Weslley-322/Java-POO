package oficina;

public abstract class Pessoa {
	private String nome;
	private String CPF;
	public Pessoa(String nome, String CPF) {
		this.nome = nome;
		this.CPF = CPF;
	}
	public String getNome() {
		return this.nome;
	}
	public String getCPF() {
		return this.CPF;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	@Override
	public String toString() {
		return "Informações da Pessoa:\nNome: "+this.nome + "\nCPF: " + this.CPF;
	}
}


