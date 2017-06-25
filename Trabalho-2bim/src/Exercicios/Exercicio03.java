package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	private static Scanner x;

	public static void main(String[] args) {
		

	x = new Scanner(System.in);

		int[] VetorNumero = new int[10];
		int i = 0;
		int Contador= 1;
		int Soma =0;
		int Divisao =0;
		
	System.out.print(Faltas(i,VetorNumero,Contador,Soma,Divisao));
	}

	static int Faltas(int i,int VetorNumero[],int Contador,int Soma,int Divisao)
	{
			if (Contador == 11){
				return Soma;
			}
			
			else{	System.out.println("Digite o numero: ");
			VetorNumero[i] = x.nextInt();
			Soma += VetorNumero[i];
			i++;
			Contador++;
			return Faltas (i,VetorNumero,Contador,Soma,Divisao);
		
			}
			
		}
}