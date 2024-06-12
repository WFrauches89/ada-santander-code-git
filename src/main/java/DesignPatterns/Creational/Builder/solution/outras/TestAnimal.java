package DesignPatterns.Creational.Builder.solution.outras;

public class TestAnimal {

    public static void main(String[] args) {

        var novoAnimal = Animal.builder()
                .nome("Rex")
                .raca("Tomba lixo")
                .nomeDono("Zoim Talagada")
                .build();

        System.out.println(novoAnimal);
    }
}
