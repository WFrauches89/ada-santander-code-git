package DesignPatterns.Structural.proxy.problem;

import DesignPatterns.Structural.proxy.Pessoa;
import DesignPatterns.Structural.proxy.PessoaRepositorio;
import DesignPatterns.Structural.proxy.PessoaService;

import java.time.LocalDate;

//public class TestPessoa {
//    public static void main(String[] args) {
//
//        PessoaService pessoaService = new PessoaService(new PessoaRepositorio());
//
//        Pessoa pessoaComBuilder = new Pessoa.BuilderPessoa()
//                .nome("Nova pessoa")  //Fluência de Método
//                .sobrenome("Pessoa")  //Fluência de Método
//                .apelido("PP")        //Fluência de Método
//                .dataNascimento(LocalDate.of(1989, 03, 03))   //Fluência de Método
//                .email("email@email.com")  //Fluência de Método
//                .documento("156465465")    //Fluência de Método
//                .build();             //Fluência de Método
//
//        pessoaService.save(pessoaComBuilder);
//
//
//        System.out.println("Buscando do Banco de dados -> "+pessoaService.findById(1L));
//
//        /*
//        System.out.println(pessoaComBuilder);
//        StringBuilder sb = new StringBuilder().append("primeira ").append(1).append(" e palavra ").append(2);
//        System.out.println(sb);
//         */
//    }
//}
