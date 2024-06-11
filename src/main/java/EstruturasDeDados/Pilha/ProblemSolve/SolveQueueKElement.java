package EstruturasDeDados.Pilha.ProblemSolve;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SolveQueueKElement {

    public static Queue<Integer> reverseKElement(Queue<Integer> queuetoManip , int k){
        reverseQueueWithKElement(queuetoManip, k);
        int kTotalElements = queuetoManip.size() -k;
        while (kTotalElements-- > 0){
            int elementFromQueue = queuetoManip.remove();
            queuetoManip.add(elementFromQueue);
        }
        return queuetoManip;
    }


    private static void reverseQueueWithKElement(Queue<Integer> queuetoManip, int k) {
        if(k == 0) return;
        int elementFromQueue = queuetoManip.remove();
        reverseQueueWithKElement(queuetoManip, k-1);
        queuetoManip.add(elementFromQueue);
    }


    public static void main(String[] args) {
        Queue<Integer> queueFortesting = new LinkedList<>();

        queueFortesting.add(1);
        queueFortesting.add(2);
        queueFortesting.add(3);
        queueFortesting.add(4);
        queueFortesting.add(5);
        queueFortesting.add(6);
        queueFortesting.add(17);
        queueFortesting.add(18);
        queueFortesting.add(19);

        System.out.println(reverseKElement(queueFortesting, 3));
    }
}
