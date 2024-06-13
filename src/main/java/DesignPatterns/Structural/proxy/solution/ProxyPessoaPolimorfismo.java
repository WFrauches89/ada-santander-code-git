package DesignPatterns.Structural.proxy.solution;

import DesignPatterns.Structural.proxy.Pessoa;

public interface ProxyPessoaPolimorfismo {

    public abstract void save(Pessoa pessoa);   // como estamos falando de uma
                                                // implementação de abstract
                                                // podemos ou não declarar
                                                // public abstract

    Pessoa findById(Long id);
}
