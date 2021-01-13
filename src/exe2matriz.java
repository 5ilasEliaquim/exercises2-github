import java.util.Locale;
import java.util.Scanner;

public class exe2matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		double[][] mat = new double [N][N];
		
		for(int i = 0; i<N;i++) {
			for(int j =0; j<N;j++) {
				mat[i][j]= sc.nextDouble();
			}
		}
		
		for(int i =0; i<N;i++) {
			/*****Para quando for executado pela segunda vez o soma ser zerado*******/
			double soma = 0;
			for(int j =0; j<N;j++) {
				/***Soma 0 + o que tem na posição [i][j]***/
				soma = soma + mat[i][j];
				
			} 
			System.out.println(soma);
		}


		sc.close();
		
	}

}
