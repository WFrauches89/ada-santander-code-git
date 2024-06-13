package DesignPatterns.Structural.proxy;

import DesignPatterns.Structural.proxy.solution.ProxyPessoaPolimorfismo;
import DesignPatterns.Structural.proxy.solution.ProxyPessoaRepositorio;

public class PessoaService {

    private ProxyPessoaPolimorfismo proxyPessoaPolimorfismo;

    public PessoaService(ProxyPessoaPolimorfismo proxyPessoaPolimorfismo){
        this.proxyPessoaPolimorfismo = proxyPessoaPolimorfismo;
    }

    public void save(Pessoa pessoa){
        proxyPessoaPolimorfismo.save(pessoa);
    }

    public Pessoa findById(Long id) {
        return proxyPessoaPolimorfismo.findById(id);
    }
}
