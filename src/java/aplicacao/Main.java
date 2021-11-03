package aplicacao;

import dominio.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static String converterEmData(Date data) {
        String corrigido = "";
        String mess = "";

        int mes = data.getMonth();
        if (mes == 4) {
            mess = "" + mes;
        }

        corrigido = data.getYear() + "-" + mess + "-" + data.getDay() + " " + data.getHours() + data.getMinutes() + data.getSeconds();

        return mes + " " + corrigido;
    }

    public static void main(String[] args) {

        Fachada f = Fachada.getInstance();



//        RepositorioPessoaBD r = new RepositorioPessoaBD();

//        Pessoa p2 = r.pesquisarPessoa(1);
//        System.out.println(p2.getLogin() + " - " + p2.getNome() + " " + p2.getSexo());


        //ArrayList<Nota> notas = new ArrayList<Nota>();

//
        //f.adicionarPessoa(p3);
//        ArrayList<Pessoa> p = f.recuperarPessoas();
//
//        for (int i = 0; i < p.size(); i++) {
//            Pessoa person = p.get(i);
//            System.out.println(person.toString());
//
//        }
//
//
//
        //Pessoa pt = f.pesquisarPessoaPorMatricula(1);


        //System.out.println(pt.toString());

//        Noticia n =  Noticia.FabricaNoticia(null, null, null, null, 01);
//        f.adicionarNoticias(n);


//        Horario h = Horario.FabricaHorario(6, 2, "09:10", "Segunda", "Geografia");
//        f.adicionarHorario(h);

//        Turma t = f.pesquisarTurmaPorCod(2);
//        System.out.println("Turma encontrada :" + t.toString());

        Disciplina d = Disciplina.FabricaDisciplina(32, "Estudos dos fenomenos humanos", 48, "Antropologia", null, null, null);
//        f.adicionarDisciplina(d);

        //int codt = f.pesquisarTurma(Turma.FabricaTurma(0, "Manhã", "3", "F", "2001", null, null, null, null, null));
        Turma t = Turma.FabricaTurma(75, "Manhã", "3", "F", "2001", null, null, null, null, null);
        //System.out.println(f.pesquisarTurma(t));

        Endereco end = Endereco.FabricaEndereco("0759488", "05588985", "Tr", "Venus", "Earth", "Rua de Venus");

        Documentos docs = new Documentos("02479854", "7990359", "SSP-PE", "1989-08-02");
        Pessoa p3 = Pessoa.FabricaPessoa(1000, "2012-06-05", "negadaaaa@gmail.com", "37610991", "99703237", "negadis", "Luiz Inacio", "vava", "M", null, end, docs);
//
        Aluno a = Aluno.FabricaAluno("Antonieta da Silva", "Carlos Gonçalves", t, null, 75, "2012-02-01", "carlos.cc@bol.com.br", "37610265", "99784521", "valdomiro", "Izaias Marques Junior", "esopradesifn2", "m", null, end, "0725544789", "357845", "ssppe", "1975-02-03");
//        
        //f.alterarAluno(a, "5505403", "200",2);
        // f.removerAluno(28);
        // Administrador adm = Administrador.FabricaAdministrador("2012-02-03", p3);

//        System.out.println(adm.toString());
//            f.adicionarAdministrador(adm);

//        Professor prof = Professor.FabricaProfessor("2012-03-04", "Mestre", 26, p3);
//
//        System.out.println("Professor : " + prof.toString());
//        f.adicionarProfessor(prof);
//        System.out.println("Pessoa : " + p3.toString());
//        f.alterarPessoa(p3, "55290000", "72", 26);
        //f.removerProfessor(47);
        //f.deletarTurma(6);

        Turma tt = Turma.FabricaTurma(10, "Noite", "1", "C", "2015", null, null, null, null, null);
//          f.alterarTurma(tt, 2);
//        Turma tr = f.pesquisarTurmaPorCod(2);
//
//        System.out.println("Turma já alterada: " + tr.toString());
//
//        ArrayList<Turma> turmas = f.recuperarTurmas();
////
//        for (int i = 0; i < turmas.size(); i++) {
//            Turma t1 = turmas.get(i);
//            System.out.println(t1.toString());
//            
//        }

//        System.out.println("Antes : " + f.pesquisarDisciplina(3));
//        f.alterarDisciplina(d, 3);
//        ArrayList<Turma> alunos = f.pesquisarTurmaPorAno("2005");
//
//        ArrayList<Turma> pf = f.recuperarTurmas();
//        for (int i = 0; i < pf.size(); i++) {
//
//            System.out.println(pf.get(i).toString());
//
//        }
//        if (pf.isEmpty()) {
//            System.out.println("é Vazia");
//        }
//        
        //System.out.println(f.pesquisarDisciplinasPorNome("Ge"));

        //f.alterarTurma(tt, 7);
        //f.removerDisciplina(2);
//        Mensagem m = Mensagem.FabricaMensagem("11:00", "3", "30", "Final de PPO", "O PPO está chegando e todo mundo ta é ferrado!", 6);
//
//        //f.adicionarMensagem(m);
        // ArrayList<Aluno> alunos = f.recuperarAlunos();


//
//        for (int i = 0; i < alunos.size(); i++) {
//
//            System.out.println(alunos.get(i).toString());
//
//
//        }
//        if (alunos.isEmpty()) {
//            System.out.println("é Vazia");
//        }

        //System.out.println(msgs.get(msgs.size() - 1));


        //Administrador adm = f.pesquisarAdministrador(30);

        //Professor pp = Professor.FabricaProfessor("2011-12-02", "Mestre", 48, p3);
        //f.adicionarProfessor(pp);
        //f.pesquisarProfessor(1000);
        //System.out.println(f.pesquisarAdministrador(9999));
//        Mensagem m = Mensagem.FabricaMensagem("2012-20-03", "1", "26", "As notas tao uma merda.", "é galera as notas tão uma merda,num sei o que posso fazer mas tem nego que não vai"
//                + "passar de ano viu, sinto mmuito!!", 1);
//        f.adicionarMensagem(m);

        // System.out.println(f.pesquisarAlunoPorLogin("negadis"));


//        ArrayList<Mensagem> msgs = f.pesquisarMensagensPorAluno(2);
//
//
//
//        for (int i = 0; i < msgs.size(); i++) {
//
//            System.out.println(msgs.get(i).toString());
//
//
//        }
//        if (msgs.isEmpty() || (msgs == null)) {
//            System.out.println("é Vazia");
//        }
        //f.deletarTurma(4);

        ArrayList<Mensagem> mensagens = f.pesquisarMensagensPorAluno(3);
        int o = mensagens.size();
        Mensagem mensagem = mensagens.get(0);
        System.out.println(mensagem);

        System.out.println("Tá vazia? :" + mensagens.isEmpty());

    }
}
