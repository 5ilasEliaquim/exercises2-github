import java.util.Locale;
import java.util.Scanner;

public class exeB1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n1,n2,n3,med;
		
		System.out.println("informe a primeira nota");
		n1 = sc.nextInt();
		System.out.println("informe a Segunda nota");
		n2 = sc.nextInt();
		System.out.println("informe a terceira nota");
		n3 = sc.nextInt();
		
		med = ((n1+40)+(n2+50)+(n3+60))/150;
		
		System.out.println("A m�dia �: " + med);
		sc.close();

	}

}
