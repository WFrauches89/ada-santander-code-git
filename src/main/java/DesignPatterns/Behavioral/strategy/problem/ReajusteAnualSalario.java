package DesignPatterns.Behavioral.strategy.problem;

import java.math.BigDecimal;

public class ReajusteAnualSalario {

    public void calculaReajusteAnual(Funcionario funcionario){

        if(TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
        }
        if(TipoContratacaoEnum.PJ.name().equals(funcionario.getTipoContratacao().name())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
        }
        if(TipoContratacaoEnum.ESTAGIO.name().equals(funcionario.getTipoContratacao().name())){
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
        }



    }
}
