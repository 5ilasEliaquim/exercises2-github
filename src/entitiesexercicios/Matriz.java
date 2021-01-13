package entitiesexercicios;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int [][] mat = new int [M][N];
		
		for(int i =0; i<M;i++) {
			for(int j =0; j<N;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();
		
		for(int i = 0; i< M; i++) {
			for(int j=0; j<N; j++ ) {
				
				if(num == mat[i][j]) {
					
					System.out.println(" Position "+ i +j );
					
					if(j > 0 ) {
						System.out.println(" Left " + mat[i][j-1] );
					}
					
					if(j< mat.length - 1) { 
					System.out.println(" Right "+ mat[i][j+1] );
					}
					if(i>0) {
					System.out.println(" UP "+  mat[i-1][j] );
					}
					
					if(j<mat.length - 1) {
					System.out.println(" Down "+  mat[i+1][j] );
					}
					
				}
			}
		}
		
		
		sc.close();
		
		}

}
