package DesignPatterns.Behavioral.chainofresponsabilty.solution;

import DesignPatterns.Behavioral.chainofresponsabilty.Carro;
import DesignPatterns.Behavioral.chainofresponsabilty.solution.chain.*;

import java.math.BigDecimal;

public class VendaCarroServiceChainOfResponsability {

    public BigDecimal calculaValorVenda(Carro carro){
        DescontoCarro desconto = new DescontoCarroHighValue(
                new DescontoCarroFIAT(
                        new DescontoCarroFORD(
                                new DescontoCarroNoPattern(
                                        null))));

        return desconto.aplicaDesconto(carro);

    }

}
