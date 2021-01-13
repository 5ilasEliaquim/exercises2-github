package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Aula88Vetor {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double [] vect = new double[N];
		double soma = 0;
		
		for(int i= 0; i<vect.length; i++) {
			vect[i] = sc.nextDouble();  
			
		}
		for(int i=0; i<vect.length;i++) {
			soma = soma + vect[i] ;
		}
		
		double media = soma / N;
		
		System.out.println(media);
		
		
		
		
		sc.close();

	}

}
