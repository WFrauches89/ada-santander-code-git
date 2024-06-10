package EstruturasDeDados.ListaLigada.Main;

import EstruturasDeDados.ListaLigada.ListaLigada;

public class Main {

    public static void main(String[] args) {
        ListaLigada ownList = new ListaLigada("primeiro elemento");
        System.out.println("**********Tamanho***********");
        ownList.getLength();
        System.out.println("******************************");
        ownList.getHead();
        ownList.getTail();
/*
        ownList.makeEmpty();

        ownList.getLentgh();

 */
        ownList.append("segundo elemento");
        ownList.append("terceiro elemento");
        System.out.println("**********Tamanho***********");
        ownList.getLength();

        System.out.println("**********Lista**************");
        ownList.printList();
        System.out.println("******************************");
        System.out.println("");
        System.out.println("***********Removendo Last**************");
        ownList.removeLast();
        ownList.getLength();
        System.out.println("******************************");
        ownList.printList();
        System.out.println("");
        System.out.println("***********Inserindo First**************");
        ownList.prepend("Último elemento lançado");
        ownList.printList();
        ownList.getHead();
        ownList.getTail();

        System.out.println("***********Removendo First**************");
        ownList.removeFirst();
        ownList.getLength();
        ownList.printList();
        ownList.getHead();
        ownList.getTail();
        System.out.println("******************************");

        System.out.println("***********Get By Indíce**************");
        ownList.getByIdx(1);
        System.out.println("******************************");

        System.out.println("***********Insert By Indíce**************");
        ownList.getHead();
        ownList.getTail();
        ownList.insertByIdx(2, "Elemento intruso");
        ownList.printList();
        ownList.getHead();
        ownList.getTail();
        System.out.println("******************************");

        System.out.println("***********Delete By Indíce**************");
        ownList.getHead();
        ownList.getTail();
        ownList.printList();
        System.out.println("Deletando...0");
        ownList.removeByIdx(0);
        ownList.printList();
        System.out.println("...");
        ownList.getHead();
        ownList.getTail();
        System.out.println("******************************");
        System.out.println("***********Update By Indíce**************");
        ownList.getHead();
        ownList.getTail();
        ownList.printList();
        System.out.println("Update...2");
        ownList.updateByIdx(2, "elemento alterado");
        ownList.printList();
        System.out.println("...");
        ownList.getHead();
        ownList.getTail();
        System.out.println("******************************");
    }
}
