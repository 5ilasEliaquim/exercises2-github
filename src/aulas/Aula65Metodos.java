package aulas;

import java.util.Locale;
import java.util.Scanner;

import entities64aula.Triangle;

public class Aula65Metodos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y; 
		
		x = new Triangle();
		y = new Triangle();
	
		System.out.println("Informe as medidas do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Informe as medidas do triangulo Y");
		y.a= sc.nextDouble();
		y.b= sc.nextDouble();
		y.c= sc.nextDouble();
	
		
		/** 1º Essa parte de calculo tem que ser calculada na area triangulo e não aqui no codigo principal **/
		
		/* Codigo antigo */
		/* double p = (x.a +x.b+x.c)/2;
		* double areaX = Math.sqrt(p*(p - x.a)*(p - x.b)*(p - x.c));
		*
		* p = (y.a +y.b+y.c)/2;
		* double areaY = Math.sqrt(p*(p - y.a)*(p - y.b)*(p - y.c));
		*/
		
		double areaX = x.Area();
		double areaY = y.Area();
		
		System.out.printf("AreaX",areaX);
		System.out.printf("AreaX",areaY);
		
		
		
		if(areaX > areaY) {
			System.out.println("Larger area X");
		}else {
			System.out.println(" Larger area Y ");
		}
				
		sc.close();


	}

}
