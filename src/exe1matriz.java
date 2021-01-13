import java.util.Scanner;

public class exe1matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		

		int M = sc.nextInt();
		int N =sc.nextInt();
		
		int[][] mat = new int [M][N];
		
		for(int i=0;i<M;i++) {
			for(int j = 0; j<N;j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.printf("Valores negativos:  ");
		
		for(int i=0;i<M;i++) {
			for(int j = 0; j < N;j++) {
				if(mat[i][j] < 0) {
				 System.out.print(mat[i][j]);				 
				}				
			}
		}
		sc.close();

	}

}
