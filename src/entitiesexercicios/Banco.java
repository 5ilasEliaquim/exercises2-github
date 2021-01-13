package entitiesexercicios;

public class Banco {

	private String name;
	private int number;
	private double deposito;
	
	public Banco(String name, int number, double initialDeposito) {
		this.name = name;
		this.number = number;
		deposito(initialDeposito); /**1� passamos o metodo para calcular o deposito pois a conta come�a com 0 **/
		/**2� caso venha acontecer de ser necess�rio alterar o metodo apenas mecheremos nele e n�o no construtor **/
		
		/**3� Tamb�m � encapsulamento , pois estamos encapsulando a regra de deposito dentro do metodo de deposito
		 * ent�o usamos o metodo e ai dessa forma encapsulamos apenas um ponto de altera��o, casoa regra mude no futuro**/
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
	
	/***OPERA��ES QUE N�O PODE SER ALTERADA E POR ISSO N�O TEM SET **/
	public int getNumber() {
		return number;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	
	/**** METODOS ADICIONAIS *****/
	/**OS METODOS ADICIONAIS S�O VOID E TEM QUE ALTERAR OS ATRIBUTOS DA CLASSE POR ISSO
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
