package aulas;

import java.util.ArrayList;
import java.util.List;

import entitites131Aula.Account;
import entitites131Aula.SavingsAccount;

public class Aula131 {

	public static void main(String[] args) {
		
		List<Account> list = new ArrayList<>();
		
		// não podemos instanciar o account mas podemos deixar ele como um tipo de lista
		// qualquer objeto que quisermos acessar poderemos
		list.add(new SavingsAccount(1001, "Cassio", 70.0000, 00.0));
		list.add(new SavingsAccount(1002, "Ronaldo", 70.0000, 00.0));
		list.add(new SavingsAccount(1003, "Chicao", 70.0000, 00.0));
		list.add(new SavingsAccount(1004, "Douglas", 70.0000, 00.0));
		list.add(new SavingsAccount(1005, "Jadson", 70.0000, 00.0));
		
		double soma = 0;
		for(Account jog: list) {
			soma = soma + jog.getBalance();
		}
		
		System.out.println("Saldo total= "+ soma);
		
		for(Account jog: list) {
			jog.deposit(10.0);	
		}
		
		for(Account jog: list) {
			System.out.println(jog.getBalance());
		}
		

	}

}
