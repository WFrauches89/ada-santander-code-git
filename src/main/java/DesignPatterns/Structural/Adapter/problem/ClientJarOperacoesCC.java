package DesignPatterns.Structural.Adapter.problem;

import java.math.BigDecimal;

public class ClientJarOperacoesCC {

    private JarOperacoesCC jarOperacoesCC;

    public ClientJarOperacoesCC(JarOperacoesCC jarOperacoesCC){
        this.jarOperacoesCC = jarOperacoesCC;
    }

    public boolean validaSaldo(BigDecimal valorPretendidoSaque){
        return jarOperacoesCC.validaSaldo(valorPretendidoSaque);
    }

    public void saca(BigDecimal valorPretendido){
        jarOperacoesCC.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor){
        jarOperacoesCC.deposita(valor);
    }


}
