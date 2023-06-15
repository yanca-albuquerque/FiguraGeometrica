public class retangulo extends FiguraGeometrica {
    //Tarefa 02 - POO UCB
    private double base;
    private double altura;

    public retangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double getArea() {
        return base * altura;
    }
    @Override
    public String getDescricao() {
        return "Retângulo com base " + base + " e altura " + altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}

