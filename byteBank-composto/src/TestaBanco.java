
public class TestaBanco {
	public static void main(String[] args) {
		Cliente celso = new Cliente();
		
		celso.nome = "Celso Toma";
		celso.cpf = "333.333.333.-33";
		celso.profissao = "piloto de helicoptero";
		
		Conta contaCelso = new Conta();
		contaCelso.deposita(100);
		
		contaCelso.titular = celso;
		System.out.println(contaCelso.titular.nome);
		
	}

}
