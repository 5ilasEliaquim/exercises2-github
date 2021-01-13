import java.util.Locale;
import java.util.Scanner;

public class exeD1 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sal, nvSal,aum,por;
		
		System.out.println("Informe o salario do funcionário: ");
		sal = sc.nextDouble();
		System.out.println("Informe a porcentagem de aumento que o funcionário irá receber");
		por = sc.nextDouble();
		
		aum = sal * (por/100);
		nvSal = sal + aum ;
		
		System.out.println("O salario será de " + nvSal);
		
		
		
		sc.close();
		
	}

}
