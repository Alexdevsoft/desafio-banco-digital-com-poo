package desafio_banco;

public class ContaPoupanca extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("***Extrato Conta Poupança***");
		imprimirInforComuns();
		
	}

}
