import java.util.Scanner;

public class testwhile1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double op = 0;
		double pro;
		double tot = 0;
		double totcomp = 0;
				
		System.out.println("Informe o valor do produto ");
		pro = sc.nextDouble();
		
		while(pro!=0) {
			
			tot = tot + pro;
			System.out.println("Informe o valor do proximo produto ");
			pro = sc.nextDouble();
		}
		
		System.out.println("Informe a forma de pagamento; \n 1 - Cr�dito \n 2- D�bito ");
		op = sc.nextDouble();
		
		if (op == 1) {
			totcomp = tot / 4;
			System.out.printf("O valor ser� pago em 4 parcelas de %.2f \n O total da compra foi %.2f",totcomp,tot);
			
		}else if(op == 2) {
			totcomp = tot * 0.05;
			totcomp = tot - totcomp;
			System.out.printf(" O total da compra foi %.2f com 5%% de desconto, \n portanto o total a  pagar � %.2f", tot, totcomp);
		}
		
		sc.close();
		
	}

}
