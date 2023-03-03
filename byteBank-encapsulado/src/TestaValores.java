
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		conta.deposita(200.00);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
;
		conta.setAgencia(1232123);
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(1337, 16500);
		
		System.out.println(Conta.getTotal());
		
	    }

}
