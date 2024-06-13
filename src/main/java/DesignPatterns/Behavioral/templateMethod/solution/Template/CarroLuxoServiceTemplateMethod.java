package DesignPatterns.Behavioral.templateMethod.solution.Template;

import DesignPatterns.Behavioral.templateMethod.VeiculoReparo;

public class CarroLuxoServiceTemplateMethod extends CarroReparoServiceTemplateMethod{

    private VeiculoReparo veiculoReparo;

    public CarroLuxoServiceTemplateMethod(VeiculoReparo veiculoReparo) {
        this.veiculoReparo = veiculoReparo;
    }

    @Override
    boolean veiculoTemReparo() {
            return veiculoReparo.getPorcentagemDano() <=50;
    }
}
