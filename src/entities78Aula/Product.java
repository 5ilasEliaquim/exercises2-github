package entities78Aula;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;

	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	
	/**1� um objeto N�O deve expor nenhum atributo ou seja temos que alterar de public para private
	 * PRIVATE significa que o atributo n�o pode ser acessado por outras classes
	 * 
	 * 2� S� podem ser acessados por meio de gets e sets **/
	
	/**3� Para acessarmos os atributos ter� que ser por metodos **/
	
	/**4� por padr�o o metodo responsavel por obter o atributo, vai ser o metodo que vai ter o nome get seguido do nome do atributo
	 * getAtributo (tem que esta em camel case)**/
	
	/**5� o metodo para acessar o name vai ser o gatName(), como name � do tipo String
	 * o metodo getName() vai ter que retornar uma string e a implementa��o do metodo vai ser para retornar
	 * o atributo name **/
	
	public String getName() {
		return name;
	}
	
	
	/**6� para alterarmos o valor do atributo, ser� com o metodo setAtributo (tamb�m em camel case)**/
	
	/**7� Como o metodo � para alterar o valor do atributo , esse metodo n�o retorna nada, por isso � void 
	 * e vai ter que receber um valor para o atributo, ou seja , vai ter que ter parametros os metodos 
	 * 
	 * public void->vazio setName-> nome em camel case (String name-> valor recebido )**/
	
	/**8� Recebendo esse valor, o metodo vai atribuir para o atributo do objeto o valor recebido
	 * logo this.name = name; **/
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**Lembrando que n�o criamo o metodo set pois apenas ser� alterado entrada e saida com os metodos adicionais
	 * assim protegemos para n�o ter inconsistencia **/
	
	public int getQuantity() {
		return quantity;
	}
	
	
	
	/*******M�TODOS ADICIONAIS ********/
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity = this.quantity + quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity = this.quantity - quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) /** PARA MODIFICAR A SAIDA DO NUMERO **/
				+ quantity + "units, Total: $" + String.format("%.2f", totalValueInStock());
	}

}
