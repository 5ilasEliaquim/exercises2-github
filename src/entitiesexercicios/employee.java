package entitiesexercicios;

public class employee {

	public String name;
	public double GrossSalary;
	public double tax;
	
	public double netSalary() {
		return  GrossSalary - tax ;
	}
	
	public void increaseSalary(double percentage) {
		percentage = this.GrossSalary * (percentage / 100);
		this.GrossSalary = this.GrossSalary + percentage;
	}
	
	public String toString() {
		return name +", $"
				+String.format("%.2f", netSalary());
	}
	
}
