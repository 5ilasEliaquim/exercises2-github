package entitites131Aula;

public abstract class Account {

	// se colocarmos que a classe é abstrata ela não poderá ser instanciada no programa principal porém poderá ser heradada normalmente
	
	// public abstract class Account -> seria a forma de instanciala
	// é necessário para a regra de negocio pois mesmo não podendo instancia-la podemos usar como lista e assim modificar tudo o que queremos
	// temos polimofirmos e reuso
	
		private Integer number;
		private String holder;
		protected Double balance; //  deixamos protected para a outra classe poder usar o atributo porém outras classes não.
		
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
