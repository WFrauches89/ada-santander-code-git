package DesignPatterns.Creational.Singleton.solution.Eager;


public class TestAgendaSingletonEager {

    public static void main(String[] args) {
        var instance1 = AgendaSingletonEager.getInstance(); // Mesma instância
        var instance2 = AgendaSingletonEager.getInstance(); // Mesma instância
        System.out.printf("Primeira instância: %s\nSegunda instância: %s",instance1,instance2);

        reservaDiaSingEager("Domingo");
        reservaDiaSingEager("Sábado");

    }

    public static void reservaDiaSingEager(String dia){
        AgendaSingletonEager agenda = AgendaSingletonEager.getInstance(); // Aqui pegamos uma instacia criada e não criamos uma nova...
        agenda.ocupar(dia);
        System.out.println(agenda.getDiasOff());
    }
}
