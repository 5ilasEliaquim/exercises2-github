package entitiesexercicios;

public class EmployeeList {

	private int id;
	private String name;
	private double salario;
	
	
	
	public EmployeeList(int id, String name, double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalario() {
		return salario;
	}
	
	
	/***MÉTODOS ADICIONAIS**/
	
	public void increaseSalary(Double increase) {
		increase = this.salario * ( increase /100);
		this.salario = this.salario + increase;
	}
	
	public String toString() {
		return id+ ", "+name+", "+ salario; 
	}
}
