package Quadrado;
public class App {
    public static void main(String[] args) throws Exception {
        Quadrado quadrado = new Quadrado(10);
        int area = quadrado.calcularArea();
        System.out.println("A area é: " + area);
        int perimetro = quadrado.calcularPerimetro();
        System.out.println("O perimetro é: " + perimetro);
    }
}
