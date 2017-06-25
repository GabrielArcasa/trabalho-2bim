package Exercicios;
import java.util.Scanner;
public class Exercicio24 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

        System.out.println("digite o numero de Discos: ");
        int Disco = x.nextInt();

        Movimentodisco(Disco, "Primeiro", "Ultimo", "Meio");
    }

    private static void Movimentodisco(int Disco, String Primeiro, String Meio, String Ultimo) {
        if( Disco > 0 ) {
        	Movimentodisco(Disco-1, Primeiro, Ultimo, Meio);
            
            System.out.printf("%s para %s\n", Primeiro, Meio);
            
            Movimentodisco(Disco-1, Ultimo, Meio, Primeiro);
        }
    }
}