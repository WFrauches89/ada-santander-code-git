package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class aula6 {

    public static void main(String[] args) {
        //Array e Loop

        List<Integer> lista = new ArrayList<>();
        int nAtual = 1;

        while (lista.size() < 20) {
            if(nAtual%2 == 0 || nAtual%5==0){
                lista.add(nAtual);

            }
            nAtual++;
        }

        System.out.println("Lista: "+lista);

        for(int i = 0; i < lista.size();i++){
            if(lista.get(i) %2 ==0){
                System.out.printf("Número da posição %s é par - %s\n",i, lista.get(i));
            }else {
                System.out.printf("Número da posição %s é ímpar - %s\n",i, lista.get(i));
            }
        }


    }


}
