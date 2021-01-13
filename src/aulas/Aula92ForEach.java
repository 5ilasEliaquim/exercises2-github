package aulas;

public class Aula92ForEach {

	public static void main(String[] args) {
		
		/**SINTAXE OPCIONAL E SIMPLIFICADA PARA PERCORRER AS COLEÇÕES**/
		/**
		 * FOR(TIPO APELIDO : COLEÇÃO){
		 *    COMANDO 1;
		 *    COMANDO 2;
		 *    }
		 * **/
		
		String[] vect = new String[] {"Maria" ,"Bob","Alex"}; /**isso instancia um vetor ja com as posições preenchidas**/
		
		for(int i= 0;i <vect.length;i++) {
			System.out.println(vect[i]);
		}
		
		for(String obj: vect) {
			System.out.println(obj); /**chamar o obj é o mesmo que chamar vect[i]**/
		}
		
		
	}

}
