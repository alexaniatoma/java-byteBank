
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(222, 111);
		contaCorrente.deposita(100.0);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		CalculadorDeImposto calculo = new CalculadorDeImposto();
		calculo.registra(contaCorrente);
		calculo.registra(seguroDeVida);
		
		System.out.println(calculo.getTotalImposto());
		
	}

}
