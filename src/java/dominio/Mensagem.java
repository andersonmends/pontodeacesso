package dominio;

import java.util.Date;

public class Mensagem {

    private String data;
    private String destino;
    private String remetente;
    private String assunto;
    private String texto;
    private int cod;

    private Mensagem(){

    }

    public static Mensagem FabricaMensagem(String data, String destino, String remetente, String assunto,
            String texto, int cod) {
        Mensagem aux = new Mensagem();
        aux.setAssunto(assunto);
        aux.setCod(cod);
        aux.setData(data);
        aux.setDestino(destino);
        aux.setRemetente(remetente);
        aux.setTexto(texto);       
        
        return aux;
    }
    
    public static Mensagem FabricaMensagem() {
        Mensagem aux = new Mensagem();               
        return aux;
    }

    public Mensagem(String data, String destino, String remetente, String assunto, String texto, int cod) {
        this.data = data;
        this.destino = destino;
        this.remetente = remetente;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
 @Override
    public String toString() {
        return "Mensagem{" + "data=" + data + ", destino=" + destino + ", remetente=" + remetente + ", assunto=" + assunto +  ", texto=" + texto +", cod=" + cod + '}';
 }

}
