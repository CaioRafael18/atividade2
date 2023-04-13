package FitaDeVideo;

public class FitaDeVideo {
    private String titulo;
    private double precoAluguel;

    public FitaDeVideo(String titulo, double precoAluguel) {
        this.titulo = titulo;
        this.precoAluguel = precoAluguel;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public double getValorAluguel(int numeroDeDiasAlugada) {
        return precoAluguel * numeroDeDiasAlugada;
    }

    public String toString() {
        return "Fita de vídeo: " + titulo + " - Preço de aluguel por dia: R$ " + precoAluguel;
    }
}