package EstruturasDeDados.Arvores.Binary;

public class BinaryTreeSearch {

    //Desafio reimplementar métodos recursivos de forma iterativa

    private NodeBTS root;

    public void insert(int valor){
        if(root == null){
            root = new NodeBTS(valor);
        } else {
            insert(root, valor);
        }
    }

    public boolean contains(int valor){
        return contains(root, valor);
    }

    public void removeNo(int valor) {
        root = removeNo(root,valor);
    }

    private NodeBTS removeNo(NodeBTS root, int valor) {
        if(root == null) return null;
        if( valor < root.valor) {
            root.left = removeNo(root.left, valor);
        } else if( valor > root.valor) {
            root.rigth = removeNo(root.rigth, valor);
        } else {
            if (root.left == null && root.rigth ==null) {
                return null;    // delete folha
            } else if (root.left == null) {
                return root.rigth;             // delete no e sobe folha direita
            } else if (root.rigth == null) {
                return root.left;               // delete no e sobe folha esquerda
            } else {
                int minValor = minValor(root.rigth);
                root.valor = minValor;
                root.rigth = removeNo(root.rigth, minValor);  //avança para direita e busca para ultimo no a esquerda e sobe este nó e delete nó que foi solicitado remoção
            }
        }
        return root;
    }

    public int minValor (NodeBTS currentNo) {
        while (currentNo.left != null){
            currentNo = currentNo.left;
        }
        return currentNo.valor;
    }

    private boolean contains(NodeBTS root, int valor) {
        if(root == null) return false;
        if(root.valor == valor) return true;
        if(valor > root.valor) {
            return contains(root.rigth, valor);
        }   else {
            return contains(root.left, valor);
        }
    }

    private void insert(NodeBTS root, int valor) {
        if(root == null) return;
        if(valor == root.valor) return;
        if(valor > root.valor){
            if(root.rigth == null) {
                root.rigth =new NodeBTS(valor);
            } else {
                insert(root.rigth, valor);
            }
        } else {
            if(root.left == null) {
                root.left =new NodeBTS(valor);
            } else {
                insert(root.left, valor);
            }
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(NodeBTS no) {
        if(no == null) return;
        inOrder(no.left);
        System.out.println(no.valor);
        inOrder(no.rigth);
    }

    public static class NodeBTS {
        public int valor;
        public NodeBTS left;
        public NodeBTS rigth;

        public NodeBTS(int valor) {
            this.valor = valor;
        }

    }

    public static void main(String[] args) {
        BinaryTreeSearch newBTS = new BinaryTreeSearch();

        newBTS.insert(9);
        newBTS.insert(4);
        newBTS.insert(5);
        newBTS.insert(2);
        newBTS.insert(6);
        newBTS.insert(1);
        newBTS.insert(8);
        newBTS.insert(12);
        newBTS.insert(11);
        newBTS.insert(10);
        newBTS.insert(15);

        newBTS.inOrder();

        System.out.println(newBTS.contains(12));
        System.out.println(newBTS.contains(120));

        newBTS.removeNo(4);

        newBTS.inOrder();

    }
}
