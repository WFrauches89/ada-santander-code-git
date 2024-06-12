package DesignPatterns.Creational.Singleton.problem;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String,Boolean> agendaDiasDisponiveis = new HashMap<>();

    public Agenda() {
        agendaDiasDisponiveis.put("Domingo", Boolean.TRUE);
        agendaDiasDisponiveis.put("Segunda", Boolean.TRUE);
        agendaDiasDisponiveis.put("Terça", Boolean.TRUE);
        agendaDiasDisponiveis.put("Quarta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Quinta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Sexta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    public Map<String, Boolean> getDiasOff(){
        return agendaDiasDisponiveis;
    }

    public void ocupar(String dia){
        agendaDiasDisponiveis.replace(dia, false);
    }
}
