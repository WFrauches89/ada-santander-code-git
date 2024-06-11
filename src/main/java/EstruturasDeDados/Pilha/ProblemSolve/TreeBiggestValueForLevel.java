package EstruturasDeDados.Pilha.ProblemSolve;

import EstruturasDeDados.Arvores.Binary.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeBiggestValueForLevel {

    public static List<Integer> largestValues(Tree tree){
        var lista = new ArrayList<Integer>();
        solveTree(tree.root, 0, lista);
        return lista;
    }

    private static void solveTree(Tree.Node noRef, int level, ArrayList<Integer> lista) {
        if(noRef == null) return;
        if( level == lista.size()){
            lista.add(noRef.valor);
        } else {
            lista.set(level, Math.max(lista.get(level), noRef.valor));
        }
        var newLevel = level+1;
        solveTree(noRef.rigth, newLevel, lista);
        solveTree(noRef.left, newLevel, lista);
    }


    public static void main(String[] args) {
        Tree newTree = new Tree();

        newTree.insert(50);

        newTree.insert(5);
        newTree.insert(10);

        newTree.insert(45);
        newTree.insert(89);
        newTree.insert(2);
        newTree.insert(60);

        newTree.insert(1);
        newTree.insert(2);
        newTree.insert(3);
        newTree.insert(4);
        newTree.insert(500);
        newTree.insert(6);
        newTree.insert(7);
        newTree.insert(8);

        System.out.println(largestValues(newTree));
    }
}
