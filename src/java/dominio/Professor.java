package dominio;

import java.util.Date;

public class Professor {

    private String dataAdm;
    private String titulacao;
    private int cargaHoraria;
    private Pessoa pessoa;

    private Professor() {
    }

    public static Professor FabricaProfessor(String dataAdm, String titulacao, int cargaHoraria, Pessoa p) {

        Professor aux = new Professor();
        aux.setCargaHoraria(cargaHoraria);
        aux.setDataAdm(dataAdm);
        aux.setTitulacao(titulacao);
        aux.setPessoa(p);

        return aux;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDataAdm() {
        return dataAdm;
    }

    public void setDataAdm(String dataAdm) {
        this.dataAdm = dataAdm;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Data de admissão: " + dataAdm + ", Títulação: " + titulacao + ", Carga Horária: " + cargaHoraria + " " + pessoa;
    }
}
