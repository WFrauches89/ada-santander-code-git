package DesignPatterns.Structural.Adapter.solution;

import DesignPatterns.Structural.Adapter.problem.JarOperacoesCC;

import java.math.BigDecimal;

public class ClientJarOperacoesCCAdapter {

    private JarOperacoesCCAdapter jarOperacoesCCAdapter;

    public ClientJarOperacoesCCAdapter(JarOperacoesCCAdapter jarOperacoesCCAdapter){
        this.jarOperacoesCCAdapter = jarOperacoesCCAdapter;
    }

    public void saca(BigDecimal valorPretendido){
        jarOperacoesCCAdapter.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor){
        jarOperacoesCCAdapter.deposita(valor);
    }


}
