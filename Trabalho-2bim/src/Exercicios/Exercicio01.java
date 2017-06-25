package Exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;

		Numer(a, b);
	}

	static int Numer(int a, int b) {
		System.out.println(b + ",");
		if (a > b) {
			return Numer(a, b + 1);
		}
		else{
			return b;
		}
	}
}