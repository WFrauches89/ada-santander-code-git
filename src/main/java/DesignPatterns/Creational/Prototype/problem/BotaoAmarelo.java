package DesignPatterns.Creational.Prototype.problem;

import DesignPatterns.Creational.Prototype.Botao;
import DesignPatterns.Creational.Prototype.TipoBordaEnum;

public class BotaoAmarelo extends Botao {

    public BotaoAmarelo() {
        setCor("Amarelo");
        setAltura(15);
        setLargura(60);
        setTipoBorda(TipoBordaEnum.TRACEJADA);
    }

}
