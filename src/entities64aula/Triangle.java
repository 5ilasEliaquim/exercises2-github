package entities64aula;

public class Triangle {
	/**0� classe � a defini��o de um tipo**/
	
	/**1� Assim como double Triangle � um tipo pois tem atributos, porem Triangle � um tipo composto**/
	/**Quando a variavel � do tipo classe temos que instanciar ela da seguinte forma 
	 * variavel = new Classe(); pois assim � criado o objeto**/
	
	public double a; /**Esses aqui s�o os objetos dessa classe e ao usarmos estamos instanciano eles**/
	public double b;
	public double c;
	
	
	
	/***2� vamos criar o metodo aqui (metodo � a mesma coisa que fun��o)
	 * para criar o metodo tem que ser o tipo de acesso (public ou private) o retorno(double , int ou ...) e a nome do metodo
	 * e se recebe parametros ou n�o como no exemplo
	 * 
	 * public double Calcular(String Nome , double x){}***/
	
	public double  Area() { 
		double p = (a +b+c)/2;
		
		/***O RETURN SERVE PARA QUE O METODO RETORNE O RESULTADO ***/
		
		return Math.sqrt(p*(p - a)*(p - b)*(p - c));
	}
}
