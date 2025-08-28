package exercicio3;

import java.util.Iterator;
import java.util.Scanner;

import exercicio3.Aluno;
import exercicio3.Telefone;

public class Principal {
	
	
	public static void main(String[] aas) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno[] vetor = new Aluno[1];
		Aluno aluno = new Aluno ();
        Telefone telefone = new Telefone();
		
		// leitura e adicionando no vetor
		for (int i = 0; i < vetor.length; i++) {
			// criando os objetos
			
			vetor[i] = aluno.lerAluno();
			vetor[i].setTelefone(telefone.lerTelefone());
			
		}
		
		// impressao
		for (Aluno a : vetor) {
			System.out.println();
			System.out.println(a.getCpf());
			System.out.println(a.getNome());
			System.out.println(a.getMatricula());
			System.out.println(((Object) a.getTelefone()));
			System.out.println(((Object) a.getTelefone()));
		}
		
		
	}
	

}
