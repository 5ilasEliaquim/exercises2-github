package exercicios;

import java.util.Scanner;

import entitiesexercicios.Rent;

public class exe6Rent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Rent[] vect = new Rent[n];
		
		for(int i = 0; i<vect.length;i++) {
			
			sc.nextLine();
			System.out.println("Name");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room");
			int room = sc.nextInt();
			
			vect[i] = new Rent(name, email, room);
				
		}
		
		System.out.println("Busy rooms");
		System.out.println();
		
		for(int i= 0; i <vect.length;i++) {
			
			if(vect[i]!=null) {
			System.out.println(vect[i]);
			}
		}
		
		
		sc.close();

	}

}
