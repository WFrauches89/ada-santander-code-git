package EstruturasDeDados.Fila;

import EstruturasDeDados.ListaLigada.ListaLigada;

public class Queue {

    private No first;

    private No last;

    private int length;

    public Queue(int valor) {
        No newNo = new No(valor);
        this.first = newNo;
        this.last = newNo;
        this.length = 1;
    }

    public void getFirst() {
        if(last == null) {
            System.out.println("Fila vazia...");
        } else {
            System.out.println("Último da fila: "+last.valor);
        }
    }

    public void getLast() {
        if(first == null) {
            System.out.println("Fila vazia...");
        } else {
            System.out.println("Primeiro da fila: "+first.valor);

        }
    }

    public void getLength(){
        System.out.println("Comprimento da fila: "+length);
    }

    public void printQueue(){
        System.out.println("#### Print da Fila ####");
        if(first == null){
            System.out.println("A fila está vazio");
        } else {
            No temp = first;
            while(temp != null){
                System.out.println(temp.valor);
                temp = temp.nextNo;

            }
        }
        System.out.println("#### #### #### #### ####");
    }

    public void queue(int valor) {
        if(length == 0){
            Queue newOne = new Queue(valor);
        } else {
            No newNoQueue = new No(valor);
            last.nextNo = newNoQueue;
            last = newNoQueue;
            length++;
        }
    }

    public No dequeue() {
        if(length == 0){
            System.err.println("Fila vazia");
            return null;
        }
        var toRemove = first;
        if(length == 1){
            first = null;
            last = null;
        } else {
            first = first.nextNo;
            toRemove.nextNo = null;
        }
        length--;
        return toRemove;
    }

    public class No {
        int valor;
        No nextNo;

        No(int valor){
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue(754);

        myQueue.getFirst();

        myQueue.getLast();

        myQueue.getLength();

        myQueue.printQueue();

        myQueue.queue(125);
        myQueue.queue(15);
        myQueue.queue(25);
        myQueue.queue(12);

        myQueue.getFirst();

        myQueue.getLast();

        myQueue.getLength();

        myQueue.printQueue();

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();

        myQueue.printQueue();

        System.out.println("Valor saindo da fila: "+ myQueue.dequeue().valor);
        myQueue.dequeue();
        myQueue.getLength();
        myQueue.printQueue();
    }
}
