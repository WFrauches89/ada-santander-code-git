package Basics.EstruturasCondicionais.EstruturasCondicionais.ifs;

import java.util.Scanner;

public class IfsAndWhiles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int exit = 1;

        while(exit != 0) {
            //if-else
            System.out.println("Qual a nota do aluno?");
            int notaRecebida = scanner.nextInt();
            if(notaRecebida <0 && notaRecebida >100) {
                System.out.println("Nota inválida");
            } else {
                if (notaRecebida >= 0 && notaRecebida < 60) {
                    System.out.println("                             ");
                    System.out.println("Aluno reprovado");
                    System.out.println("                             ");
                } else if (notaRecebida >= 60 && notaRecebida < 70) {
                    System.out.println("                             ");
                    System.out.println("Aluno recuperação");
                    System.out.println("                             ");
                } else {
                    System.out.println("                             ");
                    System.out.println("Aluno aprovado");
                    System.out.println("                             ");
                }
            }
            System.out.println(" -----> Se deseja sair pressione 0 <-----");
            System.out.println("                             ");
            System.out.println(" -----> Se deseja continuar tecle qualquer número <-----");
            exit = scanner.nextInt();
        }

        System.out.println("                             ");
        System.out.println("Fim do programa!");

    }
}
