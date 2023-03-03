package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaAlexania = new Conta();
		contaAlexania.saldo = 100;
		contaAlexania.deposita(50);
		System.out.println(contaAlexania.saldo);
		
		contaAlexania.saca(20);
		System.out.println(contaAlexania.saldo);
		
		boolean conseguiuRetirar = contaAlexania.saca(20);
		System.out.println(conseguiuRetirar);
		
		Conta contaCelso = new Conta();
		contaCelso.deposita(1000);
		
		contaCelso.transfere(300, contaAlexania);
		System.out.println(contaCelso.saldo);
		System.out.println(contaAlexania.saldo);
		
		
	}
	

}
