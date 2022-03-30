package gftbootcamp.bank;

public class ContaPoupança extends Conta {

	public ContaPoupança(Cliente titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean transfere(double valor, Conta destino) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		System.out.println("Não é possivel realizar um saque da Conta Poupança");
		return false;
	}


}
