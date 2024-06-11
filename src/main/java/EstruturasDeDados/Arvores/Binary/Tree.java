package EstruturasDeDados.Arvores.Binary;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
/*
     Arvores podem ser binarias ou genéricas
     Raiz da arvore é o nó que não tem pai
     Os no´s de binárias só ppodem ter dois filhos
     Os nós da não binária pode ter mais que dois filhos
     Nó filho quando ele tem pai
     Nós irmãos são descendentes de mesmo ppai
     Nós que não tem filhos são folhas

    ARVORES BINARIAS
    Arvore cheia - ou tem dois filhos ou é folha
    Arvore não cheia - algum dos nós tem apenas 1 filho
    Arvore perfeita - terminado em folhas todas no mesmo nível
    Arvore comppleta - quando todos os nós folhas não estão no mesmo nível porém o último elemento da arvore está ao máximo da esquerda possível

    2^(n) -> elementos por nível
    2^(n+1) -1 -> quantidade total de elementos
    n+1 -> altura da arvore
     nível segue conceito de array portanto inicializa em 0
     arvores b ou arvores b+
     Principais operações
        Criar
        Inserir
        IsLeaf
        Travessia
            pré ordem
            em ordem
            pos ordem
        Busca
            BFS
            DFS

  */
    private Node root;


    public void insert(int valor){
        if(root == null){
            root = new Node(valor);
        } else {
            Node newNo = new Node(valor);
            Queue<Node> queueNo = new LinkedList<>();
            queueNo.add(root);
            while (queueNo.size() >0){
                Node currentNo = queueNo.remove(); // retirando da fila para verificar posição
                if(currentNo.left == null){
                    currentNo.left = newNo;
                    break;
                } else {
                    queueNo.add(currentNo.left);
                }
                if(currentNo.rigth == null){
                    currentNo.rigth = newNo;
                    break;
                } else {
                    queueNo.add(currentNo.rigth);
                }
            }
        }
    }
/*
    Travessia
                   30
            40            55
          35  45        50  60

     Pré ordem -> ROOT - left - rigth -> 30 - 40 - 35 - 45 - 55 - 50 - 60
     Em ordem -> left - ROOT -  rigth -> 35 - 40 - 45 - 30 - 50 - 55 - 60
     Pós ordem -> left - rigth - ROOT -> 35 - 45 - 40 - 50 - 60 - 55 - 30
*/
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node no) {
        if(no == null) return;
        System.out.println(no.valor);
        preOrder(no.left);
        preOrder(no.rigth);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node no) {
        if(no == null) return;
        inOrder(no.left);
        System.out.println(no.valor);
        inOrder(no.rigth);
    }

    public void posOrder() {
        posOrder(root);
    }

    private void posOrder(Node no) {
        if(no == null) return;
        posOrder(no.left);
        posOrder(no.rigth);
        System.out.println(no.valor);
    }

    private void BFS(){
        if(root == null) return;
        Queue<Node> queueNoToBFS = new LinkedList<>();
        queueNoToBFS.add(root);
        var number = 0;
        while (!queueNoToBFS.isEmpty()){
            Node noToBFS = queueNoToBFS.remove();
            if(noToBFS.left != null) {
                queueNoToBFS.add(noToBFS.left);
            }
            if(noToBFS.rigth != null) {
                queueNoToBFS.add(noToBFS.rigth);
            }
            number ++;
            System.out.printf("Valor encontrado no %s° laço: ",number);
            System.out.println(noToBFS.valor);
        }
    }

    private void DFS(){
        preOrder();
    }

    public static class Node {
        public int valor;
        public Node left;
        public Node rigth;

        public Node(int valor) {
            this.valor = valor;
        }

        public boolean isLeaf() {
            return (this.left == null && this.rigth == null);
        }
    }

    public static void main(String[] args) {
        Tree newTree = new Tree();

        newTree.insert(30);
        newTree.insert(40);
        newTree.insert(55);
        newTree.insert(35);
        newTree.insert(45);
        newTree.insert(50);
        newTree.insert(60);

        System.out.println(newTree.root.valor);
        System.out.println(newTree.root.left.valor);
        System.out.println(newTree.root.rigth.valor);
        System.out.println(newTree.root.isLeaf());
        System.out.println(newTree.root.left.isLeaf());
        System.out.println(newTree.root.rigth.isLeaf());

        System.out.println("#### Pre Order ####");
        newTree.preOrder();
        System.out.println("#### In Order ####");
        newTree.inOrder();
        System.out.println("#### Pos Order ####");
        newTree.posOrder();
        System.out.println("#### BFS ####");
        newTree.BFS();
        System.out.println("#### DFS ####");
        newTree.DFS();

    }
}
