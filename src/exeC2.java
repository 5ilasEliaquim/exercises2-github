import java.util.Scanner;

public class exeC2 {

	public static void main(String[] args) {
		
		int mounth;
		
		Scanner sc  = new Scanner (System.in);
		System.out.println("Informe um numero de 1 a 12: ");
		mounth = sc.nextInt();
	
				
		if(mounth == 1) {
			System.out.println("Janeiro");
		}
		else if(mounth == 2) {
			System.out.println("Fevereiro");
		}

		else if(mounth == 3) {
			System.out.println("Março");
		}

		else if(mounth == 4) {
			System.out.println("Abril");
		}

		else if(mounth == 5) {
			System.out.println("Maio");
		}

		else if(mounth == 6) {
			System.out.println("Junho");
		}

		else if(mounth == 7) {
			System.out.println("Julho");
		}

		else if(mounth == 8) {
			System.out.println("Agosto");
		}

		else if(mounth == 9) {
			System.out.println("Setembro");
		}

		else if(mounth == 10) {
			System.out.println("Outubro");
		}

		else if(mounth == 11) {
			System.out.println("Novembro");
		}

		else if(mounth == 12) {
			System.out.println("Dezembro");
		}
	
	
		sc.close();
		
	}

}
