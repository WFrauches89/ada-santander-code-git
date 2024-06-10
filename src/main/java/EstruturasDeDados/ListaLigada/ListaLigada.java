package EstruturasDeDados.ListaLigada;

public class ListaLigada {

/* Informações para criar lista ligada:

     Lista ligada ou encadeada lista linear formada por nós, O nó armazena a informação e referência o próximo nó
     Operações da ListLigada

    1 - Adicionar item na lista
        * prepend - inicio da lista
        * append - no final da lista
        * insert - em dada posição

    2 - Ler item na lista
        * getHead - inicio da lista
        * getTail - no final da lista
        * get - em dada posição

    3 - Remover item na lista
        * removeFirst - inicio da lista
        * removeLast - no final da lista
        * delete - em dada posição

    4 - Outras opções na lista
        * getLength - tamanho da lista
        * isEmpty - lista vazia?
        * makeEmpty - esvaziar lista - liberar memória para o garbage collector recuperar espaço


    Criar Lista
    Criar o nó -> Inserir valor no nó -> Ref do próximo nó apontar para NULL -> Guardar cabeça da lista e cauda da lista, neste casa ambos apontam para o mesmo nó pois é o primeiro.

    Recuperar a Cabeça da Lista, a Cauda da Lista, identificar seu tamanho, esvaziar a lista.

*/

    private No head;

    private No tail;

    private int length;

    // Aqui a implementação do Nó exige um dado, assim não havrá espaço de memória subutilizado, porém é possível criar uma lista ligada com o nó inicial vazio.
    public ListaLigada(String dado) {
        No novoNo = new No(dado);
        this.head = novoNo;
        this.tail = novoNo;
        this.length = 1;

    }

    public void getHead() {
        if(this.head == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Head: "+ this.head.dado+ " - espaço de memória de head: "+this.head);
        }
    }

    public void getTail() {
        if(this.tail == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Tail: " + this.tail.dado+ " - espaço de memória de tail: "+this.tail);
        }
    }

    public void getLength() {
        System.out.println("Lentgh: "+ this.length);
    }

    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void printList() {
        var noTemporario = getNoHead();
        int numb = 0;
        while(noTemporario != null){


            System.out.println(numb+" - "+noTemporario.dado);


            noTemporario = noTemporario.proximoNo;
            numb++;
        }
    }

    public void append(String dado) {
        /*
        No novoNo = new No(dado);
        if(lentgh == 0) {
            head = novoNo;
            tail = novoNo;
        } else {
            tail.proximoNo = novoNo;    // informando quem é o proximo nó
            tail = novoNo;              // atribuindo o novoNo como referencia de TAIL
        }
        lentgh++;
        */
        if(length == 0){
            ListaLigada listaLigada = new ListaLigada(dado);
        } else {
            No novoNo = new No(dado);
            tail.proximoNo = novoNo;    // informando quem é o proximo nó
            tail = novoNo;              // atribuindo o novoNo como referencia de TAIL
            length++;
        }
    }

    public No removeLast() {
        if(length == 0) return null;
        var noTemporario = getNoHead();
        No noRemoved = null;

        while (noTemporario.proximoNo != tail){
            noTemporario = noTemporario.proximoNo;
        }
        noRemoved = tail; // salvando a ref atual tail para retornar no método
        tail = noTemporario; // salvando o tail com a referencia do penultimo elemento pois o ultimo será removido
        tail.proximoNo = null; // removendo o ultimo elemento - entregando para o garbage collector a ref que era tail

        length--;

        if(length == 0){
            makeEmpty();
        }

//        System.out.println("Último elemento removido com sucesso: "+ noRemoved.dado);
//        System.out.println("Tail atual: "+ tail.dado);

        return noRemoved;
    }

    public No removeFirst() {
        if(length == 0) return null;
        var noToRemove = getNoHead();
        No noNewHead = noToRemove.proximoNo;

        this.head = noNewHead;

        noToRemove = null;

        length--;

        if(length == 0){
            makeEmpty();
        }

        return noToRemove;

//        System.out.println("Último elemento removido com sucesso: "+ noRemoved.dado);
//        System.out.println("Tail atual: "+ tail.dado);


    }

    public void prepend(String dado){
        if(length == 0){
            ListaLigada listaLigada = new ListaLigada(dado);
        } else {
            No novoNo = new No(dado);
            novoNo.proximoNo = head;    // informando quem é o proximo nó que era o HEAD anteriormente
            head = novoNo;              // atribuindo a HEAD o novoNo como referencia
            length++;
        }
    }

    public No getByIdx(int idx) {
        if(idx < 0 || idx > length ) return null;
        var noPesquisado = getNoHead();

        for( int i = 0; i < idx; i++ ){
            noPesquisado = noPesquisado.proximoNo;
        }

        System.out.println(noPesquisado.dado);

        return noPesquisado;
    }

    public boolean insertByIdx(int idx, String dados ) {
        if(idx < 0 || idx > length ) return false;
        if(idx == 0) {prepend(dados); return true;}
        if(idx == length) {append(dados); return true;}
        No newNo = new No(dados);
        var noDoIdx = getByIdx(idx-1);
        newNo.proximoNo = noDoIdx.proximoNo;
        noDoIdx.proximoNo = newNo;
        length++;
        return true;
    }

    public boolean updateByIdx(int idx, String dados ) {
        No noToUpdate = getByIdx(idx - 1 );
        if(noToUpdate != null){
            noToUpdate.dado = dados;
            return true;
        }
        return false;
    }

    public No removeByIdx(int idx ) {
        if(idx < 0 || idx > length ) return null;
        if(idx == 0) {return removeFirst();}
        if(idx == length) {return removeLast();}

        var noPrevIdx = getByIdx(idx-1);

        var noTemp = noPrevIdx.proximoNo;

        noPrevIdx.proximoNo = noTemp.proximoNo;

        noTemp.proximoNo = null;

        length--;
        return noTemp;
    }

    private No getNoHead() {
        No noTemporario = this.head; // Criamos um apontador referenciando em head pois o head e o tail não se pode perder a ref;
        return noTemporario;
    }

    class No {
        String dado; // Dado do nó
        No proximoNo;    // Um nó deve apontar para outro nó

        No(String dado){
            this.dado = dado;
        }
    }


}
