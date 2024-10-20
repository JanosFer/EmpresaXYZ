package controller;

public class Cliente {
	private long CPF;
	private String nome;
	private int idade;
	private double limiteCredito;
	
	public long getCPF() {
		return CPF;
	}
	public void setCPF(long cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	@Override
	public String toString() {
		return getCPF() + ";" + getNome() + ";" + getIdade() + ";" + getLimiteCredito() + "\n";
	}
}
