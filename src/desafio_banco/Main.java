package desafio_banco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		Banco banco = new Banco("Meu Banco Digital", "001");
		
		Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");
		
		cc.depositar(200);
		cc.sacar(50);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		System.out.println(cliente1);
		System.out.println(cliente2);

	}

}
