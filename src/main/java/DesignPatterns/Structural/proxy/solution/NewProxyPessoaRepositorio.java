package DesignPatterns.Structural.proxy.solution;

import DesignPatterns.Structural.proxy.Pessoa;
import DesignPatterns.Structural.proxy.PessoaRepositorio;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class NewProxyPessoaRepositorio extends PessoaRepositorio implements ProxyPessoaPolimorfismo{

    private static Logger log = Logger.getLogger(NewProxyPessoaRepositorio.class.getName());

    private Map<Long , Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do metodo save...");
        super.save(pessoa);
        log.info("Encerrando metodo save...");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada do metodo findById...");
        var from = "";
        Pessoa pessoa = null;
        var millis = System.currentTimeMillis();
        if(Objects.nonNull(cache.get(id))){
            log.info("Esta pegando em cache...");
            pessoa = cache.get(id);
            from = "repositorio";
        } else {
            log.info("Pegando do Repositorio...");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
            from = "cache";
        }
        log.info("Encerrando metodo findById...");
        var millisEnd = System.currentTimeMillis();
        log.info("Tempo total na chamada por "+from+": " +(millisEnd-millis));
        return pessoa;
    }
}
