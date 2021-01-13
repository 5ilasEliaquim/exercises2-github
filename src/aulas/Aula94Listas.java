package aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula94Listas {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();/**
												 * TEMOS QUE INICIAR NOSSA INTERFACE COM UM CLASSE QUE A IMPLEMENTA /
												 * temos que apertar ctrl+shift + O para importar a classe do array
												 **/

		list.add("Maria");
		list.add("Alex");
		list.add("Bod");
		list.add("Anna");

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");

		list.add(2, "Marco");
		/** MUDA O NOME PASSANDO A POSI��O **/

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------");

		System.out.println(list.size());/** Tamanho da lista **/

		list.remove("Anna");

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");

		list.remove(1);

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		
		list.removeIf(x-> x.charAt(0) =='M'); /**remover todos que come�am com M, express�o lambda: todo x que comece com M **/
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");

		System.out.println("Index of bob" + list.indexOf("Bob"))/**Caso ele n�o encontre nada relacionado o indexOf retorna -1 **/;
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		
		/**Para criarmos uma lista que retorne apenas o nome que queremos**/
		/** 1� Pegamos a lista que temos no caso a list  e vamos converter para stream , pois ele aceita opera�oes lambda, ent�o list.stream()**/
		/**2� chamamaos o metodo filter, pois o filter recebe o predicado**/
		/**3� como o stream n�o � lista temos que converer ele, ent�o chamamos o metodo collect**/
		
		List<String> result = list.stream().filter(x-> x.charAt(0)=='A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		/**Para encontrar o primeiro nome que come�a com a letra escolhida**/
		/**1� a lista � do string  ent�o temos que ter uma variavel string**/
		/**2� chamamaos o metodo filter, pois o filter recebe o predicado**/
		/**3� chamamos o metodo findFirst para pegar o primeiro elemento da express�o lambda e se n�o existir ele retornar� nulo**/
		
		String name = list.stream().filter(x->x.charAt(0)=='A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
