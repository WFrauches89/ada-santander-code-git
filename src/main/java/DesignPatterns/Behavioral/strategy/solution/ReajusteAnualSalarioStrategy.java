package DesignPatterns.Behavioral.strategy.solution;

import DesignPatterns.Behavioral.strategy.problem.Funcionario;
import DesignPatterns.Behavioral.strategy.problem.TipoContratacaoEnum;

import java.math.BigDecimal;

public class ReajusteAnualSalarioStrategy {

    public void calculaReajusteAnual(Funcionario funcionario, CalculadoraReajusteAnual calculadoraReajusteAnual){
        calculadoraReajusteAnual.calculaReajusteAnual(funcionario);
    }
}
