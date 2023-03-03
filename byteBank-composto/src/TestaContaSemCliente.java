

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaAlexania = new Conta();
		System.out.println(contaAlexania.getSaldo());
		
		contaAlexania.titular = new Cliente();
		System.out.println(contaAlexania.titular);
		
		contaAlexania.titular.nome = "Alexania";
		System.out.println(contaAlexania.titular.nome);
		
	}
	

}
