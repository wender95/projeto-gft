package gftbootcamp.bank;



public class Cliente {
	private String nome;
	private String cpf;
	
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		System.out.println("Cliente cadastrado. Nome: " + nome + ", CPF: " + cpf + "\n");
		
	}

	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}


}

