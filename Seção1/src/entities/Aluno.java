package entities;

public class Aluno {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public String situAluno() {
		if (finalGrade() >= 60.0) {
			 return "\nPASS";
		}else {
			double notaFinal = 60.0 - finalGrade();
			return "\nFAILED" + "\nMISSING " + String.format("%.2f", notaFinal) + " POINTS";
		}		
	}
	
	public String toString() {
		return "FINAL GRADE = " 
				+ String.format("%.2f", finalGrade())
				+ situAluno();	
	}

}
	
