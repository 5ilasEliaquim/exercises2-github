package entities75Aula;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	
	/**2 º Os contrutores devem vir antes dos metodos
	 * 3º para criar um construtor deve colocar public e nome da classe e os parametros que deseja**/
	
	
	/**AULA 77 sobre sobrecarga**/
	
	/**SOBRECARGA È VOCÊ DISPONIBLIZAR MAIS DE UMA FORMA DE CONSTRUTOR COM MAIS OU COM MENOS PARAMETROS
	 * E OU TAMBEM COM O CONSTRUTOR PADRÃO QUE É SEM PARAMETROS E SEM REFERENCIA DENTRO.*/
	
	public Product(String name, double price){
		this.name = name;
		this.price = price;
		
	}
	
	public Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	public double totalValueInStock() {
		return price*quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity = this.quantity - quantity;
	}
	
	public String toString() {
		return name + ", $ " 
					+String.format("%.2f", price) /**PARA MODIFICAR A SAIDA DO NUMERO**/
					+quantity
					+"units, Total: $"
					+String.format("%.2f",totalValueInStock());
	}
}
