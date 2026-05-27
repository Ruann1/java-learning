package crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	
	private static ArrayList<Aluno> listaAlunos = new ArrayList<>(); 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("1) Cadastrar novo aluno");
			System.out.println("2) Listar alunos");
			System.out.println("3) Atualizar aluno");
			System.out.println("4) Remover aluno");
			System.out.println("5) Sair");
		
			String opcao = sc.nextLine();
		
			switch(opcao) {
		
			case "1":
				isCadastrar(sc);
				break;
			case "2":
				exibirAlunos(sc);
				break;
			case "3":
				alterarAluno(sc);
				break;
			case "4":
				removerAluno(sc);
				break;
			case "5":
				System.out.println("Fechando Sistema.");
				sc.close();
				return;
				
			default:
				System.out.println("Opção Invalida");
			}
			
		}
	}
	
	public static void isCadastrar(Scanner sc) {

		
		System.out.println("Digite o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		
		System.out.println("Digite a matricula do aluno: ");
		Integer matriculaAluno = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o curso do aluno:");
		String cursoAluno = sc.nextLine();
		
		System.out.println();
		System.out.printf("Nome do aluno: " + nomeAluno + "\n" + "Curso do aluno: " + matriculaAluno + "\n" + "Matricula do aluno: " + cursoAluno + "\n");
		System.out.println();
		
		System.out.println("Você confirma esses dados? (S/N)");
		String confirmacao = sc.nextLine();
		
		if(confirmacao.equals("S")) {
			listaAlunos.add(new Aluno(nomeAluno, matriculaAluno, cursoAluno));
			System.out.println("Usuário cadastrado!");
		}else {
			System.out.println("Digite os dados novamente!");
		}
		
	}
	
	public static void exibirAlunos(Scanner sc) {
			
		if (listaAlunos.isEmpty()) {
		    System.out.println("Nenhum aluno encontrado!");
		    return;
		}

		for (Aluno i : listaAlunos) {
		    System.out.println(i);
		} 
		
		System.out.println();
        System.out.println("Deseja retornar ao menu? S/N");
        String resposta = sc.nextLine();
		if(resposta.equalsIgnoreCase("S")){
			
		} else {
			System.out.println("1)Para listar novamente os alunos");
			System.out.println("2)Para cadastrar um novo aluno");
			System.out.println("3)Para alterar o dado de algum aluno");
			
			String escolha = sc.nextLine();
			
			switch(escolha) {
				case "1":
					exibirAlunos(sc);
					break;
				case "2":
					isCadastrar(sc);
					break;
				case "3":
					alterarAluno(sc);
					break;
			}
		} 
	}
	
	public static void alterarAluno(Scanner sc) {
		
		for(Aluno a : listaAlunos) {
			System.out.println(a);
		}
		
		System.out.println("Deseja alterar algum cadastro? S/N");
		String alterar = sc.nextLine();
		if(alterar.equalsIgnoreCase("S")) {
			System.out.println("Digite a matricula do aluno que você deseja fazer a alteração!");
			Integer alunoMatricula = sc.nextInt();
			sc.nextLine();
			for(Aluno a : listaAlunos) {
				if(a.getMatricula() == alunoMatricula) {
					System.out.println("Escreva o novo nome:");
					String novoNome = sc.nextLine();
					
					System.out.println("Novo curso:");
					String novoCurso = sc.nextLine();
					
					a.setAluno(novoNome);
					a.setCurso(novoCurso);
					
					System.out.println("Matricula alterada com sucesso!");
					exibirAlunos(sc);
					
				}
			}
		}
		
	}
	
	public static void removerAluno(Scanner sc) {
		
		for(int a = 0; a < listaAlunos.size(); a++) {
			System.out.println(listaAlunos.get(a));
		}
		
		System.out.println("Qual a matricula do aluno você deseja remover da lista?");
		Integer removerMatricula = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < listaAlunos.size(); i++) {
			
			if(listaAlunos.get(i).getMatricula() == removerMatricula) {
				
				listaAlunos.remove(i);
	            System.out.println("Aluno removido com sucesso!");
	            return;
	            
				}else {
					System.out.println("Aluno não encontrado!");
				}
			}
		}	
}
