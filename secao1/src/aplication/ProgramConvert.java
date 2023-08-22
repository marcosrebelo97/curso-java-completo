package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramConvert {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.printf("Amount many dollars will be bought? ");
		double comprado = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(price, comprado));
	}

}
