package principal;

import java.util.Scanner;

import entidades.Aluno;

public class Principal {
	public static void main(String[] args) {
		float []vetorDeNotas;
		String nomeAluno;
		int nroAluno;
		Scanner lerDados = new Scanner(System.in); 
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do Aluno: ");
		nomeAluno = lerDados.next();
		aluno.setNome(nomeAluno);
		
		System.out.println("Informe o número do Aluno: ");
		nroAluno = lerDados.nextInt();
		aluno.setNumero(nroAluno);
		
		System.out.println("Informe a quantidade de provas: ");
		vetorDeNotas = new float[lerDados.nextInt()];
		
		for(int i = 0; i < vetorDeNotas.length; i++) {
			System.out.printf("\nInsira a nota[%d]: ",i);
			vetorDeNotas[i] = lerDados.nextFloat(); 	
		}
		
		aluno.setNotas(vetorDeNotas);
		System.out.println(aluno.toString());
		
		
		lerDados.close();
	}
}
