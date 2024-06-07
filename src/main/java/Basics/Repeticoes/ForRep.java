package Basics.Repeticoes;

public class ForRep {
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++) {
            System.out.println("For repetição: "+i);
        }


        for(int j = 1; j <=10; j++) {
            System.out.println("Tabela de multiplicação de "+j);
            for(int i = 1; i <=10; i++) {
                System.out.println(i+"x"+j+" = "+i*j);
            }
        }



    }
}
