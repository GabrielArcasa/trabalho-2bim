package Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	  static Scanner x = new Scanner(System.in);

	    public static void main(String[] args) {

	        int[] ValorVetor = new int[10];
	        Valor(ValorVetor, 0);
	        int MenorValor = ValorVetor[9];

	        System.out.print("O menor valor digitado é: " +ReceberValor(ValorVetor, 0, MenorValor));


	    }

	    public static void Valor(int[] ValorVetor, int a){

	        System.out.println("Digite o " +(a + 1) +" ° Valor: ");
	        ValorVetor[a] = x.nextInt();
	        a++;

	            if(a < 10){
	                Valor(ValorVetor, a);
	            }
	    }

	    private static int ReceberValor(int[] ValorVetor, int b, int MenorValor){

	            if(ValorVetor[b] < MenorValor){
	                MenorValor = ValorVetor[b];
	           }
	            b++;

	            if(b < 10){
	                return ReceberValor(ValorVetor, b, MenorValor);
	            }
	            return MenorValor;
	    }


			}
