/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Date;

/**
 *
 * @author Anderson
 */
public class Noticia {

    private Date data;
    private String titulo;
    private String assunto;
    private String texto;
    private int cod;

    private Noticia() {
    }

    public static Noticia FabricaNoticia(Date data, String titulo, String assunto, String texto, int cod) {
        Noticia aux = new Noticia();
        aux.setAssunto(assunto);
        aux.setCod(cod);
        aux.setData(data);
        aux.setTexto(texto);
        aux.setTitulo(titulo);

        return aux;
    }

    public Noticia(Date data, String titulo, String assunto, String texto, int cod) {
        this.data = data;
        this.titulo = titulo;
        this.assunto = assunto;
        this.texto = texto;
        this.cod = cod;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Noticia{" + "data=" + data + ", titulo=" + titulo + ", assunto=" + assunto + ", texto=" + texto + ", cod=" + cod + '}';
    }
}
