import java.util.Locale;
import java.util.Scanner;

public class whiletest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;

		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;

			idade = sc.nextInt();
		}
		
		if(cont> 0) {
			double media = (double) soma /cont;
			System.out.printf("%.2f", media);
		}else {
			System.out.println("Impossivel Calcular");
		}

		sc.close();

	}

}
