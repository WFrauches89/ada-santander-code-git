package DesignPatterns.Structural.Adapter.problem;

import java.math.BigDecimal;

public class TesteOperacoesCC {

    public static void main(String[] args) {

        JarOperacoesCC jarConta = new JarOperacoesCC();
        ClientJarOperacoesCC client = new ClientJarOperacoesCC(jarConta);


        BigDecimal valorParaSaque = new BigDecimal(1000);
        if(client.validaSaldo(valorParaSaque)) {
            client.saca(valorParaSaque);
        };

        client.deposita(new BigDecimal(500));


    }
}
