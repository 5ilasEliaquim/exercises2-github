package aulas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Aula101date {

	public static void main(String[] args) throws ParseException {
		/**A data � um numero inteiro long que guarda o hor�rio desde 01/01/1970 **/
		/**GMT � o greenwinch mean time e UTC Coordinated Universal time **/
		
		/**A  classe SimpleDateFormat ajuda a definir formatos para convers�o entre Date e String**/
		/**Pois quando o sistema recebe os dados , recebe em formato texto e por isso tem que formatar para data**/
		
		/**Para amarzenarmos nossas datas em UTC, usamos o ISO 8601 
		 * 
		 * a forma de escrever � yyyy-MM-ddTHH:mm:ssZ  / ano mes dia T hora minuts segundos Z 
		 * 
		 * e ai quando formos mostrar os dados ai enviamos de forma formatada**/
		
		
		/**1� Criamos um padr�o de formata��o **/
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		/**Agora vamos formatar a saida usando o sdf2**/
		System.out.println("y1 " + sdf2.format(y1));
		System.out.println("y2 " +sdf2.format(y2));
		
		/** Para criarmos uma data com o hor�rio atual **/
		
		Date x1 = new Date();
		System.out.println("x1 " + sdf2.format(x1));
		
		Date x2 = new Date(System.currentTimeMillis());/**Pega o instante do sistema e transforma em millis segundos**/
		System.out.println("x2 " + sdf2.format(x2));
		
		Date x3 = new Date(0L);/**Estamos passando o tempo em millisegundos**/
		System.out.println("x3 " + sdf2.format(x3));
		
		/**PARA CRIARMOS UMA DATA AS 5 DA MANHA DE 01 DE JANEIRO 
		 * TEMOS QUE PASSAR O HORARIO EM MILISSEGUNDOS 1 SEGUNDO TEM 1000 MILISSEGUNDOS
		 * ENT�O FAZEMOS MILISEGUNDO VEZES OS 1 MINUTO X 1 HORA VEZES 5 HORAS
		 * 1000L * 60L * 60L * 5L 
		 * 
		 * ASSIM CRIAMOS O HORARIO AS 5 DA MANHA LEMBRANDO QUE NOSSO HORARIO � 3 HORAS ATRASADO
		 * LOGO SERA IMPRESSO 2 HORAS DA MANHA **/
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		System.out.println("x4 " + sdf2.format(x4));
		
		/**vamos imprimir no padr�o UTC com a iso 8601 **/
		/**Como o horario � impresso no formato da m�quina local  e para imprimirmos no horario UTC 
		 * vamos criar um simpleDateFormat informando que o time zone � o GMT **/
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("y3 " +sdf2.format(y3));
		
		
		
		System.out.println("--------------------------------------------");
		System.out.println("y1 " +y1);
		System.out.println("y2 " +y2);
		System.out.println("x1 " + x1);
		System.out.println("x2 " + x2);
		System.out.println("x3 " + x3);
		System.out.println("x4 " + x4);
		System.out.println("--------------------------------------------");
		System.out.println("y1 " + sdf2.format(y1));
		System.out.println("y2 " +sdf2.format(y2));
		System.out.println("x1 " + sdf2.format(x1));
		System.out.println("x2 " + sdf2.format(x2));
		System.out.println("x3 " + sdf2.format(x3));
		System.out.println("x4 " + sdf2.format(x4));
		System.out.println("--------------------------------------------");
		System.out.println("y1 " + sdf3.format(y1));
		System.out.println("y2 " +sdf3.format(y2));
		System.out.println("x1 " + sdf3.format(x1));
		System.out.println("x2 " + sdf3.format(x2));
		System.out.println("x3 " + sdf3.format(x3));
		System.out.println("x4 " + sdf3.format(x4));
	}

}
