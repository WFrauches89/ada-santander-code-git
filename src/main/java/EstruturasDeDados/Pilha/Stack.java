package EstruturasDeDados.Pilha;

import EstruturasDeDados.ListaLigada.ListaLigada;

public class Stack {

    private Node top;

    private int heigth;

    public Stack(int value) {
        Node newNode = new Node(value);
        this.top = newNode;
        this.heigth = 1;
    }

    public void print() {
        System.out.println("##### Print Pilha #####");
        Node tempNode = top;
        int numb = 0;
        if(top == null) {
            System.out.println("Lista vazia");
        } else {
            while(tempNode != null){
                System.out.println(numb+" - "+ tempNode.value);
                tempNode = tempNode.next;
                numb++;
            }
        }
        System.out.println("####################");
    }

    public void getHeigth() {
        if(top == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Altura: "+heigth);
        }
    }

    public void getTop(){
        Node temp = top;
        if(top == null){
            System.out.println("Pilha vazia.");
        } else {
            System.out.println("Valor do Topo da pilha: "+temp.value);
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(heigth == 0){
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        heigth++;

    }

    public Node pop() {
        Node toRemove = top;
        if(top == null){
            System.err.println("Lista vazia não pode deletar itens!");
            return null;
        }
        top = top.next;
        var toReturn = toRemove;
        toRemove = null;
        heigth--;
        return toReturn;
    }

    // Teste normal de pilhas

    // utilizando uma pilha, inverta o conjunto de dados fornecidos pelo usuário.

    //



    public class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {

        Stack pilha = new Stack(819);

        pilha.getHeigth();
        pilha.getTop();
        pilha.print();

        pilha.push(715);
        pilha.push(7);
        pilha.push(15);
        pilha.push(3);

        pilha.getTop();
        pilha.getHeigth();
        pilha.print();
        System.out.println(" ");
        System.out.println("Valor que será retirado da pilha: "+pilha.pop().value);
        System.out.println(" ");
        pilha.getTop();
        pilha.getHeigth();
        pilha.print();
        System.out.println(" ");
        System.out.println("Valor que será retirado da pilha: "+pilha.pop().value);
        System.out.println(" ");
        pilha.getTop();
        pilha.getHeigth();
        pilha.print();
        System.out.println(" ");
        System.out.println("Valor que será retirado da pilha: "+pilha.pop().value);
        System.out.println(" ");
        pilha.getTop();
        pilha.getHeigth();
        pilha.print();
        System.out.println(" ");
        System.out.println("Valor que será retirado da pilha: "+pilha.pop().value);
        System.out.println(" ");
        pilha.getTop();
        pilha.getHeigth();
        pilha.print();
        System.out.println(" ");
        System.out.println("Valor que será retirado da pilha: "+pilha.pop().value );
        System.out.println(" ");
        pilha.print();
        System.out.println("Retorno de pop: "+pilha.pop() == null);
        System.out.println(" ");

    }
}
