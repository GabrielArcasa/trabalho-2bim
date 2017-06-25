package Exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		int a = 100;

		Numer(a);
	}

	public static void Numer(int a) {
		System.out.println(a + ",");
		if (a > 1) {
			Numer(a - 1);
		}
	}
}
