package EstruturasDeDados.Fila.ProblemSolve;

import EstruturasDeDados.Fila.Queue;

import java.util.Random;

public class QueueProblem {
    public static void main(String[] args) {

        int n = 8;
        var randomPass = new Random();
        int cliente = randomPass.nextInt(101);
        System.out.println("Cliente chegando na fila: "+cliente);
        Queue fila = new Queue(cliente);
        fila.getLength();

        for( int i = 2; i < n; i++){
            cliente = randomPass.nextInt(101);
            System.out.println("Cliente chegando na fila: "+cliente);
            fila.queue(cliente);
        }

        var node = fila.dequeue();
        while(node != null) {
            System.out.println("Cliente em atendimento: "+node.getValor());
            node = fila.dequeue();
        }

    }

}
