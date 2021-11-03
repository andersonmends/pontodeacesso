package dominio;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class Aluno {

    private String nomeMae;
    private String nomePai;
    private Turma turma;
    private ArrayList<Nota> notas;
    private Pessoa pessoa;

    public Aluno() {
    }

    public static Aluno FabricaAluno(String nomeMae, String nomePai, Turma turma, ArrayList<Nota> notas,
            //Pessoa
            long mat, String ultimoAcesso, String email, String tel1, String tel2,
            String login, String nome, String senha, String sexo, Icon foto, Endereco endereco,
            //Documentos
            String cpf, String rg, String orgExp, String dtNasc) {

        Documentos docs = new Documentos(cpf, rg, orgExp, dtNasc);

        Aluno aux = new Aluno();
        aux.setNomeMae(nomeMae);
        aux.setNomePai(nomePai);
        aux.setNotas(notas);
        aux.setTurma(turma);
        aux.setPessoa(Pessoa.FabricaPessoa(mat, ultimoAcesso, email, tel1, tel2, login, nome, senha, sexo, foto, endereco, docs));

        return aux;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Nome da mãe: " + nomeMae + ", Nome do Pai: " + nomePai + ", Turma: " + turma + pessoa;
    }
}
