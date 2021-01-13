import java.util.Locale;
import java.util.Scanner;

public class testeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0) {
			if(x<y) {
				System.out.println("Ordem crescente");
			}else {
				System.out.println("Ordem decrescente");
			}
		
			 x = sc.nextInt();
			 y = sc.nextInt();
			
		}
		
		sc.close();

	}

}
