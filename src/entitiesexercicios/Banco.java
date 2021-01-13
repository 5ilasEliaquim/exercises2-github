package entitiesexercicios;

public class Banco {

	private String name;
	private int number;
	private double deposito;
	
	public Banco(String name, int number, double initialDeposito) {
		this.name = name;
		this.number = number;
		deposito(initialDeposito); /**1º passamos o metodo para calcular o deposito pois a conta começa com 0 **/
		/**2º caso venha acontecer de ser necessário alterar o metodo apenas mecheremos nele e não no construtor **/
		
		/**3º Também é encapsulamento , pois estamos encapsulando a regra de deposito dentro do metodo de deposito
		 * então usamos o metodo e ai dessa forma encapsulamos apenas um ponto de alteração, casoa regra mude no futuro**/
	}
	
	public Banco(String name, int number) {
		this.name = name;
		this.number = number;	
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/***OPERAÇÕES QUE NÂO PODE SER ALTERADA E POR ISSO NÃO TEM SET **/
	public int getNumber() {
		return number;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	
	/**** METODOS ADICIONAIS *****/
	/**OS METODOS ADICIONAIS SÃO VOID E TEM QUE ALTERAR OS ATRIBUTOS DA CLASSE POR ISSO
	 * THIS.ATRIBUTO = THIS.ATRIBUTO + O QUE VAI SER PROCESSADO**/
	public void deposito(double deposito) {
		 this.deposito = this.deposito + deposito;
	}
	
	public void saque(double saque) {
		this.deposito = this.deposito - ( saque + 5 ) ;
	}
	
	public String toString() {
		return "Account"+ number 
				+", Holder: " + name 
				+ ", Balance:$ "
				+ String.format("%.2f", deposito);
	}
	
}
