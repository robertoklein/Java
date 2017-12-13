//Roberto Luiz Klein Filho
package provaJava;

public class Cine extends Point implements Verifica{

	private int qtdCad = 0;;
	private Lanche lanche = new Lanche();
	
	public int getQtdCad() {
		return qtdCad;
	}
	public void setQtdCad(int qtdCad) {
		this.qtdCad = qtdCad;
	}
	public Lanche getLanche() {
		return lanche;
	}
	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}
	
	@Override
	public void validar() {
		String nomeRua = this.getEndereco().getRua();
		if(nomeRua.length() >= 10 && nomeRua.length() <= 35) {
			System.out.println("Nome da rua do cine: "+ nomeRua);
		}else {
			System.out.println("nome da rua invalida para o cine!!");
		}
	}
	
	@Override
	public void calcVal() {
		int valorConta = this.getValConta();
		System.out.println("Valor da conta somado 10: " + valorConta + 10);
	}
	
}
