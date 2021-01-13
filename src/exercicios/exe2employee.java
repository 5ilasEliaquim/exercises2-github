package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entitiesexercicios.employee;

public class exe2employee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		employee empregado = new employee();
		
		System.out.println("Enter the employee name");
		empregado.name = sc.nextLine();
		System.out.println("Enter the gross salary ");
		empregado.GrossSalary = sc.nextDouble();
		System.out.println("Enter the tax which we have to apply ");
		empregado.tax = sc.nextDouble();
		System.out.printf("Employee " + empregado);
		
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		empregado.increaseSalary(percentage);
		
		System.out.println("Updated employee data" + empregado);
		
		sc.close();
	}

}
