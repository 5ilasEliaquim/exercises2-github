package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entitiesexercicios.Rectangle;

public class exe1Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter the height of rectangle");
		rectangle.Height = sc.nextDouble();
		System.out.println("Enter the height of rectangle");
		rectangle.Width = sc.nextDouble();
		
		double area = rectangle.Area();
		double perimetro = rectangle.Perimeter();
		double diagonal = rectangle.Diagonal();
		
		System.out.printf("Area = " + area);
		System.out.println();
		System.out.printf("Perimetro = "+ perimetro);
		System.out.println();
		System.out.printf("Diagonal = "+ diagonal);
				
		
		sc.close();

	}

}
