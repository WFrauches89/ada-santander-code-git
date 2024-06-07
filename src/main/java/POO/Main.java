package POO;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Pluto";
        cachorro1.cor = "Preto";

        cachorro1.latir();

        var sentimentoAtualdoCachorro = cachorro1.interagirComCachorro("carinhO");

        System.out.printf("O %s está se sentindo %s\n",cachorro1.nome,sentimentoAtualdoCachorro);

        System.out.println("Joguei a bolinha mas não chamei o cachorro!");
        cachorro1.pegarBolinha();

        System.out.println("Joguei a bolinha, vai Pluto! \nPluto "+cachorro1.pegarBolinha());


    }
}
