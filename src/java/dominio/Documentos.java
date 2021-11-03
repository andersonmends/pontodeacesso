/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

public class Documentos {

    private String cpf;
    private String rg;
    private String orExp;
    private String dtNasc;

    public Documentos() {
    }

    public Documentos(String cpf, String rg, String orExp, String dtNasc) {
        this.cpf = cpf;
        this.rg = rg;
        this.orExp = orExp;
        this.dtNasc = dtNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getOrExp() {
        return orExp;
    }

    public void setOrExp(String orExp) {
        this.orExp = orExp;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf + ", RG: " + rg + ", Orgão expeditor: " + orExp + ", Data de nascimento: " + dtNasc ;
    }
}
