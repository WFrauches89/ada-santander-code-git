package DesignPatterns.Creational.Prototype.problem;

import DesignPatterns.Creational.Prototype.Botao;
import DesignPatterns.Creational.Prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {

    public BotaoVermelho() {
        setCor("Vermelho");
        setAltura(15);
        setLargura(60);
        setTipoBorda(TipoBordaEnum.GROSSA);
    }

}
