package desafio_banco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		cc.depositar(200);
		cc.sacar(50);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
