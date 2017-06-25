package Exercicios;

import java.util.Scanner;

public class Exercicio16 {
	private static Scanner x;

	public static void main(String[] args) {
		x = new Scanner(System.in);
		String[] vetorAluno = new String[11];
		int b = 1;
		int Contador = 1;
		int Contador2= 1;

			Nomes(vetorAluno,b,Contador);
			Imprimir(vetorAluno,b,Contador);
		
	}

	static void Nomes(String[] vetorAluno, int b, int Contador) {
		if (Contador <= 10) {
			System.out.println("Digite o " + Contador + " Nome: ");
			vetorAluno[b] = x.nextLine();
			b++;
			Contador++;
			Nomes(vetorAluno, b, Contador);
		}
		
	}
	static void Imprimir(String[] vetorAluno, int b, int Contador){
		if (b <= 10) {
			System.out.println( b + "º Nome: " + vetorAluno[b]);
			b++;
			Imprimir(vetorAluno,b,Contador);
		}
	}
	

}
