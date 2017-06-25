package Exercicios;

public class Exercicio06 {
	   public static void main(String[] args) {

	        NumeroPar();
	    }

	    static int x = 0;

	    static public void NumeroPar(){

	        System.out.println(x +", ");
	        x += 2;

	        if(x <= 100){
	            NumeroPar();
	        }
	    }

	}
