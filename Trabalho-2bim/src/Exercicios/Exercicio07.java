package Exercicios;

public class Exercicio07 {
	   public static void main(String[] args) {

	        NumeroPar();
	    }

	    static int x = 1;

	    static public void NumeroPar(){

	        System.out.println(x +", ");
	        x += 2;

	        if(x <= 100){
	            NumeroPar();
	        }
	    }

	}
