package DesignPatterns.Creational.Builder.problem;

import DesignPatterns.Creational.Builder.Pessoa;
import org.w3c.dom.ls.LSOutput;

public class TestPessoa {

    public static void main(String[] args) {

    Pessoa pessoaA = new Pessoa(
            "nome da pessoa",
            "sobrenome",
            "1564484100DIC",
            "email@email.com",
            "casca de bala",
            "nasceu");

        System.out.println(pessoaA);

    }
}
