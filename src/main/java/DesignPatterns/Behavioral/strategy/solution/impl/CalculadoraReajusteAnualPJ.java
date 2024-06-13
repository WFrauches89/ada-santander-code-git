package DesignPatterns.Behavioral.strategy.solution.impl;

import DesignPatterns.Behavioral.strategy.problem.Funcionario;
import DesignPatterns.Behavioral.strategy.solution.CalculadoraReajusteAnual;

import java.math.BigDecimal;

public class CalculadoraReajusteAnualPJ implements CalculadoraReajusteAnual {
    @Override
    public void calculaReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
    }
}
