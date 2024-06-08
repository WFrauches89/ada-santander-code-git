package POO.Animais;

public abstract class Animal {

    protected String nome;

    protected String cor;

    protected double altura;

    protected double peso;

    protected String sentimentoDoAnimal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSentimentoDoAnimal() {
        return sentimentoDoAnimal;
    }

    public void setSentimentoDoAnimal(String sentimentoDoCachorro) {
        this.sentimentoDoAnimal = sentimentoDoCachorro;
    }

    public abstract void soar();
}
