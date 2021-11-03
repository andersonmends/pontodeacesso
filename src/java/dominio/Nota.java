/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

/**
 *
 * @author Anderson
 */
public class Nota {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private Disciplina disciplina;
    private Aluno aluno;

    private Nota(){

    }

    public static Nota FabricaNota(double nota1, double nota2, double nota3, double nota4, Aluno aluno){

        Nota aux = new Nota();
        aux.setNota1(nota1);
        aux.setNota2(nota2);
        aux.setNota4(nota4);
        aux.setNote3(nota3);
        aux.setAluno(aluno);

        return aux;
    }

    public double getMedia(){

        double media = (nota1 + nota2 + nota3 + nota4) /4;

        return media;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNote3() {
        return nota3;
    }

    public void setNote3(double note3) {
        this.nota3 = note3;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

}
