public class circulo extends FiguraGeometrica {
    //Tarefa 04 - POO UCB
    private double raio;

    public circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    @Override
    public String getDescricao() {
        return "Círculo com raio " + raio;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
}