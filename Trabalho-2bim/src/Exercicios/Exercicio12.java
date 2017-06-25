package Exercicios;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.println("Digite o Numero: ");
		int a = input.nextInt();
		int b = 10; 
		int c = 0;
		System.out.println(Tabuada(a,b,c));
	}
	static int Tabuada(int a , int b, int c)
	{
		if (b == 0)
		{
			return a * b;
			
		}
		else{
			c = a * b ;
			System.out.println(a +" * " + b + " = " + c);
			return Tabuada(a,b-1,c);
		}
			
			
		}
	}

