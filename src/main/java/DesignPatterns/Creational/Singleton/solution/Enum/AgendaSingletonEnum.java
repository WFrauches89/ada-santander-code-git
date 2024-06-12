package DesignPatterns.Creational.Singleton.solution.Enum;

import java.util.HashMap;
import java.util.Map;

public enum AgendaSingletonEnum {

    INSTANCE;

    private Map<String,Boolean> agendaDiasDisponiveis = new HashMap<>();

    private AgendaSingletonEnum() {
        agendaDiasDisponiveis.put("Domingo", Boolean.TRUE);
        agendaDiasDisponiveis.put("Segunda", Boolean.TRUE);
        agendaDiasDisponiveis.put("Terça", Boolean.TRUE);
        agendaDiasDisponiveis.put("Quarta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Quinta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Sexta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    public static AgendaSingletonEnum getInstance(){
            return INSTANCE;
    }

    public Map<String, Boolean> getDiasOff(){
        return agendaDiasDisponiveis;
    }

    public void ocupar(String dia){
        agendaDiasDisponiveis.replace(dia, false);
    }
}
