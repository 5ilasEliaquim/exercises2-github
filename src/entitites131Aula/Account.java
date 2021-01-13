package entitites131Aula;

public abstract class Account {

	// se colocarmos que a classe � abstrata ela n�o poder� ser instanciada no programa principal por�m poder� ser heradada normalmente
	
	// public abstract class Account -> seria a forma de instanciala
	// � necess�rio para a regra de negocio pois mesmo n�o podendo instancia-la podemos usar como lista e assim modificar tudo o que queremos
	// temos polimofirmos e reuso
	
		private Integer number;
		private String holder;
		protected Double balance; //  deixamos protected para a outra classe poder usar o atributo por�m outras classes n�o.
		
		public Account() {
		}

		public Account(Integer number, String holder, Double balance) {
			this.number = number;
			this.holder = holder;
			this.balance = balance;
		}

		public Integer getNumber() {
			return number;
		}

		public void setNumber(Integer number) {
			this.number = number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public Double getBalance() {
			return balance;
		}

		public void deposit(double amount) {
			balance += amount;
		}
		public void withdraw(double amount) {
			balance -= amount + 5.0;
		}
	}
