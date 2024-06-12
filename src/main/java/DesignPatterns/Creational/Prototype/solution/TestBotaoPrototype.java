package DesignPatterns.Creational.Prototype.solution;

import DesignPatterns.Creational.Prototype.Botao;
import DesignPatterns.Creational.Prototype.TipoBordaEnum;

public class TestBotaoPrototype {

    public static void main(String[] args) {

        var botaoBranco = BotaoPrototype.getBotao("BOTAO_BRANCO");
        System.out.println(botaoBranco);
        botaoBranco.setAltura(10);
        System.out.println(botaoBranco);
        var botaoBranco2 = BotaoPrototype.getBotao("BOTAO_BRANCO");
        System.out.println(botaoBranco2);

        var vermelho = BotaoPrototype.getBotao("BOTAO_VERMELHO");
        System.out.println(vermelho);

        var azul = BotaoPrototype.getBotao("BOTAO_AZUL");
        System.out.println(azul);

//        var verde = BotaoPrototype.getBotao("BOTAO_VERDE");
//        System.out.println(verde);
        // Como não há REGISTRO para o verde não funciona...


        String chave = "BOTAO_VERDE";
        Botao botaoVerde = new Botao();
        botaoVerde.setCor("Verde");
        botaoVerde.setAltura(1);
        botaoVerde.setLargura(6);
        botaoVerde.setTipoBorda(TipoBordaEnum.FINA);
        BotaoPrototype.addRegistry(chave, botaoVerde);

        var verde = BotaoPrototype.getBotao("BOTAO_VERDE");
        System.out.println(verde);
    }
}
