package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entitiesexercicios.Aluno;

public class exe3aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student name: ");
		String name = sc.nextLine();
		System.out.println("Enter the grades about the three semesters: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		Aluno student = new Aluno(name, n1, n2, n3);
		
		double media = student.gradeSemester();
				
		System.out.println("Final grade = " +student.gradeSemester());
				
		if(media < 60) {
			System.out.println("FAILED");
		}else {
			System.out.println("Pass");
		}
				
		sc.close();

	}

}
