package FitaDeVideo;

public class App4 {
    public static void main(String[] args) {
        FitaDeVideo fita1 = new FitaDeVideo("Guardião da galaxia", 1.50);
        FitaDeVideo fita2 = new FitaDeVideo("Os vingadores", 3.00);
        FitaDeVideo fita3 = new FitaDeVideo("Capitão America", 1.50);

        System.out.println(fita1.toString());
        System.out.println(fita2.toString());
        System.out.println(fita3.toString());

        int numeroDeDiasAlugada = 5;
        System.out.println("Valor do aluguel de " + fita1.getTitulo() + " por " + numeroDeDiasAlugada + " dias: R$ " + fita1.getValorAluguel(numeroDeDiasAlugada));
        System.out.println("Valor do aluguel de " + fita2.getTitulo() + " por " + numeroDeDiasAlugada + " dias: R$ " + fita2.getValorAluguel(numeroDeDiasAlugada));
        System.out.println("Valor do aluguel de " + fita3.getTitulo() + " por " + numeroDeDiasAlugada + " dias: R$ " + fita3.getValorAluguel(numeroDeDiasAlugada));
    }
}