package Exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
System.out.println("Digite o Numero para Calcular o Fibonacci:");
		Integer x = input.nextInt();
		
		System.out.println(Fibo(x));
	}
	static Integer Fibo (Integer x)
	{
		if (x <=1)
		{
			return 1;
		}
		else{
			return Fibo(x-1) + Fibo(x-2);
		}
}
}
