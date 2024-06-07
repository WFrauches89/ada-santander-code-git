package Basics.EstruturasCondicionais.EstruturasCondicionais.ifs;

import java.util.Scanner;

public class IfsAndSwitches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String grade;

            //if-else
            System.out.println("Qual a nota do aluno?");
            int notaRecebida = scanner.nextInt();

                if (notaRecebida >= 0 && notaRecebida < 60) {
                    grade = "D";
                } else if (notaRecebida >= 60 && notaRecebida < 70) {
                    grade = "C";
                } else if (notaRecebida >= 70 && notaRecebida < 80) {
                    grade = "B";
                } else if (notaRecebida >=80){
                    grade = "A";
                } else {
                    grade = "0";
                }

        switch (grade){
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
                    System.out.println("Aluno em recuperação");
                    break;
            case "D":
                    System.out.println("Aluno reprovado");
                    break;
            default: System.out.println("Entre com uma nota válida");
        }


        System.out.println("                             ");
        System.out.println("Fim do programa!");

    }
}
