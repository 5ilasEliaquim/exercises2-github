import java.util.Locale;
import java.util.Scanner;

public class exeC1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sal, nvSal,aum;
		
		System.out.println("Informe o salario do funcionário: ");
		sal = sc.nextDouble();
		
		aum = sal * 0.25;
		nvSal = sal + aum ;
		
		System.out.println("O salario com aumento de 25% é de " + nvSal);
		
		
		
		sc.close();
	}

}
