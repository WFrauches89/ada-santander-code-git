package POO.Lojas;

import POO.Animais.Animal;
import POO.Animais.Cachorro;
import POO.Animais.Gato;

public class Petshop {

    public void darBanho(Animal animal){
        animal.setSentimentoDoAnimal("Limpinho");
    }

    public void tosarCachorro(Cachorro animal){
        animal.setSentimentoDoAnimal("Tosado");
    }

    public void tosarGato(Gato animal){
        animal.setSentimentoDoAnimal("Tosado");
    }



}
