package entities64aula;

public class Triangle {
	/**0º classe é a definição de um tipo**/
	
	/**1º Assim como double Triangle é um tipo pois tem atributos, porem Triangle é um tipo composto**/
	/**Quando a variavel é do tipo classe temos que instanciar ela da seguinte forma 
	 * variavel = new Classe(); pois assim é criado o objeto**/
	
	public double a; /**Esses aqui são os objetos dessa classe e ao usarmos estamos instanciano eles**/
	public double b;
	public double c;
	
	
	
	/***2º vamos criar o metodo aqui (metodo é a mesma coisa que função)
	 * para criar o metodo tem que ser o tipo de acesso (public ou private) o retorno(double , int ou ...) e a nome do metodo
	 * e se recebe parametros ou não como no exemplo
	 * 
	 * public double Calcular(String Nome , double x){}***/
	
	public double  Area() { 
		double p = (a +b+c)/2;
		
		/***O RETURN SERVE PARA QUE O METODO RETORNE O RESULTADO ***/
		
		return Math.sqrt(p*(p - a)*(p - b)*(p - c));
	}
}
