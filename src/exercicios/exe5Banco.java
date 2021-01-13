package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entitiesexercicios.Banco;

public class exe5Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco pessoa; /**Temos que criar o objeto aqui para depois usarmos os construtores**/
		
		
		System.out.println("Enter the account number: ");
		int number = sc.nextInt();
		System.out.println("Enter the Account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (Y = 1 /N = 2 )? ");
		char response = sc.next().charAt(0); /**PARA VALIDARMOS A RESPOSTA**/
		
		if(response == 'y') {
			
			System.out.println("Enter the initial deposit ");
			double deposito = sc.nextDouble();
			pessoa = new Banco(name, number, deposito);
					
		}else {
			
			pessoa = new Banco(name, number);
			System.out.println("Account data "+ pessoa);
		}		
		
		System.out.println();
		System.out.println("Account data "+ pessoa);
		System.out.println("Enter a deposit value: ");
		double dep = sc.nextDouble();
		/**Alocado o valor em um variavel so colocar o metodo para calcular o valor de entrada**/			
		pessoa.deposito(dep);		
		System.out.println("Updated Account data " + pessoa);
		System.out.println("Enter a withdraw value: ");
		dep = sc.nextDouble();
		pessoa.saque(dep);
		System.out.println("Updated Account data " + pessoa);
				
		sc.close();

	}

}
