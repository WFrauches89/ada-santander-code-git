package DesignPatterns.Structural.proxy;

import java.time.LocalDate;

public class Pessoa {

    private String nome;

    private String sobrenome;

    private String documento;

    private String email;

    private String apelido;

    private LocalDate dataNascimento;

    private Pessoa(String nome, String sobrenome, String documento, String email, String apelido, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", documento='" + documento + '\'' +
                ", email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    public static class BuilderPessoa {

        private String nome;

        private String sobrenome;

        private String documento;

        private String email;

        private String apelido;

        private LocalDate dataNascimento;

        public BuilderPessoa nome(String nome) {
            this.nome = nome;
            return this; //desta forma estamos retornando o ppróprio objeto - Fluência de Método
        }

        public BuilderPessoa sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public BuilderPessoa documento(String documento) {
            this.documento = documento;
            return this;
        }

        public BuilderPessoa email(String email) {
            this.email = email;
            return this;
        }

        public BuilderPessoa apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public BuilderPessoa dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Pessoa build(){
            return new Pessoa(nome, sobrenome, documento, email, apelido,dataNascimento);
        }

    }
}