package DesignPatterns.Structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class PessoaRepositorio {

    private Map<Long, Pessoa> bancoDados = new HashMap<>();

    private static Long countId = 1L;

    public void save(Pessoa pessoa){
        bancoDados.put(countId++, pessoa);
    }

    public Pessoa findById(Long id){
        try{
        Thread.sleep(1500);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return bancoDados.get(id);
    }



}
