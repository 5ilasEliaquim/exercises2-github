import java.util.Scanner;

public class matrizteztexe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		
		int[][] mat = new int[x][x];
		
		for(int i=0; i<x;i++) {
			for(int j=0; j<x;j++) {
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.print("Diagonal Princpal \n"); 
		
		for(int i=0; i<x;i++) {
			for(int j=0; j<x;j++) {
				
				System.out.print( mat[i][i] +" ");
				
				}
			System.out.println();
		}
		
		int cont = 0;
		
		for(int i=0; i<x;i++) {
			for(int j=0; j<x;j++) {
				if(mat[i][j]<0) {
					cont = cont + 1;
				}
			}
		}
		
		System.out.println("Quantidade de negativos = "+  cont);
		sc.close();

	}

}
