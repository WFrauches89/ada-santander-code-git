package Algorithms;

import java.util.Scanner;

public class aula3 {

    public static void main(String[] args) {

        System.out.println("Primeiro valor:");

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        System.out.println("Segundo valor:");
        int n2 = scn.nextInt();

        System.out.println(somar(n1, n2));
    }

    //Tipos de dados
    int numbers;
    double floatNumbers;

    String text;

    boolean valido;
    

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }
}
