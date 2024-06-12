package Algorithms;

import java.util.Scanner;

public class aulla8Exercicio {

    public static void main(String[] args) {
        chamarMenu();
    }

    private static void chamarMenu() {
        System.out.println("Bem vindo ao seu caixa eletrônico do Banco Tabajara...");
        Scanner scn = new Scanner(System.in);
        int opcao = 9;
        while(opcao!=0){
            System.out.println("Digite sua opção desejada: \n" +
                    "1 - Ver saldo;\n" +
                    "2 - Deposito;\n" +
                    "3 - Saque;\n" +
                    "0 - Sair;");
            opcao = scn.nextInt();
            chamarSwitch(opcao);
        }
    }

    private static void chamarSwitch(int opcao) {
        Scanner scn = new Scanner(System.in);

        switch (opcao){

            case 1:
                double saldo = Funcoes.verSaldo();
                System.err.println("Saldo atual: R$"+saldo);
                break;
            case 2:
                System.out.println("Qual o valor a ser depositado: \n");
                double valor = scn.nextDouble();
                Funcoes.deposito(valor);
                break;
            case 3:
                System.out.println("Qual o valor a ser sacado: \n");
                double valorSaq = scn.nextDouble();
                Funcoes.sacar(valorSaq);
                break;
            case 0:
                break;
            default:
                System.err.println("Digite uma opção válida!");
        }
    }

    public static class Funcoes{

        static double saldo;

        private static double verSaldo() {
            return saldo;
        }
        private static void deposito(double valor) {
            saldo += valor;
        }
        private static void sacar(double valor) {
            if(saldo == 0) {
                System.err.println("Realize um depósito...");
            };
            if(valor <= saldo){
                saldo -= valor;
                System.out.println("operação realizada com sucesso...");
            } else {
                System.err.println("Saldo insuficiente...");
                System.err.println("Saldo atual: R$"+saldo);
            }
        }
    }
}
