package DesignPatterns.Behavioral.chainofresponsabilty.solution.chain;

import DesignPatterns.Behavioral.chainofresponsabilty.Carro;
import DesignPatterns.Behavioral.chainofresponsabilty.solution.chain.DescontoCarro;

import java.math.BigDecimal;

public class DescontoCarroNoPattern extends DescontoCarro {

    public DescontoCarroNoPattern(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        return BigDecimal.ZERO;
    }
}
