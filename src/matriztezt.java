import java.util.Scanner;

public class matriztezt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/*PRIMEIRO VOC� DEVE LER A QUANTIDADE DE LINHAS E COLUNA*/
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		/* PARA MOSTRAR QUE � UMA MATRIZ VOC� DEVE 
		 * COLOCAR O TIPO QUE � A MATRIZ E O NOME
		 * LOGO, O TIPO � int[][] (ISSO MOSTRA QUE � UMA MATRIZ) 
		 * mat (ESSE � O NOME DA MATRIZ)
		 * VAI RECEBER UMA NOVA MATRIZ COM O TAMANHO DAS VARIAVEIS DECLARADAS
		 * POR ISSO ESTA new int [][]; */
		
		
		int [][] mat = new int[m][n];
		
		/*PARA ACESSAR AS POSI��ES VOC� DEVE CRIAR UM FOR PARA ACESSAR AS POSI��ES 
		 * LINHA POR LINHA E O MESMO COM COLUNA
		 * LINHA SER� i E COLUNA SER� j */
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				
				/* A SAIDA SEMPRE DEVE SER A LINHAxCOLUNA (I e J) */
				mat [i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0; j<n;j++) {
				/* ISSO IRA IMPRIMIR A MATRIZ ACESSANDO AS POSI��ES */
				
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}


		sc.close();
	}
}
