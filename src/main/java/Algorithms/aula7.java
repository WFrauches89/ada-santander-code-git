package Algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aula7 {

    //Funções

    public static void main(String[] args) {
        System.out.println("Iniciando o programa... ");

        System.out.println(salvarNaLista());

        System.out.println("fim do programa...");
    }

    public static List<Integer> salvarNaLista(){
        List<Integer> armazenador = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        for(int i = 0; i <10; i++){
            System.out.println("Digite um número: ");
            int newNum = scn.nextInt();
            armazenador.add(newNum);
        }
        return armazenador;
    }

}
