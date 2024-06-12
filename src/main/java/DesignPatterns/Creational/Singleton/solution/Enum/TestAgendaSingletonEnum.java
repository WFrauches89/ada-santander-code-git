package DesignPatterns.Creational.Singleton.solution.Enum;


import java.lang.reflect.InvocationTargetException;

public class TestAgendaSingletonEnum {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        var instance1 = AgendaSingletonEnum.getInstance(); // Mesma instância
        var instance2 = AgendaSingletonEnum.getInstance(); // Mesma instância
        System.out.printf("Primeira instância: %s\nSegunda instância: %s\n",instance1.hashCode(),instance2.hashCode());

        reservaDiaSingLazy("Domingo");
        reservaDiaSingLazy("Sábado");
/*

Colocando o construtor como private este não roda, porém ainda temos como acessar o construtor com declarado...
        System.out.println("Lazy - Criando através do construtor public: "+new AgendaSingletonLazy());// Instância nova
        System.out.println("Lazy - Criando através do construtor public: "+new AgendaSingletonLazy());// Instância nova
        System.out.println("Eager - Criando através do construtor public: "+new AgendaSingletonEager());// Instância nova
        System.out.println("Eager - Criando através do construtor public: "+new AgendaSingletonEager());// Instância nova

/* Por recomendação para se proteger do Reflection utilizar o Enum
        // Reflection - quebra regra de construtor
        var construtorFugaTravesso = AgendaSingletonEnum.class.getDeclaredConstructor();

        AgendaSingletonEnum agendaBurlando = construtorFugaTravesso.newInstance();
        AgendaSingletonEnum agendaBurlando2 = construtorFugaTravesso.newInstance();

        System.out.println(agendaBurlando);
        System.out.println(agendaBurlando2);
*/
    }

    public static void reservaDiaSingLazy(String dia){
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance(); // Aqui pegamos uma instacia criada e não criamos uma nova...
        agenda.ocupar(dia);
        System.out.println(agenda.getDiasOff());
    }
}
