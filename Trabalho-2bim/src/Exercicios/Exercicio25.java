package Exercicios;

import java.util.Scanner;

public class Exercicio25 {
	static private Scanner x;

	public static void main(String[] args) {
		x = new Scanner(System.in);
		int quantidade = 0;
		System.out.println("Digite a quantidade de Numeros Pell");
		quantidade = x.nextInt();
		int Cont = 0;
		Pell(quantidade, Cont);
	}

	static void Pell(int quantidade, int Cont) {
		if (quantidade > Cont) {
			System.out.println("Pell -> " + NumerosPell(Cont));
			Cont++;
			Pell(quantidade, Cont);
		}
	}

	static int NumerosPell(int valor) {
		if (valor == 0) {
			return valor;
		}
		if (valor == 1) {
			return valor;
		} else {
			return 2 * NumerosPell(valor - 1) + NumerosPell(valor - 2);
		}
	}
}