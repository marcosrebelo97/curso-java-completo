package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = null;
		
		System.out.print("Enter account number: ");
		String numConta = sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String nomeTitular = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
				
		switch (option) {
			case 'y':
				System.out.print("Enter a deposit value: ");
				double depositoInicial = sc.nextDouble();
				conta = new Conta(numConta, nomeTitular, depositoInicial);
				break;
			case 'n':
				conta = new Conta(nomeTitular, numConta);
				break;
			default:
				System.out.print("Invalided option!!!");
		}
		
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.print("Enter a deposite value: ");
		double valorDepositado = sc.nextDouble();
		conta.depositoConta(valorDepositado);
		
		System.out.print("Update account data: ");
		System.out.println(conta);

		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saqueConta(saque);

		System.out.print("Update account data: ");
		System.out.println(conta);
		
		sc.close();
		
		
	}

}
