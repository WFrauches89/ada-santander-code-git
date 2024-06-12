package DesignPatterns.Creational.Factory.solution;

import DesignPatterns.Creational.Factory.EnumProduto;
import DesignPatterns.Creational.Factory.Produto;

public class TestProdutoWithFactory {

    public static void main(String[] args) {
        var digital = ProdutoFactoryMethod.getInstace(EnumProduto.DIGITAL);
        var fisico = ProdutoFactoryMethod.getInstace(EnumProduto.FISICO);

        System.out.println(digital);
        System.out.println(fisico);
    }
}
