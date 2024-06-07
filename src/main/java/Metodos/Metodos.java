package Metodos;

import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {

        String nome;

        System.out.println("Qual seu nome? ");
        Scanner scn = new Scanner(System.in);

        nome = scn.nextLine();



        System.out.println("Olá "+nome+". Vamos realizar uns cálculos, responda com s para sim e n para não.");

        String confirm = scn.next();


        int primNumber = 0;
        int secNumber = 0;

        if(confirm.equalsIgnoreCase("s")){
            System.out.println("Para soma digite a");
            System.out.println("Para subtração digite s");
            System.out.println("Para divisão digite d");
            System.out.println("Para multiplicação digite m");
            System.out.println("Qual o tipo de cálculo faremos:");


            String sinal = scn.next();
            scn.nextLine();


            System.out.println("Sinal escolhido: "+sinal);

            System.out.println("Primeiro número: ");
            primNumber = scn.nextInt();
            System.out.println("Segundo número: ");
            secNumber = scn.nextInt();


            switch (sinal){

                case "a":

                    System.out.println("O resultado é:"+soma(primNumber,secNumber));
                    break;
                case "s":
                    System.out.println("O resultado é:"+sub(primNumber,secNumber));
                    break;
                case "m":
                    System.out.println("O resultado é:"+mult(primNumber,secNumber));
                    break;
                case "d":
                    System.out.println("O resultado é:"+divis(primNumber,secNumber));
                    break;
                default:
                    System.out.println("digite uma operação válida.");

            }
        }


        saudacao(nome);
    }

    private static Float divis(int numberOne, int numberTwo) {
        return (float) numberOne / numberTwo;
    }

    private static Integer mult(int numberOne, int numberTwo) {
        return  numberOne * numberTwo;
    }

    private static Integer sub(int numberOne, int numberTwo) {
        return  numberOne - numberTwo;
    }

    private static int soma(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    private static void saudacao(String paramNome) {
        System.out.printf("Até mais, %s!",paramNome);
    }


}
