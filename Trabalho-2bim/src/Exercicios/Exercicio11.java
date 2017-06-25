package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
	
	  static Scanner input = new Scanner(System.in);

	    public static void main(String[] args) {

	        int[][][] matriz = new int [5][5][5];
	        rValor(matriz, 0, 0, 0, 0);
	        Imprimir(matriz, 0, 0, 0, 0);

	    }

	    private static int[][][] rValor(int [][][] matriz, int x, int y, int z, int c){

	        System.out.println("Digite o " +(c + 1) +" º número da matriz: ");
	        matriz[x][y][z] = input.nextInt();
	        z++;
	        c++;

	            if(z == 5){
	                y++;
	                z = 0;
	            }

	            if(y == 5){
	                x++;
	                y = 0;
	            }

	            if(x > 4){
	                return matriz;
	            }
	            return rValor(matriz, x, y, z, c);
	    }

	    private static void Imprimir(int[][][] matriz, int x, int y, int z, int c ){

	        System.out.print(matriz[x][y][z] + "    ");

	        z++;
	        c++;

	            if(z == 5){
	                y++;
	                z = 0;
	            }

	            if(y == 5){
	                x++;
	                y = 0;

	            }
	                if(x < 5){
	                    Imprimir(matriz, x, y, z, c);
	            }
	    }

	}