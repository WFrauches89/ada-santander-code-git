package POO.Animais;

public class Gato extends Animal {

    public String arranharSofa() {
        return "Arranhando ...";
    }

    public String interagirComGato(String acaoRecebida) {

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
        System.out.println("Miau Miau");
    }


    //PPontos
    /*
    Conhecer sobre Garbage collectors em Java
    Estudar Debug
    Entender STATIC em java

     */


}
