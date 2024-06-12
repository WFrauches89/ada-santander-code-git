package DesignPatterns.Creational.Factory.problem;

import DesignPatterns.Creational.Factory.ProdutoDigital;
import DesignPatterns.Creational.Factory.ProdutoFisico;

public class TestProduto {

    public static void main(String[] args) {

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(true);

        /* Deixamos aqui a possibilidade de o usuário comenter um erro ou
         esquecer de setar uma informação, para isso podemos utilizar
          o factoryMethod e com isso evitar que este tipo de atributo
          falte por falha humana. */

    }

}
