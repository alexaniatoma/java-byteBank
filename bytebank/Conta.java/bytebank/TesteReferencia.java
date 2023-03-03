package bytebank;

public class TesteReferencia {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Segunda conta tem saldo de: " + segundaConta.saldo);
		
		if(primeiraConta ==segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("conta diferente");
		}
	}
	
	

}
