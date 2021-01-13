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
		/** MUDA O NOME PASSANDO A POSIÇÃO **/

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
		
		list.removeIf(x-> x.charAt(0) =='M'); /**remover todos que começam com M, expressão lambda: todo x que comece com M **/
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");

		System.out.println("Index of bob" + list.indexOf("Bob"))/**Caso ele não encontre nada relacionado o indexOf retorna -1 **/;
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		
		/**Para criarmos uma lista que retorne apenas o nome que queremos**/
		/** 1º Pegamos a lista que temos no caso a list  e vamos converter para stream , pois ele aceita operaçoes lambda, então list.stream()**/
		/**2º chamamaos o metodo filter, pois o filter recebe o predicado**/
		/**3º como o stream não é lista temos que converer ele, então chamamos o metodo collect**/
		
		List<String> result = list.stream().filter(x-> x.charAt(0)=='A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		/**Para encontrar o primeiro nome que começa com a letra escolhida**/
		/**1º a lista é do string  então temos que ter uma variavel string**/
		/**2º chamamaos o metodo filter, pois o filter recebe o predicado**/
		/**3º chamamos o metodo findFirst para pegar o primeiro elemento da expressão lambda e se não existir ele retornará nulo**/
		
		String name = list.stream().filter(x->x.charAt(0)=='A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
