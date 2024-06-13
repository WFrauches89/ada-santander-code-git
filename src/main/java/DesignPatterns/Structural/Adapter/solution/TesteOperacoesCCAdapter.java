package DesignPatterns.Structural.Adapter.solution;

import DesignPatterns.Structural.Adapter.problem.ClientJarOperacoesCC;
import DesignPatterns.Structural.Adapter.problem.JarOperacoesCC;

import java.math.BigDecimal;

public class TesteOperacoesCCAdapter {

    public static void main(String[] args) {

        JarOperacoesCC jarOperacoesCC = new JarOperacoesCC();
        JarOperacoesCCAdapter jarConta = new JarOperacoesCCAdapter(jarOperacoesCC);
        ClientJarOperacoesCCAdapter client = new ClientJarOperacoesCCAdapter(jarConta);

        BigDecimal valorParaSaque = new BigDecimal(1000);

        client.saca(valorParaSaque);

        client.deposita(new BigDecimal(500));


    }
}
