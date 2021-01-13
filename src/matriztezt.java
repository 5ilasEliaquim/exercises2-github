import java.util.Scanner;

public class matriztezt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/*PRIMEIRO VOCÊ DEVE LER A QUANTIDADE DE LINHAS E COLUNA*/
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		/* PARA MOSTRAR QUE É UMA MATRIZ VOCÊ DEVE 
		 * COLOCAR O TIPO QUE É A MATRIZ E O NOME
		 * LOGO, O TIPO É int[][] (ISSO MOSTRA QUE É UMA MATRIZ) 
		 * mat (ESSE É O NOME DA MATRIZ)
		 * VAI RECEBER UMA NOVA MATRIZ COM O TAMANHO DAS VARIAVEIS DECLARADAS
		 * POR ISSO ESTA new int [][]; */
		
		
		int [][] mat = new int[m][n];
		
		/*PARA ACESSAR AS POSIÇÕES VOCÊ DEVE CRIAR UM FOR PARA ACESSAR AS POSIÇÕES 
		 * LINHA POR LINHA E O MESMO COM COLUNA
		 * LINHA SERÀ i E COLUNA SERÁ j */
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				/* A SAIDA SEMPRE DEVE SER A LINHAxCOLUNA (I e J) */
				mat [i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0; j<n;j++) {
				/* ISSO IRA IMPRIMIR A MATRIZ ACESSANDO AS POSIÇÕES */
				
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}


		sc.close();
	}
}
