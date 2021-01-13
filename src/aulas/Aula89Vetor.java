package aulas;

import java.util.Locale;
import java.util.Scanner;

import entities89aula.Produto;

public class Aula89Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/***FAZER UM PROGRAMA PARA LER UM NUMERO INTEIRO N E OS DADOS (NOME E PREÇO) DE N PRODUTOS. 
		 * ARMAZENE OS PRODUTOS EM UM VETOR . EM SEGUIDA, MOSTRAR OS PREÇOS MEDIOS DO PRODUTO***/
	
		int n = sc.nextInt();
		
		/**TEREMOS QUE CRIAR UM VETOR DE PRODUTOS, POR ISSO TEMOS QUE TER UMA CLASSE **/
		
		Produto[] vect = new Produto[n]; /**NESSE CASO TEMOS UM VETOR DO TIPO REFERENCIA, POIS O VETOR APONTA PARA AS N POSIÇÕES PASSADAS**/
		
		/**COMO AS POSIÇÕES INICIAM COM VALOR NULO TEREMOS QUE FAZER AS POSIÇÕES APONTAREM PARA O OBJETO**/
		
		for(int i=0; i <n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect [i] = new Produto(name, price);/**ASSIM CRIAMOS O OBJETO E COLOCAMOS ELE DENTRO DO VETOR **/	
		}
		
		double soma = 0;
		for(int i = 0; i<n; i++) {
			soma = soma + vect[i].getPreco();/**PARA ACESSAR O ATRIBUTO CORRETO TEMOS QUE CHAMAR O METODO DE ACESSO DELE,
			NO CASO COMO QUEREMOS O PREÇO É O GETPRICE()**/
		}
		
		double media = soma /n;
		
		System.out.printf("Avarage price = %.2f%n ", media);
		
		sc.close();
	}

}
