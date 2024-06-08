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
    Conhecer sobre Garbage collectors em Java
    Estudar Debug
    Entender STATIC em java

     */


}
