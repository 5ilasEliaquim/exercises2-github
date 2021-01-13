package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitiesexercicios.EmployeeList;

public class exe7Salario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos funcionario serão registrados");
		int n  = sc.nextInt();
		List<EmployeeList> funcionario = new ArrayList<>();
		
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.println("Enter the employee id : ");
			int id = sc.nextInt();
			
			while(hasId (funcionario,id)) {
				System.out.println("Id ja obtido");
				id=sc.nextInt();
			}
			
			
			System.out.println("Enter the employee name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter the employee Salary: ");
			double salario = sc.nextDouble();
			
			funcionario.add(new EmployeeList(id, name, salario));
		}
		
		System.out.println();
		System.out.println("Digite o id do funcionario que tera aumento de salario");
		int id = sc.nextInt();
		
		EmployeeList  emp = funcionario.stream().filter(x->x.getId()==id).findFirst().orElse(null); 
		
		if(emp == null ) {
			System.out.println("This id doesn't exist! ");
		}else {
			System.out.println("Enter the percentage");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		
		System.out.println();
		System.out.println("Listas de funcionarios: ");
		
		for (EmployeeList x: funcionario ) {
			System.out.println(x);
		}
		
		
		sc.close();

	}

	public static boolean hasId(List<EmployeeList> funcionario, int id) {
		EmployeeList  emp = funcionario.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		return emp != null;
	}
	
}
