package DesignPatterns.Behavioral.strategy.problem;

import java.math.BigDecimal;

public class TestAplicaReajuste {

    public static void main(String[] args) {
        ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();
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

        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT);

        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ);

        reajusteAnualSalario.calculaReajusteAnual(funcionarioST);

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioST);
    }

}
