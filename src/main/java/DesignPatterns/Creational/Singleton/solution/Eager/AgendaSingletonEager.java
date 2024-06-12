package DesignPatterns.Creational.Singleton.solution.Eager;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEager {

    private static final AgendaSingletonEager INSTANCE = new AgendaSingletonEager();

    private Map<String,Boolean> agendaDiasDisponiveis = new HashMap<>();

    private AgendaSingletonEager() {
        agendaDiasDisponiveis.put("Domingo", Boolean.TRUE);
        agendaDiasDisponiveis.put("Segunda", Boolean.TRUE);
        agendaDiasDisponiveis.put("Terça", Boolean.TRUE);
        agendaDiasDisponiveis.put("Quarta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Quinta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Sexta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    public static AgendaSingletonEager getInstance(){
        return INSTANCE;
    }

    public Map<String, Boolean> getDiasOff(){
        return agendaDiasDisponiveis;
    }

    public void ocupar(String dia){
        agendaDiasDisponiveis.replace(dia, false);
    }
}
