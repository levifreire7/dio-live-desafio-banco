
public class Main {

	public static void main(String[] args) {
		
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		
		Conta cc = new ContaCorrente(maria);		
		Conta poupanca = new ContaPoupanca(maria);
		
		cc.depositar(100);
		cc.transferir(poupanca, 100);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
