package Exercicios;
import java.util.Scanner;

public class Exercicio20 {
public static void main(String[] args) {
	

	Integer num;
	Scanner Fato = new Scanner(System.in);
	
	System.out.println("Informe a Fatorial: ");
	 num = Fato.nextInt();
	System.out.println("A Fatorial do numero " + num + " é igual a " + fatorial(num));
}
		public static Integer fatorial(int a){
	 if(a <= 1){	
	 	return 1;
	      }else{ return a * fatorial (a-1);
 
 			}
		}
	}

