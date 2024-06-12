package DesignPatterns.Creational.Builder.solution.outras;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getters&Setters e ToString
@AllArgsConstructor //Construtor com todos argumentos
@NoArgsConstructor //Construtor vazio - super() Padrão
@Builder //Builder criado pelo Lombok
public class Animal {

    private String nome;
    private String nomeDono;
    private String raca;

}
