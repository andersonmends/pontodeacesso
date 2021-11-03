package dominio;

import java.util.ArrayList;

public class Disciplina {

    private int cod;
    private String descricao;
    private int cargaHoraria;
    private String nome;
    private ArrayList<Turma> turmas;
    private ArrayList<Nota> notas;
    private ArrayList<Horario> horarios;

    private Disciplina() {
    }

    public static Disciplina FabricaDisciplina(int cod, String desc, int ch, String nome, ArrayList<Turma> turmas, ArrayList<Nota> notas, ArrayList<Horario> horarios) {
        Disciplina aux = new Disciplina();
        aux.setCod(cod);
        aux.setDescricao(desc);
        aux.setCargaHoraria(cod);
        aux.setNome(nome);
        aux.setTurmas(turmas);
        aux.setNotas(notas);
        aux.setHorarios(horarios);

        return aux;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return "Código da Disciplina: " + cod + ", Nome: " + nome + ",Descrição: " + descricao + ", Carga Horária: " + cargaHoraria;
    }
}
