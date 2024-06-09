package EstruturasDeDados.Vetores.Supermarket;

public class SupermarketImpl implements Supermarket {

    private String[] itens;
    private int lastItemIdx;

    public SupermarketImpl(int size) {
        itens = new String[size];
        lastItemIdx = -1;
    }
    @Override
    public void adicionarItem(String nomeItem) {
        if(lastItemIdx == itens.length-1){
            System.err.println("Lista de super cheia.");
        } else {
            lastItemIdx++;
            itens[lastItemIdx] = nomeItem;
            System.out.printf("O item %s foi adicionado na posição %s, com sucesso!",nomeItem,lastItemIdx+1);
        }
    }

    @Override
    public void listarItens() {
        System.out.println("############################################");
        if(lastItemIdx < 0) {
            System.err.println("Lista vazia!");
        }
        for (int i = 0; i <= lastItemIdx; i++){
            System.out.printf("%s - %s\n", i+1, itens[i]);
        }
        System.out.println("\n############################################");
    }

    @Override
    public void removerItem(int index) {
        if(index >=0 && index <= lastItemIdx){
            shift(index-1);
            lastItemIdx--;
            System.out.printf("O item %s foi removido com sucesso!",index-1);
        } else {
            System.err.println("Index inválido.");
        }
    }

    private void shift(int index) {
        for (int i = index; i <= lastItemIdx-1; i++) {
            itens[i] = itens[i+1];
        }

    }
}
