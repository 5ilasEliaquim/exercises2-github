package aulas;

import java.util.Locale;
import java.util.Scanner;

import util70Aula.Calculator;

public class Aula70membrosEstaticos {

	public static void main(String[] args) {
		
		/**SAO MEMBROS QUE FAZEM SENTIDO INDEPENDENTE DA CLASSE**/
		/**MEMBRO ESTATICO SIGNIFICA QUE ELE FUNCIONA INDEPENDENTEMENTE DE OBJTOS DIFERENTES
		 * 
		 * MATH.SQRT � UMA CLASSE ESTATICA POIS MESMO SEM INSTANCIA PODE SER USADO
		 * 
		 * UMA CLASSE ESTATICA N�O PODE SER INSTANCIADA**/
		
		/**Na classe main voc� n�o pode chamar objetos que n�o estaticos sem instancialos 
		 * 
		 * porem se eles forem estaticos n�o precisa instancia-los pois funciona como um metodo normal**/
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); /**Para chamarmos o metodo estaticos colocamos o (nome de sua classe) . (metodo que deseja)**/
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference : %.2f", c);
		System.out.printf("Volume : %.2f", v);
		System.out.printf("PI : %.2f", Calculator.PI);
				
		
		sc.close();
		

	}

}
