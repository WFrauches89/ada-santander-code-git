package DesignPatterns.Behavioral.templateMethod.solution;

import DesignPatterns.Behavioral.templateMethod.VeiculoReparo;
import DesignPatterns.Behavioral.templateMethod.problem.CarroComunService;
import DesignPatterns.Behavioral.templateMethod.problem.CarroLuxoService;
import DesignPatterns.Behavioral.templateMethod.solution.Template.CarroComumServiceTemplateMethod;
import DesignPatterns.Behavioral.templateMethod.solution.Template.CarroLuxoServiceTemplateMethod;

public class TestServicoCarroReparoTemplateMethod {
    public static void main(String[] args) {

        System.out.println("#############Comum até 70################");
        VeiculoReparo vrc = new VeiculoReparo();
        vrc.setPorcentagemDano(70);
        CarroComumServiceTemplateMethod ccs = new CarroComumServiceTemplateMethod(vrc);
        ccs.reparaVeiculo();

        System.out.println("\n#############Comum 71+ ################");
        VeiculoReparo vrc2 = new VeiculoReparo();
        vrc2.setPorcentagemDano(71);
        CarroComumServiceTemplateMethod ccs2 = new CarroComumServiceTemplateMethod(vrc2);
        ccs2.reparaVeiculo();

        System.out.println("\n#############Luxo até 50################");
        VeiculoReparo vrl = new VeiculoReparo();
        vrl.setPorcentagemDano(50);
        CarroLuxoServiceTemplateMethod cls = new CarroLuxoServiceTemplateMethod(vrl);
        cls.reparaVeiculo();

        System.out.println("\n#############Luxo 51+ ################");
        VeiculoReparo vrl2 = new VeiculoReparo();
        vrl2.setPorcentagemDano(51);
        CarroLuxoServiceTemplateMethod cls2 = new CarroLuxoServiceTemplateMethod(vrl2);
        cls2.reparaVeiculo();
    }
}
