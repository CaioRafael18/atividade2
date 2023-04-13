package Calendario;

public class App6 {
    public static void main(String[] args) {
        Calendario c1 = new Calendario(02, 9, 2021);
        Calendario c2 = new Calendario(14, 10, 2024);

        System.out.println("Data 1:");
        c1.mostrarData();
        c1.anoBissexto();

        System.out.println("\nData 2:");
        c2.mostrarData();
        c2.anoBissexto();
    }
}