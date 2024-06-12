package DesignPatterns.Creational.Builder.solution;

import DesignPatterns.Creational.Builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {

    public static void main(String[] args) {

        Pessoa pessoaComBuilder = new Pessoa.BuilderPessoa()
                .nome("Nova pessoa")  //Fluência de Método
                .sobrenome("Pessoa")  //Fluência de Método
                .apelido("PP")        //Fluência de Método
                .dataNascimento(LocalDate.of(1989, 03, 03))   //Fluência de Método
                .email("email@email.com")  //Fluência de Método
                .documento("156465465")    //Fluência de Método
                .build();             //Fluência de Método


        System.out.println(pessoaComBuilder);


        StringBuilder sb = new StringBuilder().append("primeira ").append(1).append(" e palavra ").append(2);

        System.out.println(sb);

    }




}
