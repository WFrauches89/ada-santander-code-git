package Basics.EstruturasCondicionais.EstruturasCondicionais.stringsAndDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class StringsAndDates {
    public static void main(String[] args) {

        String nome;

        LocalDate hoje = LocalDate.now();
        Locale Brasil = new Locale("pt", "BR");
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);

        String greetings;

        int turno = LocalDateTime.now().getHour();



        Scanner scr = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        nome = scr.nextLine();

        System.out.println("Nome em minusculo: "+nome.toLowerCase());
        System.out.println("Nome em maisculo: "+nome.toUpperCase());


        System.out.println("Digite um nome para comparar?");
        String outroNome;

        outroNome = scr.nextLine();

        if(nome.equalsIgnoreCase(outroNome)){
            System.out.println("Os nomes "+nome+" e "+outroNome+" são iguais.");
        } else {
            System.out.println("Os nomes " + nome + " e " + outroNome + " não são iguais.");
        }

        if(turno >=6 && turno < 12){
            greetings = "Bom dia";
        } else if (turno >= 12 && turno <18) {
            greetings = "Boa tarde";
        } else {
            greetings = "Boa noite";
        }

        System.out.printf("Olá, %s. Hojé é %s. %n%s!!!",nome,diaDaSemana,greetings.toUpperCase());


    }
}
