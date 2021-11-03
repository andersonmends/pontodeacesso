/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

/**
 *
 * @author Anderson
 */
public class Endereco {


    private String CEP;
    private String num;
    private String estado;
    private String bairro;
    private String cidade;
    private String rua;

    private Endereco(){

    }

    public Endereco(String CEP, String num, String estado, String bairro, String cidade, String rua) {
        this.CEP = CEP;
        this.num = num;
        this.estado = estado;
        this.bairro = bairro;
        this.cidade = cidade;
        this.rua = rua;
    }

    
    
    public static Endereco FabricaEndereco(String CEP, String num, String estado, String bairro, String cidade,
            String rua){
        Endereco aux = new Endereco();
        aux.setBairro(bairro);
        aux.setCEP(CEP);
        aux.setCidade(cidade);
        aux.setEstado(estado);
        aux.setNum(num);
        aux.setRua(rua);
        
        return aux;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "CEP: " + CEP + ", Número: " + num + ", Estado: " + estado + ", Bairro: " + bairro + ",Cidade: " + cidade + ", Rua: " + rua;
    }
    
    

}
