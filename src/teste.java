import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		double x,y;
		
		x =0;
		y =0;
		
		while(x < 5) {
			y = x*3;
			System.out.println(y);
			x = x +1;
						
		}

		System.out.println("Fim");
		
		sc.close();

	}

}
