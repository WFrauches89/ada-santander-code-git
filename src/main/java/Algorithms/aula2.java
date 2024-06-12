package Algorithms;

import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        System.out.println("Qual o seu nome? ");

        Scanner scn = new Scanner(System.in);

        String nomeRecebido = scn.next();

        String saudacao = "Bom dia, "+nomeRecebido+"!";

        System.out.println(saudacao);
    }
}
