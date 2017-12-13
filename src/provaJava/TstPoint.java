//Roberto Luiz Klein Filho
package provaJava;

public class TstPoint {

	public static void main(String[] args) {
		
		Cine c = new Cine();
		c.setNome("cine cataratas");
		c.getLanche().setValConta(50);
		c.getEndereco().setRua("ruadocinema");
		
		System.out.println("Nome do cinema: "+ c.getNome());
		c.validar();
		c.getLanche().calcVal();
	}
}
