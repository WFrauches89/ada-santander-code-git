package DesignPatterns.Creational.Builder.solution;

import DesignPatterns.Creational.Builder.Pessoa;

import java.time.LocalDate;
//
//public class BuilderPessoa {
//
//    private String nome;
//
//    private String sobrenome;
//
//    private String documento;
//
//    private String email;
//
//    private String apelido;
//
//    private LocalDate dataNascimento;
//
//    public BuilderPessoa nome(String nome) {
//        this.nome = nome;
//        return this; //desta forma estamos retornando o ppróprio objeto - Fluência de Método
//    }
//
//    public BuilderPessoa sobrenome(String sobrenome) {
//        this.sobrenome = sobrenome;
//        return this;
//    }
//
//    public BuilderPessoa documento(String documento) {
//        this.documento = documento;
//        return this;
//    }
//
//    public BuilderPessoa email(String email) {
//        this.email = email;
//        return this;
//    }
//
//    public BuilderPessoa apelido(String apelido) {
//        this.apelido = apelido;
//        return this;
//    }
//
//    public BuilderPessoa dataNascimento(LocalDate dataNascimento) {
//        this.dataNascimento = dataNascimento;
//        return this;
//    }
//
//    public Pessoa criaPessoa(){
//        return new Pessoa(nome, sobrenome, documento, email, apelido,dataNascimento);
//    }
//
//}
