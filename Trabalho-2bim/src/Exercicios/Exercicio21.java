package Exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Quantos numeros deseja? ");
		int a = in.nextInt();
		int i = 1;
		int resultado = 2;
		NumeroTriangular(a, i, resultado);
	}

	private static void NumeroTriangular(int a, int i, int resultado) {
		System.out.println(i);
		--a;
		i += resultado;
		++resultado;
		if (a >= 1) {

			NumeroTriangular(a, i, resultado);
		}
	}
}