package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
private static Scanner x;

public static void main(String[] args) {
	

x = new Scanner(System.in);

	int[] VetorNumero = new int[10];
	int i = 0;
	int Contador= 1;
	int Soma =0;
	int Divisao =0;
	
System.out.print(Notas(i,VetorNumero,Contador,Soma,Divisao));
}

static int Notas(int i,int VetorNumero[],int Contador,int Soma,int Divisao)
{
		if (Contador == 11){
			return Divisao = Soma/10;
		
		}else{
			System.out.println("Digite as Notas: ");
			VetorNumero[i] = x.nextInt();
			Soma += VetorNumero[i];
			i++;
			Contador++;
			return Notas (i,VetorNumero,Contador,Soma,Divisao);
		}
		
	}
}