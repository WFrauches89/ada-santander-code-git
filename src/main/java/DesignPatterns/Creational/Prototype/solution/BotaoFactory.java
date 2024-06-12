package DesignPatterns.Creational.Prototype.solution;

import DesignPatterns.Creational.Prototype.Botao;

public class BotaoFactory {


    public static Botao getInstance(Botao prototype) {

        Botao botaoClone = new Botao();
        botaoClone.setLargura(prototype.getLargura());
        botaoClone.setTipoBorda(prototype.getTipoBorda());
        botaoClone.setAltura(prototype.getAltura());
        botaoClone.setCor(prototype.getCor());

        return botaoClone;
    }
}
