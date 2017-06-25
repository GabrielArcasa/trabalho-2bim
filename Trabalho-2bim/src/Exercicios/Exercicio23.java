package Exercicios;

import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int numeroMaior;
		int numeroMenor;

		System.out.println("Fale o Maior Numero:");
		numeroMaior = x.nextInt();
		System.out.println("Fale o Menor Numero:");
		numeroMenor = x.nextInt();

		System.out.println("O MCD é de : " + Euclides(numeroMaior, numeroMenor));

	}

	static int Euclides(int a, int b) {
		if (b == 0) {
			return a % b;
		}
		int c = a % b;
			if (c==0){
				return b;}
			
		else {
			return Euclides(a, c);
		}
	}
}
