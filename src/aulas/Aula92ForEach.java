package aulas;

public class Aula92ForEach {

	public static void main(String[] args) {
		
		/**SINTAXE OPCIONAL E SIMPLIFICADA PARA PERCORRER AS COLE��ES**/
		/**
		 * FOR(TIPO APELIDO : COLE��O){
		 *    COMANDO 1;
		 *    COMANDO 2;
		 *    }
		 * **/
		
		String[] vect = new String[] {"Maria" ,"Bob","Alex"}; /**isso instancia um vetor ja com as posi��es preenchidas**/
		
		for(int i= 0;i <vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		for(String obj: vect) {
			System.out.println(obj); /**chamar o obj � o mesmo que chamar vect[i]**/
		}
		
		
	}

}
