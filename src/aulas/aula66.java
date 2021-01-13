package aulas;

import java.util.Locale;
import java.util.Scanner;

import entities66aula.Product;

public class aula66 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		/**2º começamos o programa declarando uma variavel com o tipo que criamos de classe
		 * lembrando que como criamos um variavel do tipo product usaremos ela
		 * então Product variavel = new Product (); **/
		
		Product product = new Product();
		
		/**3º solicitamos os dados neste programa que é o principal
		 * logo pedimos o que desejamos calcular, este progama é para adcionar produtos ao estoque**/
		
		System.out.println("Enter the Product data	");
		System.out.println(" Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock");
		product.quantity = sc.nextInt();
		
		/**Aula 68 **/
		System.out.println();
		System.out.printf("Product data ", product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock");
		
		/***Criamos uma variavel para receber a quantidade e assim alterarmos o objeto*/
		
		int quantity = sc.nextInt();
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
