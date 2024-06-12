package DesignPatterns.Creational.Factory.solution;

import DesignPatterns.Creational.Factory.EnumProduto;
import DesignPatterns.Creational.Factory.Produto;
import DesignPatterns.Creational.Factory.ProdutoDigital;
import DesignPatterns.Creational.Factory.ProdutoFisico;

public class ProdutoFactoryMethod {

    public static Produto getInstace(EnumProduto enumProduto){ // Método de fábrica de objetos que retorna instancias

        switch (enumProduto){
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;

            default:
                throw new IllegalArgumentException("Tipo de produto inválido");
        }

    }
}
