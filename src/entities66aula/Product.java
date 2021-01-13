package entities66aula;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	
	/**1�  Criamos o metodo para adicionar e retirar  ao estoque
	 * o nome do metodo com inicio com letra minuscula **/
	
	/**o valor total  � o pre�o x total no estoque */
	
	
	/*** OS METODOS DA OPERA��O **/
	public double totalValueInStock() {
		return price*quantity;
	}
	
	/**ESSE METODO ALTERA A QUANTIDADE DE PRODUTOS NO ESTOQUE
	 * O METODO PEGA O PARAMETRO PASSADO E USA NO METODO PARA NOSSOS ATRIBUTOS**/
	public void addProducts(int quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity = this.quantity - quantity;
	}
	
	/**AULA 67 **/
	
	/**Toda classe em java � uma subclasse da classe Object**/
	/**o tipo Object tem algumas opera��es padr�o como o getClass() que retorna o tipo do objeto**/


	/*Para mostrarmos como queremos que o objeto toString funciona podemos sobre-escrevelo da seguinte forma
	 * tipo retorno dele toString
	 * lembrando que la no programa principal n�o � necess�rio o objeto de l� chamar a fun��o toString pois o java reconhece naturalmente*/
	
	public String toString() {
		return name + ", $ " 
					+String.format("%.2f", price) /**PARA MODIFICAR A SAIDA DO NUMERO**/
					+quantity
					+"units, Total: $"
					+String.format("%.2f",totalValueInStock());
	}


}
