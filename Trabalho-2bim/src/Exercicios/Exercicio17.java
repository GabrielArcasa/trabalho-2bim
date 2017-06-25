package Exercicios;

import java.util.Scanner;

public class Exercicio17 {
	static private Scanner x;

	public static void main(String[] args) {
		x = new Scanner(System.in);

		Integer i = 0;
		System.out.println("Digite o primeiro numero ");
		Integer soma1 = x.nextInt();
		System.out.println("Digite o Segudo numero: ");
		Integer soma2 = x.nextInt();
		Integer total = 0;
		System.out.println("A soma da multiplicação desses numeros é igual a " + SomaNaturais(soma1, soma2, total, i));
	}

	static Integer SomaNaturais(Integer soma1, Integer soma2, Integer total, Integer i) {

		if (i < Math.abs(soma2)) {

			i++;
			total += soma1;
			return SomaNaturais(soma1, soma2, total, i);
		}

		if (soma2 < 0)
			total = -total;

		System.out.println(total);
		return total;

	}

}