package DesignPatterns.Behavioral.templateMethod.problem;

import DesignPatterns.Behavioral.templateMethod.VeiculoReparo;

public class CarroLuxoService {

    private VeiculoReparo veiculoReparo;

    public CarroLuxoService(VeiculoReparo veiculoReparo) {
        this.veiculoReparo = veiculoReparo;
    }

    public void reparaVeiculo(){
        entradaOficina();
        analisarDano();
        if (veiculoTemReparo()){
            repararVeiculo();
            notificarReparoSeguradora();
        } else {
            notificarPerdaTotalSeguradora();
        }

    }

    private void notificarPerdaTotalSeguradora() {
        System.out.println("Notificando perda total...");
    }

    private void repararVeiculo() {
        System.out.println("Realizando o reparo do veículo...");
    }

    private void notificarReparoSeguradora() {
        System.out.println("Notificando seguradora para reparo...");
    }

    private boolean veiculoTemReparo() {
        return veiculoReparo.getPorcentagemDano() <=50;
    }

    private void analisarDano() {
        System.out.println("Analisando dano...");
    }

    private void entradaOficina() {
        System.out.println("Entrando na oficina...");
    }
}
