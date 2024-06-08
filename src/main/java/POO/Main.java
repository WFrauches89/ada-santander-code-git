package POO;

import POO.Animais.Animal;
import POO.Animais.Cachorro;
import POO.Animais.Gato;
import POO.Lojas.Petshop;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Animal cachorro2 = new Cachorro();
        Animal gato1 = new Gato();
        Gato gato2 = new Gato();

        cachorro1.setNome("Pluto");
        cachorro1.setCor("Preto");

        cachorro1.soar();

        var sentimentoAtualdoCachorro = cachorro1.interagirComCachorro("CarinhO");

        System.out.printf("O %s está se sentindo %s\n", cachorro1.getNome(),sentimentoAtualdoCachorro);

        System.out.println("Joguei a bolinha mas não chamei o cachorro!");
        cachorro1.pegarBolinha();

        System.out.println("Joguei a bolinha, vai Pluto! \nPluto "+cachorro1.pegarBolinha());

        Petshop petshop = new Petshop();

        petshop.darBanho(gato1);
        petshop.darBanho(cachorro2);
//        petshop.tosarCachorro(gato1); - Não aceita pelo que recebe de parametro

        petshop.tosarCachorro(cachorro1);

//        petshop.tosarGato(cachorro1); - Não aceita pelo que recebe de parametro

        petshop.tosarGato(gato2);

    }
}
