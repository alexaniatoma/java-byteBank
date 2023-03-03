
public class TesteConexao {

	public static void main(String[] args) {
		
		
		Conexao conexao = null;
		try {
			conexao  = new Conexao();
			conexao.leDados();
			conexao.fecha();
			
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexao");
		
		}finally {
			conexao.fecha();
		}
	
		
	}
		

}


