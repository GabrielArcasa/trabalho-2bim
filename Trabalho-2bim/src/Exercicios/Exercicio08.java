package Exercicios;

public class Exercicio08 {

	   public static void main(String[] args) {

	        NumeroPar();
	    }

	    static int x = 100;

	    static public void NumeroPar(){

	        System.out.println(x +", ");
	        x -= 2;

	        if(x >= 0){
	            NumeroPar();
	        }
	    }

	}
