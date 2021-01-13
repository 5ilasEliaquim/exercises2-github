package aulas;

import java.util.Locale;
import java.util.Scanner;

import entities78Aula.Product;



public class Aula78Encapsulamento {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Product data	");
		System.out.println(" Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		Double price = sc.nextDouble();
		System.out.println("Quantity in stock");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		/**9� Agora para modificarmos o nome n�o podemos apenas chamar os atributos ter� que ser por meio dos metodos**/
		
		/**10� o argumento tem que colocar o valor que voc� deseja **/
		
		/**11� ou seja agora n�o podemos mais chamar o objeto e o atributo que queriamos, tudo ser� por metodo
		 * logo product.name n�o funciona se quiser alterar tem que ser com setName e se quiser mostrar o valor ser com o getName()**/
		
		product.setName("Computer");
		System.out.println("Updated name: "+ product.getName());
		product.setPrice(1200);
		System.out.println("Updated price "+ product.getPrice());
		
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
