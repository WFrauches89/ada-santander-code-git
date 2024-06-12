package Algorithms;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class aula4 {

    //Condicionais

    public static void main(String[] args) {
        System.out.println("Qual sua idade: ");

        Scanner scn = new Scanner(System.in);

        int idade = scn.nextInt();

        if(idade >= 18 ){
            System.out.println("Pode retirar a carteira de motorista");
        } else {
            System.out.printf("Infelizmente você ainda deve aguardar %s anos para tirar carteira.",(18-idade));
        }


    }
}
