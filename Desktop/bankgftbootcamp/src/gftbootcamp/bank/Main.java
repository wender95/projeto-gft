package gftbootcamp.bank;

public class Main {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Wender", "090.250.839-35");
		Conta cc1 = new ContaCorrente(c1);
		
		Cliente c2 = new Cliente("izabela", "145.815.845.98");
		Conta cc2 = new ContaCorrente(c2);
		
		cc1.deposita(50);
		cc2.deposita(100);
		cc1.transfere(20, cc2);
		cc1.extrato();
		cc1.saca(40);
		
		
		
		
		
		
	}
	
	
	
}
