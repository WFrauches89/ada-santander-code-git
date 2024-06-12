package DesignPatterns.Creational.Prototype.problem;

import DesignPatterns.Creational.Prototype.Botao;
import DesignPatterns.Creational.Prototype.TipoBordaEnum;

public class BotaoAzul extends Botao {

    public BotaoAzul() {
        setCor("Azul");
        setAltura(15);
        setLargura(60);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
