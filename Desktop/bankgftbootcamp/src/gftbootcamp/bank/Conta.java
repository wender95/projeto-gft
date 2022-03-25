package gftbootcamp.bank;

import java.util.Scanner;

import gftbootcamp.bank.Cliente;

public abstract class Conta {

	private static final int AGENCIA = 123;
	private static int NUMERO_GERAL = 0;
	private int numero;
	private Cliente titular;
	private int saldo;


	public Conta(Cliente titular) {

		Conta.NUMERO_GERAL++;
		this.numero += NUMERO_GERAL;
		System.out.println("Conta criada. \nTitular: " + titular.getNome() + "\nCPF: " + titular.getCpf()
				+ "\nAgencia: " + AGENCIA + "\nNumero: " + numero + "\n");

	}

	public void deposita(int valor) {
		this.saldo += valor;

	}

	public boolean saca(int valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else  {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public boolean transfere(int valor, Conta destino) {

		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}

	}
	public int getSaldo() {
		return saldo;
		
	}
	
	public void extrato() {
		System.out.println("Saldo em conta:" + getSaldo());
		
	}
}
