import java.util.Scanner;

public class exe3matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] mat = new int [N][N];
		
		 
		 
		 for(int i= 0;i<N;i++) {
			 for(int j = 0;j<N;j++) {
				 mat[i][j] = sc.nextInt();
			 }
		 }
		
		 for(int i= 0;i<N;i++) {
			 /**NA LINHA(i) 0, COLUNA [0] SERA ACESSADA A PRIMEIRA VARIAVEL
			  * DENTRO DA MATRIZ, OU SEJA, O VALOR QUE ESTA NA MATRIZ NA POSIÇÃO DADA
			  * SERÁ ACRESCIDA A VARIAVEL, NO CASO AQUI, A VARIAVEL 'val' **/
			 
			 int val = mat[i][0];
			 
			 for(int j = 0;j<N;j++) {
				 
				 if( mat[i][j] > val) {
					 /**SE A POSIÇÃO [I][J] FOR MAIOR QUE 'VAL'
					  * ENTÃO SERÁ ATUALIZADA A VARIAVEL 'VAL' 
					  * CASO CONTRARIO VOLTARA AO LOOPING **/
					 val = mat[i][j];
				 }
			 }
			 System.out.println(val);
		 }
		 
		
		
		sc.close();

	}

}
