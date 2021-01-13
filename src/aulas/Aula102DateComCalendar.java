package aulas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Aula102DateComCalendar {

	public static void main(String[] args) {
		/**para somar uma unidade de tempo**/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		/***para acrescentarmos 4 horas na data passada**/
		/** 1º usamos o objeto calendar**/
		Calendar cal = Calendar.getInstance();
		/**2º usamos a operação setTime passando a data que esta com nome de d
		 * 
		 * ou seja temos o calendario  que esta com minha data passada dentro dele **/	
		cal.setTime(d);
		/**Agora vamos passar ao calendario o que queremos acrescer no caso é as horas do dia 
		 * então colocamos calendar.hourofday e o tanto que queremos no caso é 4 horas **/
		cal.add(Calendar.HOUR_OF_DAY, 4);
		/**Agora para atualizarmos a variavel **/
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		/**Agora para obtermos uma unidade de tempo
		 * 
		 * ou seja, como pego apenas os minutos das datas passadas? **/
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
		Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf2.format(d));
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		int minutes = cal2.get(Calendar.MINUTE);
		int month = 1 + cal2.get(Calendar.MONTH);/**O mes 0 e janeiro então para imprimirmos certo temos que acrescer + 1  **/
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
				
	}

}
