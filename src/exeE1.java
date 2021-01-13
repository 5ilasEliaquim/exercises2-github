import java.util.Locale;
import java.util.Scanner;

public class exeE1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double base, altura, area;
		
		
		System.out.println("informe a base do triangulo: ");
		base = sc.nextDouble();
		System.out.println("informe a altura do triangulo: ");
		altura = sc.nextDouble();
		
		area = (base *altura)/2;
		
		System.out.println("A Area do triangulo é :" + area);
		
		sc.close();

	}

}
