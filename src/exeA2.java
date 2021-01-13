import java.util.Locale;
import java.util.Scanner;

public class exeA2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double n1,n2,n3,med;
		
		System.out.println("Informe a primeira nota");
		n1 =sc.nextDouble();
		System.out.println("Informe a primeira nota");
		n2 =sc.nextDouble();
		System.out.println("Informe a primeira nota");
		n3 =sc.nextDouble();
		
		med = (n1+n2+n3)/3;
		
		if (med >= 5) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
		
		
		
		sc.close();
			

	}

}
