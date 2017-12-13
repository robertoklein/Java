//Roberto Luiz Klein Filho
package provaJava;

public class Lanche extends Point implements Verifica{

	private String prato = "";

	public String getPrato() {
		return prato;
	}

	public void setPrato(String prato) {
		this.prato = prato;
	}

	@Override
	public void validar() {
		String nomePrato = this.prato;
		System.out.println("primeira letra do prato: "+ nomePrato.charAt(0));
	}

	@Override
	public void calcVal() {
		int valorConta = this.getValConta();
		if(valorConta % 2 == 0) {
			System.out.println("O valor da conta é par");
		}else {
			System.out.println("O valor da conta é impar");
		}
	}
}
