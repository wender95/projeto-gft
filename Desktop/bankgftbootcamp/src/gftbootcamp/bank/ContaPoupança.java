package gftbootcamp.bank;

public class ContaPoupan�a extends Conta {

	public ContaPoupan�a(Cliente titular) {
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
		System.out.println("N�o � possivel realizar um saque da Conta Poupan�a");
		return false;
	}


}
