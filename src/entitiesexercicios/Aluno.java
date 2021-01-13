package entitiesexercicios;

public class Aluno {

	public String name;
	public double grade;
	public double N1,N2,N3;
	
	
	public Aluno(String name, double n1,double n2,double n3) {
		this.name = name;
		this.N1 = n1;
		this.N2 = n2;
		this.N3 = n3;
	}
	
	public double gradeSemester() {
		return N1+N2+N3;
	}
	
	public void AvaregeGrade() {
		grade = ( (N1+30)+(N2+35)+(N3+35) ) / 3 ;
		
	}
	
	public String toString() {
		return name + " "+ String.format("%.2f", gradeSemester());
	}
	
	
}
