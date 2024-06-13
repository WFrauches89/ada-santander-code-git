package DesignPatterns.Behavioral.strategy.solution;

import DesignPatterns.Behavioral.strategy.problem.Funcionario;
import DesignPatterns.Behavioral.strategy.problem.ReajusteAnualSalario;
import DesignPatterns.Behavioral.strategy.problem.TipoContratacaoEnum;
import DesignPatterns.Behavioral.strategy.solution.impl.CalculadoraReajusteAnualCLT;
import DesignPatterns.Behavioral.strategy.solution.impl.CalculadoraReajusteAnualCoop;
import DesignPatterns.Behavioral.strategy.solution.impl.CalculadoraReajusteAnualESTAGIO;
import DesignPatterns.Behavioral.strategy.solution.impl.CalculadoraReajusteAnualPJ;

import java.math.BigDecimal;

public class TestAplicaReajusteStrategy {

    public static void main(String[] args) {
        ReajusteAnualSalarioStrategy reajusteAnualSalario = new ReajusteAnualSalarioStrategy();
        Funcionario funcionarioCLT = new Funcionario();
        funcionarioCLT.setNome("João");
        funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(1500));
        System.out.println(funcionarioCLT);

        Funcionario funcionarioPJ = new Funcionario();
        funcionarioPJ.setNome("PJ");
        funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(1500));
        System.out.println(funcionarioPJ);

        Funcionario funcionarioST = new Funcionario();
        funcionarioST.setNome("ST");
        funcionarioST.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
        funcionarioST.setSalario(new BigDecimal(1500));
        System.out.println(funcionarioST);

        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT, new CalculadoraReajusteAnualCLT());

        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ, new CalculadoraReajusteAnualPJ());

        reajusteAnualSalario.calculaReajusteAnual(funcionarioST, new CalculadoraReajusteAnualESTAGIO());

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioST);

        Funcionario funcionarioCoop = new Funcionario();
        funcionarioCoop.setNome("COOP");
        funcionarioCoop.setTipoContratacao(TipoContratacaoEnum.COOPERATIVA);
        funcionarioCoop.setSalario(new BigDecimal(1500));
        System.out.println(funcionarioCoop);

        reajusteAnualSalario.calculaReajusteAnual(funcionarioCoop, new CalculadoraReajusteAnualCoop());

        System.out.println(funcionarioCoop);
    }

}
