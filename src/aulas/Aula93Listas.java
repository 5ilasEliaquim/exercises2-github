package aulas;

public class Aula93Listas {

	public static void main(String[] args) {
		
		/**LISTA � UMA ESTRUTURA DE DADOS HOMOGENEA E ORDENADA**/
		
		/**PODEM SER INICIADA VAZIA E OS ELEMENTOS S�O ALOCADAS SOB DEMANDA**/
		
		/**CADA ELEMENTO OCUPA UM  NO (OU NODO (TERMO TECNICO)) DA LISTA**/
		
		/**TIPO (INTERFACE): LIST
		 * 
		 * listas n�o aceitam tipo primitivo : int double ...
		 * POREM O TIPO LIST N�O PODE SER INSTANCIADO POIS � DO TIPO INTERFACE
		 * 
		 *  ENT�O PRECISAMOS DE UMA CLASSE QUE IMPLEMENTA ESSA INTERFACE**/
		
		/**CLASSES QUE IMPLEMENTAM 
		 * 
		 * ARRAYLIST,LINKKEDLIST**/
		
		/**METODOS DA LISTA
		 * 
		 * 
		 * TAMANHO DA LISTA: size();
		 * INSERIR ELEMENTO NA LISTA : add(obj), add(int, obj);
		 * REMOVER ELEMENTOS DA LISTA : remove(obj), remove(int),removeIf(predicate);
		 * ENCONTRAR POSI��O DO ELEMENTO: indexOf(obj),lastIndexOf(obj);
		 * FILTRAR A LISTA COM BASE NO PREDICADO : List<Integer> result = list.stream().filter(x->x>4).collect(Collectors.toList());
		 * ENCONTRAR A PRIMEIRA OCORRENCIA COM BASE EM PREDICADO: Integer result = list.stram().filter(x-> x > 4 ).findFirst().orElse(null);
		 * 
		 * 
		 * **/
		
	}

}
