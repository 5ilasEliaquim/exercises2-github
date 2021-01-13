package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entitiesexercicios.CurrencyDollar;

public class exe4Dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price");
		double tax = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double doll = sc.nextDouble();
				
		System.out.printf("Você ira pagar R$ " + CurrencyDollar.transformDoll(doll, tax));
		
		
		
		
		
		
		sc.close();

	}

}
