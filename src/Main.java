import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<>();

		contas.add(new ContaCorrente(new Cliente("cliente1")));
		contas.add(new ContaCorrente(new Cliente("clinete2")));
		contas.add(new ContaPoupanca(new Cliente("cliente3")));
		contas.add(new ContaPoupanca(new Cliente("cliente4")));
		contas.add(new ContaCorrente(new Cliente("cliente3")));
		contas.add(new ContaPoupanca(new Cliente("cliente5")));
		contas.add(new ContaCorrente(new Cliente("cliente6")));


		for (Conta conta : contas) {
			System.out.println(String.format("Cliente: %s - Saldo: %.2f", conta.cliente.getNome(), conta.getSaldo()));
		}
		

		Cliente venilton = new Cliente("Venilton");
		
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
