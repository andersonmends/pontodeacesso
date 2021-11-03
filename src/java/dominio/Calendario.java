package dominio;

import java.util.Date;

public class Calendario {

    private String data;
    private String evento;
    private int codTurma;
    private int cod;

    private Calendario() {
    }

    public static Calendario FabricaCalendario(String data, String evento) {
        Calendario aux = new Calendario();
        aux.setData(data);
        aux.setEvento(evento);
        // aux.setCod(cod);
        //aux.setCodTurma(codTurma);

        return aux;
    }

    /*
     * só pra testar public Calendario(String data, String evento) {
     * this.codTurma = codTurma; this.cod = cod; this.data = data; this.evento =
     * evento;
     *
     * }
     */
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Calendario{" + "cod=" + cod + ", codTurma=" + codTurma + ", data=" + data + ", evento=" + evento + '}';
    }
}
