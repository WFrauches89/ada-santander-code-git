package DesignPatterns.Behavioral.chainofresponsabilty.problem;

import DesignPatterns.Behavioral.chainofresponsabilty.Carro;
import DesignPatterns.Behavioral.chainofresponsabilty.Marca;

import java.math.BigDecimal;

public class TestVendaCarro {

    public static void main(String[] args) {

        VendaCarroService vendaCarroService = new VendaCarroService();

        Carro carro1 = new Carro();
        carro1.setMarca(Marca.FORD);
        carro1.setModelo("Fusion");
        carro1.setPreco(new BigDecimal(150000));

        BigDecimal valorVendaCarro1 = vendaCarroService.calculaValorVenda(carro1);
        System.out.println("Valor de venda do "+carro1.getModelo()+": R$"+carro1.getPreco());
        System.out.println("Valor de venda do "+carro1.getModelo()+" com desconto: R$"+valorVendaCarro1);

        Carro carro2 = new Carro();
        carro2.setMarca(Marca.FIAT);
        carro2.setModelo("Palio");
        carro2.setPreco(new BigDecimal(15000));

        BigDecimal valorVendaCarro2 = vendaCarroService.calculaValorVenda(carro2);
        System.out.println("Valor de venda do "+carro2.getModelo()+": R$"+carro2.getPreco());
        System.out.println("Valor de venda do "+carro2.getModelo()+" com desconto: R$"+valorVendaCarro2);

        Carro carro3 = new Carro();
        carro3.setMarca(Marca.CHEVROLET);
        carro3.setModelo("Suburban");
        carro3.setPreco(new BigDecimal(605000));

        BigDecimal valorVendaCarro3 = vendaCarroService.calculaValorVenda(carro3);
        System.out.println("Valor de venda do "+carro3.getModelo()+": R$"+carro3.getPreco());
        System.out.println("Valor de venda do "+carro3.getModelo()+" com desconto: R$"+valorVendaCarro3);
    }
}
