package DesignPatterns.Behavioral.templateMethod.solution.Template;

import DesignPatterns.Behavioral.templateMethod.VeiculoReparo;

public class CarroComumServiceTemplateMethod extends CarroReparoServiceTemplateMethod{

    private VeiculoReparo veiculoReparo;

    public CarroComumServiceTemplateMethod(VeiculoReparo veiculoReparo) {
        this.veiculoReparo = veiculoReparo;
    }

    @Override
    protected boolean veiculoTemReparo() {
            return veiculoReparo.getPorcentagemDano() <=70;
    }
}
