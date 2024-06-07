package Variaveis;

public class Booleanos {

    public static void main(String[] args) {

        Boolean fimdeSemana = true;
        Boolean sol = true;
        boolean noSol = false;
        //Tabela verdade
        //(AND) &&
        //true + true = true
        //true + false = false
        //false + true = false
        //false + false = false

        //(OR) ||
        //true + true = true
        //true + false = true
        //false + true = true
        //false + false = false

        boolean vaiTerPraia = fimdeSemana && sol;
        boolean vaiTerPraia2 = fimdeSemana || sol;

        boolean vaiTerPraia3 = fimdeSemana || noSol;

        System.out.println(vaiTerPraia);
        System.out.println(vaiTerPraia2);
        System.out.println(vaiTerPraia3);



        System.out.println(fimdeSemana ? "Vai ter praia sim" : "Não vai ter praia");
        System.out.println(noSol ? "Vai ter praia sim" : "Não vai ter praia");



    }
}
