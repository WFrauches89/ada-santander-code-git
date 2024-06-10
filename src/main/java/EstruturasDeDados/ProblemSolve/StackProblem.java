package EstruturasDeDados.ProblemSolve;

import EstruturasDeDados.Pilha.Stack;

public class StackProblem {
    public static void main(String[] args) {
        int [] numeros = {5,4,3,2,1};

        inverter(numeros);

    }

    private static void inverter(int[] numeros) {

        Stack pilhaInverter = new Stack(numeros[0]);

        for( int i = 1; i < numeros.length; i++){
            pilhaInverter.push(numeros[i]);
        }

        pilhaInverter.print();

        var node = pilhaInverter.pop();
        while (node != null){
            System.out.println(node.getValue());
            node = pilhaInverter.pop();
        }

    }
}
