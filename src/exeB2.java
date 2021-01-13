import java.util.Locale;
import java.util.Scanner;

public class exeB2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sal, nvSal,aum;

		System.out.println("Informe o salario do funcionário");
		sal = sc.nextDouble();

		if (sal < 1000) {
			aum = sal * 0.25;
			nvSal = sal + aum;
			System.out.printf("Novo salário %.2f" , nvSal);
		} else if (sal >= 1000 && sal <= 2000) {
			aum = sal * 0.15;
			nvSal = sal + aum;
			System.out.printf("Novo salário %.2f ",nvSal);
		} else if (sal > 2000) {
			aum = sal * 0.10;
			nvSal = sal + aum;
			System.out.printf("Novo salário %.2f " , nvSal);
		}

		sc.close();

	}

}
