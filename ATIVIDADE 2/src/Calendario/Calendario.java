package Calendario;

public class Calendario {
    private int dia;
    private int mes;
    private int ano;

    public Calendario(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String nomeMes(int m) {
        String nome = "";
        switch (m) {
            case 1:
                nome = "janeiro";
                break;
            case 2:
                nome = "fevereiro";
                break;
            case 3:
                nome = "março";
                break;
            case 4:
                nome = "abril";
                break;
            case 5:
                nome = "maio";
                break;
            case 6:
                nome = "junho";
                break;
            case 7:
                nome = "julho";
                break;
            case 8:
                nome = "agosto";
                break;
            case 9:
                nome = "setembro";
                break;
            case 10:
                nome = "outubro";
                break;
            case 11:
                nome = "novembro";
                break;
            case 12:
                nome = "dezembro";
                break;
            default:
                break;
        }
        return nome;
    }

    public void mostrarData() {
        System.out.println(this.dia + " de " + this.nomeMes(this.mes) + " de " + this.ano);
    }

    public void anoBissexto() {
        if ((this.ano % 4 == 0) && ((this.ano % 100 != 0) || (this.ano % 400 == 0))) {
            System.out.println(this.ano + " é bissexto.");
        } else {
            System.out.println(this.ano + " não é bissexto.");
        }
    }
}