package DesignPatterns.Creational.Singleton.solution.Lazy;


import DesignPatterns.Creational.Singleton.solution.Eager.AgendaSingletonEager;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestAgendaSingletonLazy {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        var instance1 = AgendaSingletonLazy.getInstance(); // Mesma instância
        var instance2 = AgendaSingletonLazy.getInstance(); // Mesma instância
        System.out.printf("Primeira instância: %s\nSegunda instância: %s",instance1,instance2);

        reservaDiaSingLazy("Domingo");
        reservaDiaSingLazy("Sábado");
/*

Colocando o construtor como private este não roda, porém ainda temos como acessar o construtor com declarado...
        System.out.println("Lazy - Criando através do construtor public: "+new AgendaSingletonLazy());// Instância nova
        System.out.println("Lazy - Criando através do construtor public: "+new AgendaSingletonLazy());// Instância nova
        System.out.println("Eager - Criando através do construtor public: "+new AgendaSingletonEager());// Instância nova
        System.out.println("Eager - Criando através do construtor public: "+new AgendaSingletonEager());// Instância nova

*/
        // Reflection - quebra regra de construtor
        var construtorFugaTravesso = AgendaSingletonLazy.class.getDeclaredConstructor();

        AgendaSingletonLazy agendaBurlando = construtorFugaTravesso.newInstance();
        AgendaSingletonLazy agendaBurlando2 = construtorFugaTravesso.newInstance();

        System.out.println(agendaBurlando);
        System.out.println(agendaBurlando2);

    }

    public static void reservaDiaSingLazy(String dia){
        AgendaSingletonLazy agenda = AgendaSingletonLazy.getInstance(); // Aqui pegamos uma instacia criada e não criamos uma nova...
        agenda.ocupar(dia);
        System.out.println(agenda.getDiasOff());
    }
}
