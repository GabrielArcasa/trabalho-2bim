package Exercicios;

public class Exercicio09 {
	   public static void main(String[] args) {

	        NumeroPar();
	    }

	    static int x = 99;

	    static public void NumeroPar(){

	        System.out.println(x +", ");
	        x -= 2;

	        if(x >= 0){
	            NumeroPar();
	        }
	    }

	}
