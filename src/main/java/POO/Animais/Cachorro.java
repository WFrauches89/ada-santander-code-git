package POO.Animais;

public class Cachorro extends Animal {



    public String pegarBolinha() {
        return "pegou a bolinha";
    }

    public String interagirComCachorro(String acaoRecebida) {

        switch (acaoRecebida.toUpperCase()){
            case "CARINHO": this.sentimentoDoAnimal = "feliz";
            break;
            case "ORDEM": this.sentimentoDoAnimal = "irritado";
            break;
            default: this.sentimentoDoAnimal = "neutro";

        }
        return sentimentoDoAnimal.toUpperCase();
    }

    @Override
    public void soar() {
        System.out.println("Au Au Au");
    }
//      Acima com SWITCH CASE
//    public String interagirComCachorro(String acaoRecebida) {
//        if(acaoRecebida.equalsIgnoreCase("cArInHo")){
//            sentimentoDoCachorro = "feliz";
//        } else if(acaoRecebida.equalsIgnoreCase("ordem")){
//            sentimentoDoCachorro = "irritado";
//        } else {
//            sentimentoDoCachorro = "neutro";
//        }
//        return sentimentoDoCachorro.toUpperCase();
//    }



    //PPontos
    /*
    Conhecer sobre Garbage collectors em Java - Limpador automático de de objetos não referenciados - liberar espaço de memória no Java

    literals - int 28563987 = int 28_563_987 desta forma facilita a leitura e não altera o valor real declarado...

    Conhecer varargs - Possibilita criar um método que aceita diversos args public void somar( int args... ) { logica de calculador somar }

    ----------------------------- Estudar assuntos -----------------------------------

    Herança e acoplamento - utilização de declaração de classe como atributos

    Estudar Debug

    Entender STATIC em java


     ----------------------------- Pesquisar assuntos -----------------------------------

     Porque float 32bits consegue armazenar mais números que Long 64bits?


     ----------------------------- Exercitar -----------------------------------

     Construir uma aplic registrar itens que estão em falta. Operações:

     1 - Adicionar item
     2 - Listar itens da lista
     3 - Remover item da lista - operação com método shift(index)
            percorre list começando de index, até indice final-list




     */


}
