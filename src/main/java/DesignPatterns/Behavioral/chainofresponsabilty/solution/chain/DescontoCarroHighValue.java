package DesignPatterns.Behavioral.chainofresponsabilty.solution.chain;

import DesignPatterns.Behavioral.chainofresponsabilty.Carro;
import DesignPatterns.Behavioral.chainofresponsabilty.solution.chain.DescontoCarro;

import java.math.BigDecimal;

public class DescontoCarroHighValue extends DescontoCarro {

    public DescontoCarroHighValue(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if(carro.getPreco().compareTo(new BigDecimal(100000))>0){
            return valorVenda.subtract(new BigDecimal(10000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
