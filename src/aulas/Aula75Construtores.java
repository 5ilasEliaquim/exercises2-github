package aulas;

import java.util.Locale;
import java.util.Scanner;

import entities75Aula.Product;

public class Aula75Construtores {

	public static void main(String[] args) {

		/**
		 * 1º o construtor executa no momento da instanciação do objeto, quando fazemos
		 * o Object object = new Object
		 * 
		 * esse new é a instanciação
		 **/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter the Product data	");
		System.out.println(" Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		Double price = sc.nextDouble();
		System.out.println("Quantity in stock");
		int quantity = sc.nextInt();
		
		/**4º aqui estamos obrigando o programador informar os dados para o nosso construtor
		 * e assim protege que seja criado um produto sem nome preço e quantidade**/
		
		Product product = new Product(name, price, quantity);
		

		System.out.println();
		System.out.printf("Product data ", product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock");

		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.printf("Product data updated", product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.printf("Product data updated", product);

		sc.close();

	}

}
