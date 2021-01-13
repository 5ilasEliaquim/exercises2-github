package entitiesexercicios;

public class CurrencyDollar {

	 
	public static double TAXA = 0.06;
	
	public static double transformDoll(double doll, double tax) {
		  double var = ( tax * doll)  * TAXA  ;
		  return (tax * doll)  + var ;
	}
	
	
	
}
