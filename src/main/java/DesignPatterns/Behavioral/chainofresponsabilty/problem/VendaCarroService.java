package DesignPatterns.Behavioral.chainofresponsabilty.problem;

import DesignPatterns.Behavioral.chainofresponsabilty.Carro;
import DesignPatterns.Behavioral.chainofresponsabilty.Marca;

import java.math.BigDecimal;

public class VendaCarroService {

    public BigDecimal calculaValorVenda(Carro carro){
        BigDecimal valorVenda = carro.getPreco();

        if(carro.getPreco().compareTo(new BigDecimal(100000))>0){
            return valorVenda.subtract(new BigDecimal(10000));
        } else {
            if(Marca.FIAT.equals(carro.getMarca())){
                return valorVenda.subtract(new BigDecimal(1000));
            }
            if(Marca.FORD.equals(carro.getMarca())){
                return valorVenda.subtract(new BigDecimal(2000));
            }
            if(Marca.CHEVROLET.equals(carro.getMarca())){
                return valorVenda.subtract(new BigDecimal(500));
            }
        }
        return valorVenda;

    }

}
