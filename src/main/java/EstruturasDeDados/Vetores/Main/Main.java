package EstruturasDeDados.Vetores.Main;



import EstruturasDeDados.Vetores.Supermarket.SupermarketImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int SIZE;
        System.out.println("Qual o tamanho da lista de compras");
        SIZE = scn.nextInt();

        SupermarketImpl supermarket = new SupermarketImpl(SIZE);
        int opcao;

        do{

            System.out.println("\nLista de compras");
            System.out.println("1 - Inserir item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Remover item");
            System.out.println("4 - Sair");

            System.out.println("Escolha uma opção: ");
            opcao = scn.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = scn.next();
                    supermarket.adicionarItem(item);
                    break;
                case 2:
                    System.out.println("Listando todos os itens");
                    supermarket.listarItens();
                    break;
                case 3:
                    System.out.println("Qual o código do item que deseja remover da lista? ");
                    int idx = scn.nextInt();
                    supermarket.removerItem(idx);
                    break;
                default:
                    System.out.println("Digite uma opção válida");

            }

        } while (opcao != 4);

        scn.close();

    }

    /*
    Vantagens do uso de Vetores
    1 - Acesso direto aos elementos;
    2 - Implementação simples;
    3 - Uso eficiente de memória ( alocação )

    Desvantagens

   1 - Tamanho Fixo da lista;
   2 - Ineficiência em manipular no meio do vetor exemplo utilizar o shift()
   3 - Subutilização de memória - tamanho pre definido pode ser muito maior que a média utilizada

   Com o objetivo de sanar as desvantagens das estruturas nativas das linguagens é que surge as Estruturas de dados.
     ( Conceito TAD - Tipo Abstrato de Dados )

    Estrutura de dados :

    -Lineares:

       - Lista Ligada
            - Similar aos vetores, porém com tamanho infinito e flexível, alocado de forma dinâmica para adesão ou remoção

       - Pilhas
            - Estrutura de dados com apenas uma extremidade
            - Conceito Last In First Out - LIFO

       - Fila
            - Estrutura de dados com dupla extremidade
            - Conceito First In First Out - FIFO


    -Árvores:

        - Estrutura não linear
        - Diversas possibilidades de navegação nesta estrutura
            - Profundidade
            - Largura
            - Ordem de leitura









     */

}
