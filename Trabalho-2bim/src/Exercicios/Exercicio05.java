package Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	  static Scanner x = new Scanner(System.in);

	    public static void main(String[] args) {

	        int[] ValorVetor = new int[10];
	        Valor(ValorVetor, 0);
	        int MaiorValor = ValorVetor[9];

	        System.out.print("O maior valor digitado é: " +ReceberValor(ValorVetor, 0, MaiorValor));


	    }

	    public static void Valor(int[] ValorVetor, int a){

	        System.out.println("Digite o " +(a + 1) +" ° Valor: ");
	        ValorVetor[a] = x.nextInt();
	        a++;

	            if(a < 10){
	                Valor(ValorVetor, a);
	            }
	    }

	    private static int ReceberValor(int[] ValorVetor, int b, int MaiorValor){

	            if(ValorVetor[b] > MaiorValor){
	                MaiorValor = ValorVetor[b];
	           }
	            b++;

	            if(b < 10){
	                return ReceberValor(ValorVetor, b, MaiorValor);
	            }
	            return MaiorValor;
	    }


			}

