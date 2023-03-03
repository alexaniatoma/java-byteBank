
public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(0, 0);
		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo;
		
		conta.setTitular(paulo);
		

		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		Cliente titulardaConta = conta.getTitular()
;
		titulardaConta.setProfissao("programador");
		
		System.out.println(titulardaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
		
	}

}
