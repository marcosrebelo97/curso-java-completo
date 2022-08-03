package entities;

public class Conta {
	
	private String numConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta (String numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		depositoConta(depositoInicial);
	}
	
	public Conta (String numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositoConta (double deposito) {
		saldo += deposito;
	}
	
	public void saqueConta (double saque) {
		saldo -= saque + 5.0;
	}
	
	public String toString(){
		return "Account " + numConta + 
				", Holder: " + nomeTitular +
				", Balance: $" + String.format("%.2f", saldo);
	}

	
}
