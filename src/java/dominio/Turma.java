/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

public class Turma {

    private int cod;
    private String turno;
    private String serie;
    private String anoLetivo;
    private String classe;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Mensagem> mensagens;
    private ArrayList<Horario> horarios;

    private Turma() {
    }

    public static Turma FabricaTurma(int cod, String turno, String serie, String classe, String anoLetivo, ArrayList<Aluno> alunos,
            ArrayList<Professor> professores, ArrayList<Disciplina> disciplinas, ArrayList<Mensagem> mensagens, ArrayList<Horario> horarios) {
        Turma aux = new Turma();
        aux.setAlunos(alunos);
        aux.setAnoLetivo(anoLetivo);
        aux.setCod(cod);
        aux.setDisciplinas(disciplinas);
        aux.setMensagens(mensagens);
        aux.setProfessores(professores);
        aux.setSerie(serie);
        aux.setTurno(turno);
        aux.setClasse(classe);
        aux.setHorarios(horarios);

        return aux;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Código da Turma: " + cod + ", Turno: " + turno + ", Série: " + serie + ", Ano Letivo: " + anoLetivo + ", Classe: " + classe;
    }
}