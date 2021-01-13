package aulas;

import java.util.Scanner;

public class Aula98Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[][] mat = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextDouble();
			}

		}

		System.out.println("Main diagonal");
		int soma = 0;

		for (int i = 0; i < n; i++) {

			System.out.print(mat[i][i]);

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					soma = soma + 1;
				}
			}
		}

		System.out.println("Negative Numbers" + soma);
		sc.close();

	}

}
