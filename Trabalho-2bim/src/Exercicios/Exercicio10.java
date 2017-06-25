package Exercicios;

import java.util.Scanner;

public class Exercicio10 {

	private static Scanner x;

public static void main(String[] args) {
	

	 x = new Scanner(System.in);

	        int[][] MatrizTri = new int [5][5];
	        RValor(MatrizTri, 0, 0, 0);
	        Imprimir(MatrizTri, 0, 0, 0);
	        
	    }

	    private static int[][] RValor(int [][] MatrizTri, int a, int b, int c){

	        System.out.println("Digite o "+ "|" +(c + 1)+"|" +" º número da Matriz: ");
	        MatrizTri[a][b] = x.nextInt();
	        b++;
	        c++;

	         if(b == 5){
	                a++;
	                b = 0;
	            }

	            if(a > 4){
	                return MatrizTri;
	            }
	            return RValor(MatrizTri, a, b, c);
	    }

	    private static void Imprimir(int[][] MatrizTri, int a, int b, int c ){

	        System.out.print(MatrizTri[a][b] + "    ");

	        b++;
	        c++;

	            if(b == 5){
	                a++;
	                b = 0;
	            }
	                if(a < 5){
	                    Imprimir(MatrizTri, a, b, c);
	            }
	    }

	}