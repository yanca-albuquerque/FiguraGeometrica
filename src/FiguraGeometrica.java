public abstract class FiguraGeometrica {
    //Tarefa 01 - POO UCB
    public String nome;

    public FiguraGeometrica(String nome) {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public abstract double getArea();
    public abstract String getDescricao();
}