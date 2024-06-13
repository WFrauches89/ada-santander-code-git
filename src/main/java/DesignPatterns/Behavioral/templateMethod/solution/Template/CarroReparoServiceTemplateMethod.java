package DesignPatterns.Behavioral.templateMethod.solution.Template;

public abstract class CarroReparoServiceTemplateMethod {

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

    abstract boolean veiculoTemReparo();

    private void analisarDano() {
        System.out.println("Analisando dano...");
    }

    private void entradaOficina() {
        System.out.println("Entrando na oficina...");
    }
}
