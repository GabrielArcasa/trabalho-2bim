package Exercicios;

import java.util.Scanner;

public class Exercicio18 {

    static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o valor do Total: ");
        double Total = x.nextDouble();

        System.out.println("Digite a taxa em % de Juros: ");
        double Juros = x.nextDouble();

        System.out.println("Digite a quantidade de parcelas: ");
        int Parcelas = x.nextInt();

        CalculoJuros(Total, Juros, Parcelas, 1);
    }

    private static void CalculoJuros(double Total, double Juros, int Parcelas, int Contador){
        if(Contador <= Parcelas){
            if(Contador >= 1){
                System.out.println(Contador + " meses = " + Total * (Juros/100) * Contador);
            }
        }
        Contador++;

        if (Contador <= Parcelas){
        		CalculoJuros(Total, Juros, Parcelas, Contador);
        }
    }

}