package DesignPatterns.Structural.Adapter.solution;

import DesignPatterns.Structural.Adapter.problem.JarOperacoesCC;

import java.math.BigDecimal;

public class JarOperacoesCCAdapter {

    private JarOperacoesCC jarOperacoesCC;

    public JarOperacoesCCAdapter(JarOperacoesCC jarOperacoesCC) {
        this.jarOperacoesCC = jarOperacoesCC;
    }

    public void saca(BigDecimal valorPretendido){
        if(jarOperacoesCC.validaSaldo(valorPretendido)){
            jarOperacoesCC.saca(valorPretendido);
        }else {
            throw new IllegalArgumentException("Valor não disponível para saque...");
        }
    }

    public void deposita(BigDecimal valor){
        jarOperacoesCC.deposita(valor);
    }

}
