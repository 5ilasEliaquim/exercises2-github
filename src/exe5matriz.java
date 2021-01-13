import java.util.Scanner;

public class exe5matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][]  matA = new int [M][N];
		int[][]  matB = new int [M][N];
		int[][]  matC = new int [M][N];
		
		for(int i =0; i<M; i++) {
			for(int j = 0; j<N ; j++) {
				matA[i][j] = sc.nextInt();
			}
			
		}
		
		for(int i =0; i<M; i++) {
			for(int j = 0; j<N ; j++) {
				matB[i][j] = sc.nextInt();
			}
			
		}
		
		
		
		for(int i =0; i<M; i++) {			
			for(int j = 0; j<N ; j++) {
				
				matC[i][j] = matA[i][j] + matB[i][j];
			}
						
		}
		/**** SEMPRE LEMBRAR QUE DEVE FAZER UM FOR PARA IMPRIMIR A SUA MATRIZ***/
		for(int i =0; i<M; i++) {			
			for(int j = 0; j<N ; j++) {
				
				System.out.print(matC[i][j] + " "); 
			}
			System.out.println();			
		}
		
		sc.close();

	}

}
