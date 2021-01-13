package aulas;

import java.util.Locale;
import java.util.Scanner;

import entities75Aula.Product;

public class Aula75Construtores {

	public static void main(String[] args) {

		/**
		 * 1� o construtor executa no momento da instancia��o do objeto, quando fazemos
		 * o Object object = new Object
		 * 
		 * esse new � a instancia��o
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
		
		/**4� aqui estamos obrigando o programador informar os dados para o nosso construtor
		 * e assim protege que seja criado um produto sem nome pre�o e quantidade**/
		
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
