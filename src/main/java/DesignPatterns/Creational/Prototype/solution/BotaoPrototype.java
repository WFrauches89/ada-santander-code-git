package DesignPatterns.Creational.Prototype.solution;

import DesignPatterns.Creational.Prototype.Botao;
import DesignPatterns.Creational.Prototype.TipoBordaEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoPrototype {

    private static BotaoPrototype botaoPrototype;

    private static Map<String, Botao> REGISTRY = new HashMap<>();

    static{
        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(15);
        botaoAmarelo.setLargura(60);
        botaoAmarelo.setTipoBorda(TipoBordaEnum.TRACEJADA);
        REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(15);
        botaoAzul.setLargura(60);
        botaoAzul.setTipoBorda(TipoBordaEnum.FINA);
        REGISTRY.put("BOTAO_AZUL", botaoAzul);

        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("Vermelho");
        botaoVermelho.setAltura(15);
        botaoVermelho.setLargura(60);
        botaoVermelho.setTipoBorda(TipoBordaEnum.GROSSA);
        REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);

        Botao botaoRoxo = new Botao();
        botaoRoxo.setCor("Roxo");
        botaoRoxo.setAltura(15);
        botaoRoxo.setLargura(60);
        botaoRoxo.setTipoBorda(TipoBordaEnum.TRACEJADA);
        REGISTRY.put("BOTAO_ROXO", botaoRoxo);

        Botao botaoBranco = new Botao();
        botaoBranco.setCor("Branco");
        botaoBranco.setAltura(15);
        botaoBranco.setLargura(60);
        botaoBranco.setTipoBorda(TipoBordaEnum.FINA);
        REGISTRY.put("BOTAO_BRANCO", botaoBranco);
    }



    public static BotaoPrototype getInstance(){
        if(Objects.isNull(botaoPrototype)){
            botaoPrototype = new BotaoPrototype();
            return botaoPrototype;
        }
        return botaoPrototype;
    }

    public static Botao getBotao(String key){
        return BotaoFactory.getInstance(REGISTRY.get(key));
    }

    public static void addRegistry(String chave, Botao botao) {
        REGISTRY.put(chave,botao);
    }
}
