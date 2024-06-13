package DesignPatterns.Behavioral.templateMethod.problem;

import DesignPatterns.Behavioral.templateMethod.VeiculoReparo;

public class TestServicoCarroReparo {
    public static void main(String[] args) {

        System.out.println("#############Comum até 70################");
        VeiculoReparo vrc = new VeiculoReparo();
        vrc.setPorcentagemDano(70);
        CarroComunService ccs = new CarroComunService(vrc);
        ccs.reparaVeiculo();

        System.out.println("\n#############Comum 71+ ################");
        VeiculoReparo vrc2 = new VeiculoReparo();
        vrc2.setPorcentagemDano(71);
        CarroComunService ccs2 = new CarroComunService(vrc2);
        ccs2.reparaVeiculo();

        System.out.println("\n#############Luxo até 50################");
        VeiculoReparo vrl = new VeiculoReparo();
        vrl.setPorcentagemDano(50);
        CarroLuxoService cls = new CarroLuxoService(vrl);
        cls.reparaVeiculo();

        System.out.println("\n#############Luxo 51+ ################");
        VeiculoReparo vrl2 = new VeiculoReparo();
        vrl2.setPorcentagemDano(51);
        CarroLuxoService cls2 = new CarroLuxoService(vrl2);
        cls2.reparaVeiculo();
    }
}
