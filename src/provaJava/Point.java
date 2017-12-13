//Roberto Luiz Klein Filho
package provaJava;

public abstract class Point {

	private String nome = "";
	private int valConta = 0;
	private Endereco endereco = new Endereco();
	
	public abstract void calcVal();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValConta() {
		return valConta;
	}
	public void setValConta(int valConta) {
		this.valConta = valConta;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
