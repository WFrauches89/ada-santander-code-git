package POO;

public class Cachorro {

    public String nome;

    public String cor;

    public double altura;

    public double peso;

    public String sentimentoDoCachorro;

    public void latir(){
        System.out.println("Au Au Au");
    }

    public String pegarBolinha() {
        return "pegou a bolinha";
    }

    public String interagirComCachorro(String acaoRecebida) {
        if(acaoRecebida.equalsIgnoreCase("cArInHo")){
            sentimentoDoCachorro = "feliz";
        } else if(acaoRecebida.equalsIgnoreCase("ordem")){
            sentimentoDoCachorro = "irritado";
        } else {
            sentimentoDoCachorro = "neutro";
        }
        return sentimentoDoCachorro.toUpperCase();
    }


}
