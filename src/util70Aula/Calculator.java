package util70Aula;

public class Calculator {

	public static final double PI = 3.14159; /**Assim se declara uma variavel constante**/
	/**1º deixamos essa variavel constante  estatica
	 * Estatica significa que ela independe de qualquer outro objeto do tipo Calculator
	 * ou seja não precisaremos instanciar um objeto e depois chamar os metodos disponiveis para ele **/
	
	
	/**Quando os metodos não são estaticos , temos que instanciar um objeto na classe principal para assim usarmos
	 * seus metodos disponiveis **/
	
	
	
	/** Estatica significa que ela independe de qualquer outro objeto do tipo Calculator
	 * ou seja não precisaremos instanciar um objeto e depois chamar os metodos disponiveis para ele **/
	 
	public static double circumference(double radius) {
		return PI * radius;
	}
	
	public static double volume(double radius) {
		return 4 * PI * radius*radius*radius / 3;
	}
	
}
