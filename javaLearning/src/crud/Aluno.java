package crud;

public class Aluno {

	private String aluno;
	private int matricula;
	private String curso;
	
	public Aluno(String aluno, int matricula, String curso) {
		
		this.aluno = aluno;
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
    public String toString() {
        return "📘 Nome: " + aluno + " | Matrícula: " + matricula + " | Curso: " + curso;
    }
	
	public static void metodoAlterar() {
		
		
		
	}
	
}
