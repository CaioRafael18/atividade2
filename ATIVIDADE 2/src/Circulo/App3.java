package Circulo;

public class App3 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        double area = circulo.calcularArea();
        System.out.println("A area do circulo é: " + area);
        double perimetro = circulo.calcularPerimetro();
        System.out.println("O Perimetro do circulo é: " + perimetro);
    }
}
