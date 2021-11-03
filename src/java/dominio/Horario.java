package dominio;

/**
 *
 * @author Lucas
 */
public class Horario {

    private int cod;
    private int codTurma;
    private String hora;
    private String dia;
    private String disciplina;

    public static Horario FabricaHorario(int cod, int codTurma, String hora, String dia, String disciplina) {
        Horario aux = new Horario();
        aux.setCod(cod);
        aux.setHora(hora);
        aux.setDia(dia);
        aux.setDisciplina(disciplina);
        aux.setCodTurma(codTurma);

        return aux;
    }

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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Horario{" + "cod=" + cod + ", codTurma=" + codTurma + ", hora=" + hora + ", dia=" + dia + ", disciplina=" + disciplina + '}';
    }
    
    
}
