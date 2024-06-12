package DesignPatterns.Creational.Singleton.problem;



public class TestAgenda {

    public static void main(String[] args) {
        reservaDia("Domingo");
        reservaDia("Sábado");

    }

    public static void reservaDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupar(dia);
        System.out.println(agenda.getDiasOff());
    }
}
