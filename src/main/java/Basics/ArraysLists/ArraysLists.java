package Basics.ArraysLists;

import java.util.Arrays;

public class ArraysLists {

    public static void main(String[] args) {

        int[] numeros = {15, 25, 44, 13, 125};

        System.out.printf("Tamanho do array: %s",numeros.length);
        System.out.println(" ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int menor = numeros [0];
        int maior = numeros[0];
        float media = 0;

        for (int i = 0; i < numeros.length; i++){
            if(maior < numeros[i]){
                maior = numeros[i];
            }
            if(menor > numeros[i]){
                menor = numeros[i];
            }

            media += (float) numeros[i];

        }

        System.out.println("Menor valor: "+menor);
        System.out.println("Maior valor: "+maior);
        System.out.println("Média valor: "+media/ numeros.length);

    }
}
