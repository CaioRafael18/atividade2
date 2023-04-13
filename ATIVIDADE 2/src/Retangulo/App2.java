package Retangulo;

public class App2 {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(2, 4);
        int area = retangulo.calcularArea();
        System.out.println("A area é: " + area);
        int perimetro = retangulo.calcularPerimetro();
        System.out.println("O perimetro é: " + perimetro);
    }
    
}
