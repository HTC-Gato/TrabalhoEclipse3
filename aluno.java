package exercicio3;

import java.util.Scanner;
public class Aluno {
	String nome, turma, cpf;
	int idade;
	Telefone telefone;
	public Scanner in = new Scanner(System.in);
	public Aluno(String nome, int idade, String cpf, String turma, Telefone telefone) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.turma = turma;
		this.telefone = telefone;
	}
	
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}


	public Aluno lerAluno() {
		System.out.println("Digite o nome do aluno: ");
		String nome = in.nextLine();
		System.out.println("Digite a idade do aluno: ");
		int idade = in.nextInt(); in.nextLine();
		System.out.println("Digite o cpf do aluno: ");
		String cpf = in.nextLine();
		System.out.println("Digite a turma do aluno: ");
		String turma = in.nextLine();
		Telefone tel = new Telefone("").lerTelefone();
		Aluno a = new Aluno(nome, idade, cpf, turma, tel);
		System.out.println("Aluno registrado");
		return a;
	}


	public void setTelefone(Telefone telefone2) {
		// TODO Auto-generated method stub
		
	}


	public char[] getNome() {
		// TODO Auto-generated method stub
		return null;
	}


	public char[] getCpf() {
		// TODO Auto-generated method stub
		return null;
	}


	public char[] getMatricula() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getTelefone() {
		// TODO Auto-generated method stub
		return null;
	}
}



