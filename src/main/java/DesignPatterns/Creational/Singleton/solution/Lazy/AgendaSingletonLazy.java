package DesignPatterns.Creational.Singleton.solution.Lazy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLazy {

    private static AgendaSingletonLazy INSTANCE = null;

    private Map<String,Boolean> agendaDiasDisponiveis = new HashMap<>();

    private AgendaSingletonLazy() {
        agendaDiasDisponiveis.put("Domingo", Boolean.TRUE);
        agendaDiasDisponiveis.put("Segunda", Boolean.TRUE);
        agendaDiasDisponiveis.put("Terça", Boolean.TRUE);
        agendaDiasDisponiveis.put("Quarta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Quinta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Sexta", Boolean.TRUE);
        agendaDiasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    public static AgendaSingletonLazy getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new AgendaSingletonLazy();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }

    public Map<String, Boolean> getDiasOff(){
        return agendaDiasDisponiveis;
    }

    public void ocupar(String dia){
        agendaDiasDisponiveis.replace(dia, false);
    }
}
