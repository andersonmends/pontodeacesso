package dominio;

import java.util.ArrayList;

public interface InterfaceRepositorioPessoa {

    public ArrayList<Pessoa> recuperarPessoas();

    public ArrayList<Aluno> recuperarAlunos();

    public ArrayList<Professor> recuperarProfessor();

    public ArrayList<Administrador> recuperarAdministrador();
    

    public void adicionarPessoa(Pessoa p);

    public void removerPessoa(int matricula);

    public void alterarPessoa(Pessoa p, String cepAntigo, String numAntigo, int matAntigo);

    public Pessoa pesquisarPessoa(int matricula);

    public Pessoa pesquisarPessoaPorMatricula(int matricula);
    
    public ArrayList<Pessoa> pesquisarPessoaPorNome(String nome);
    
    public Pessoa pesquisarPessoaPorLogin(String login);
    
    

    public void adicionarAluno(Aluno a);

    public void removerAluno(int mat);

    public void alterarAluno(Aluno a, String cepAntigo, String numAntigo, int matAntigo);

    public Aluno pesquisarAluno(int mat);
    
    public ArrayList<Aluno> pesquisarAlunoPorNome(String nome);
    
    public ArrayList<Aluno> pesquisarAlunoPorAno(String ano);
    
    public Aluno pesquisarAlunoPorLogin(String login);

    public void adicionarProfessor(Professor p);

    public void removerProfessor(int mat);

    public void alterarProfessor(Professor p, String cepAntigo, String numAntigo, int matAntigo);

    public Professor pesquisarProfessor(int mat);
    
    public ArrayList<Professor> pesquisarProfessorPorNome(String nome);
    
    public ArrayList<Professor> pesquisarProfessorPorAno(String ano);
    

    public void adicionarAdministrador(Administrador a);

    public void removerAdministrador(int mat);

    public void alterarAdministrador(int mat);

    public Administrador pesquisarAdministrador(int mat);
    
    public ArrayList<Administrador> pesquisarAdministradorPorNome(String nome);


    
}
