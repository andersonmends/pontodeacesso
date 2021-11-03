package aplicacao;

import dominio.*;
import infraestrutura.*;
import java.util.ArrayList;

public class Fachada implements InterfaceRepositorioPessoa, InterfaceRepositorioMensagem, InterfaceRepositorioNoticia,
        InterfaceRepositorioDisciplina, InterfaceRepositorioTurma, InterfaceRepositorioCalendario {

    private InterfaceRepositorioPessoa rp = null;
    private InterfaceRepositorioMensagem rm = null;
    private InterfaceRepositorioNoticia rn = null;
    private InterfaceRepositorioDisciplina rd = null;
    private InterfaceRepositorioTurma rt = null;
    private InterfaceRepositorioHorario rh = null;
    private InterfaceRepositorioCalendario rc = null;
    
    public static Fachada mySelf = null;

    public static Fachada getInstance() {

        if (mySelf == null) {
            mySelf = new Fachada();
            return mySelf;
        }
        return mySelf;
    }

    private Fachada() {

        rp = new RepositorioPessoaBD();
        rm = new RepositorioMensagemBD();
        rn = new RepositorioNoticiaBD();
        rd = new RepositorioDisciplinaBD();
        rt = new RepositorioTurmaBD();
        rh = new RepositorioHorarioBD();
        rc = new RepositorioCalendarioBD();
    }

    public ArrayList<Pessoa> recuperarPessoas() {
        ArrayList<Pessoa> p = rp.recuperarPessoas();
        return p;
    }

    public ArrayList<Aluno> recuperarAlunos() {
        return rp.recuperarAlunos();
    }

    public ArrayList<Professor> recuperarProfessor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<Administrador> recuperarAdministrador() {
       return rp.recuperarAdministrador();
    }

    public Pessoa pesquisarPessoa(int matricula) {
        Pessoa p = rp.pesquisarPessoa(matricula);
        return p;
    }

    @Override
    public Aluno pesquisarAluno(int matricula) {
        return rp.pesquisarAluno(matricula);
    }

    @Override
    public Professor pesquisarProfessor(int matricula) {
        return rp.pesquisarProfessor(matricula);
    }

    public Administrador pesquisarAdministrador(int matricula) {
        return rp.pesquisarAdministrador(matricula);
    }

    public void adicionarPessoa(Pessoa p) {
        rp.adicionarPessoa(p);
    }

    public void removerPessoa(int matricula) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void alterarPessoa1(Pessoa p, String cepAntigo, String numAntigo, int matAntigo) {
        rp.alterarPessoa(p, cepAntigo, numAntigo, matAntigo);
    }

    public ArrayList<Mensagem> recuperarMensagens() {
        return rm.recuperarMensagens();
    }

    public Mensagem pesquisarMensagem(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void adicionarMensagem(Mensagem m) {
        rm.adicionarMensagem(m);
    }

    public void alterarMensagem(Mensagem m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deletarMensagem(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void adicionarNoticias(Noticia n) {
        rn.adicionarNoticias(n);
    }

    public ArrayList<Noticia> recuperarNoticias() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removerNoticia(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Noticia pesquisarNoticia(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void alterarNoticia(Noticia n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Disciplina> recuperarDisciplinas() {
        return rd.recuperarDisciplinas();
    }

    @Override
    public Disciplina pesquisarDisciplina(int cod) {
        return rd.pesquisarDisciplina(cod);
    }

    @Override
    public void adicionarDisciplina(Disciplina d) {
        rd.adicionarDisciplina(d);
    }

    @Override
    public void removerDisciplina(int cod) {
        rd.removerDisciplina(cod);
    }

    @Override
    public void alterarDisciplina(Disciplina d, int codAntigo) {
        rd.alterarDisciplina(d, codAntigo);
    }

    @Override
    public ArrayList<Turma> recuperarTurmas() {
        return rt.recuperarTurmas();
    }

    @Override
    public Turma pesquisarTurmaPorCod(int cod) {
        return rt.pesquisarTurmaPorCod(cod);
    }

    public int pesquisarTurma(Turma t) {
        return rt.pesquisarTurma(t);
    }

    public void adicionarTurma(Turma t) {
        rt.adicionarTurma(t);
    }

    @Override
    public void alterarTurma(Turma t, int codAntigo) {
        rt.alterarTurma(t, codAntigo);
    }

    @Override
    public void deletarTurma(int cod) {
        rt.deletarTurma(cod);
    }

    @Override
    public Pessoa pesquisarPessoaPorLogin(String login) {
        return rp.pesquisarPessoaPorLogin(login);
    }

    @Override
    public Pessoa pesquisarPessoaPorMatricula(int matricula) {
        return rp.pesquisarPessoaPorMatricula(matricula);
    }

    public ArrayList<Horario> recuperarHorarios() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ArrayList<Horario> recuperarHorariosTurma(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Horario pesquisarHorario(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void adicionarHorario(Horario h) {
        rh.adicionarHorario(h);
    }

    public void alterarHorario(Horario h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deletarHorario(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Pessoa> pesquisarPessoaPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void adicionarAluno(Aluno a) {
        rp.adicionarAluno(a);
    }

    @Override
    public void removerAluno(int mat) {
        rp.removerAluno(mat);
    }

    @Override
    public ArrayList<Aluno> pesquisarAlunoPorNome(String nome) {
        return rp.pesquisarAlunoPorNome(nome);
    }

    @Override
    public void adicionarProfessor(Professor p) {
        rp.adicionarProfessor(p);
    }

    @Override
    public void removerProfessor(int mat) {
        rp.removerProfessor(mat);
    }

    @Override
    public ArrayList<Professor> pesquisarProfessorPorNome(String nome) {
        return rp.pesquisarProfessorPorNome(nome);
    }

    @Override
    public void adicionarAdministrador(Administrador a) {
        rp.adicionarAdministrador(a);
    }

    @Override
    public void removerAdministrador(int mat) {
        rp.removerAdministrador(mat);
    }

    @Override
    public void alterarAdministrador(int mat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Administrador> pesquisarAdministradorPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void alterarPessoa(Pessoa p, String cepAntigo, String numAntigo, int matAntigo) {
        rp.alterarPessoa(p, cepAntigo, numAntigo, matAntigo);
    }

    @Override
    public void alterarAluno(Aluno a, String cepAntigo, String numAntigo, int matAntigo) {
        rp.alterarAluno(a, cepAntigo, numAntigo, matAntigo);
    }

    @Override
    public void alterarProfessor(Professor p, String cepAntigo, String numAntigo, int matAntigo) {
        rp.alterarProfessor(p, cepAntigo, numAntigo, matAntigo);
    }

    @Override
    public ArrayList<Horario> pegarHorarios(int codT) {
        return rt.pegarHorarios(codT);
    }

    @Override
    public ArrayList<Aluno> pesquisarAlunoPorAno(String ano) {
        return rp.pesquisarAlunoPorAno(ano);
    }

    @Override
    public ArrayList<Turma> pesquisarTurmaPorNome(String nome) {
        return rt.pesquisarTurmaPorNome(nome);
    }

    @Override
    public ArrayList<Turma> pesquisarTurmaPorAno(String ano) {
        return rt.pesquisarTurmaPorAno(ano);
    }

    @Override
    public ArrayList<Professor> pesquisarProfessorPorAno(String ano) {
        return rp.pesquisarProfessorPorAno(ano);
    }

    @Override
    public ArrayList<Disciplina> pesquisarDisciplinasPorNome(String nome) {
        return rd.pesquisarDisciplinasPorNome(nome);
    }

    @Override
    public Aluno pesquisarAlunoPorLogin(String login) {
        return rp.pesquisarAlunoPorLogin(login);
    }

    @Override
    public ArrayList<Mensagem> pesquisarMensagensPorAluno(int codAluno) {
        return rm.pesquisarMensagensPorAluno(codAluno);
    }

    @Override
    public void adicionarEvento(Calendario c) {
        rc.adicionarEvento(c);
    }

    @Override
    public void removerCalendario(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void alterarCalendario(Calendario c) {
        rc.alterarCalendario(c);
    }

    
}
