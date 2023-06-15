import java.util.ArrayList;
import java.util.List;
//Tarefa 05 - POO UCB
public class main {
    public static void main(String[] args) {
        retangulo retangulo = new retangulo("Retangulo", 8.0, 5.0);
        triangulo triangulo = new triangulo("Triangulo", 4.0, 7.0);
        circulo circulo = new circulo("Circulo", 3.0);

        List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>();
        listaFigurasGeometricas.add(retangulo);
        listaFigurasGeometricas.add(triangulo);
        listaFigurasGeometricas.add(circulo);

        for (FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
            System.out.println(figuraGeometrica.getDescricao());
            System.out.printf("Area da figura: %.2f\n", figuraGeometrica.getArea());
        }
    }
}