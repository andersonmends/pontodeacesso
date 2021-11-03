package infraestrutura;

import dominio.Horario;
import dominio.InterfaceRepositorioTurma;
import dominio.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioTurmaBD implements InterfaceRepositorioTurma {

    private BancoDados bd = new BancoDados();
    Connection con;

    @Override
    public ArrayList<Turma> recuperarTurmas() {
        String sql = "SELECT * FROM TURMA";
        ResultSet rs = null;
        ArrayList<Turma> turmas = new ArrayList<Turma>();
        try {
            con = bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            int codi = 0;
            String turno = "";
            String serie = "";
            String classe = "";
            String ano = "";

            while (rs.next()) {

                codi = rs.getInt("COD");
                turno = rs.getString("TURNO");
                serie = rs.getString("SERIE");
                classe = rs.getString("CLASSE");
                ano = rs.getString("ANO");
                Turma t = Turma.FabricaTurma(codi, turno, serie, classe, ano, null, null, null, null, null);
                turmas.add(t);
            }

            bd.fecharBanco();
            return turmas;

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;

    }

    public Turma pesquisarTurmaPorCod(int cod) {

        String sql = "SELECT * FROM TURMA WHERE COD = " + cod;
        ResultSet rs = null;


        try {
            con = bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            int codi = 0;
            String turno = "";
            String serie = "";
            String classe = "";
            String ano = "";

            while (rs.next()) {

                codi = rs.getInt("COD");
                turno = rs.getString("TURNO");
                serie = rs.getString("SERIE");
                classe = rs.getString("CLASSE");
                ano = rs.getString("ANO");


            }
            bd.fecharBanco();
            Turma t = Turma.FabricaTurma(codi, turno, serie, classe, ano, null, null, null, null, null);
            return t;

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

    public void adicionarTurma(Turma t) {

        try {

            String sql = "INSERT INTO TURMA VALUES (?,?,?,?,?,?)";
            con = bd.abrirBanco();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, t.getCod());
            pst.setString(2, t.getTurno());
            pst.setInt(3, 0);
            pst.setString(4, t.getClasse());
            pst.setString(5, t.getAnoLetivo());
            pst.setString(6, t.getSerie());
            pst.execute();

            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void alterarTurma(Turma t, int codAntigo) {

        String sql = "SELECT * FROM HORARIO WHERE CODTURMA = " + codAntigo;
        ResultSet rs = null;
        ArrayList<Horario> horarios = new ArrayList<Horario>();

        try {
            con = bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {
                int codHorario = rs.getInt("COD");
                int codTurma = rs.getInt("CODTURMA");
                String hora = rs.getString("HORA");
                String dia = rs.getString("DIA");
                String disciplina = rs.getString("DISCIPLINA");
                Horario h = Horario.FabricaHorario(codHorario, codTurma, hora, dia, disciplina);
                horarios.add(h);
            }
            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            try {
                bd.fecharBanco();
            } catch (SQLException ex1) {
                Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }


        try {
            bd.abrirBanco();
            sql = "DELETE FROM HORARIO WHERE CODTURMA = '" + codAntigo + "'";
            bd.executarInsercao(sql);
            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
        }


        try {
            bd.abrirBanco();
            sql = "DELETE FROM TURMA WHERE COD = '" + codAntigo + "'";
            bd.executarInsercao(sql);
            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
        }



        try {

            sql = "INSERT INTO TURMA VALUES (?,?,?,?,?,?)";
            con = bd.abrirBanco();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, codAntigo);
            pst.setString(2, t.getTurno());
            pst.setInt(3, 0);
            pst.setString(4, t.getClasse());
            pst.setString(5, t.getAnoLetivo());
            pst.setString(6, t.getSerie());
            pst.execute();

            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Horario h1 = null;
            for (int i = 0; i < horarios.size(); i++) {
                h1 = horarios.get(i);


                sql = "INSERT INTO HORARIO VALUES (?,?,?,?,?)";
                con = bd.abrirBanco();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, h1.getCod());
                pst.setInt(2, codAntigo);
                pst.setString(3, h1.getHora());
                pst.setString(4, h1.getDia());
                pst.setString(5, h1.getDisciplina());

                pst.execute();

                bd.fecharBanco();
            }


        } catch (SQLException ex) {
            Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void deletarTurma(int cod) {

        try {
            bd.abrirBanco();
            String sql = "DELETE FROM TURMA WHERE COD = '" + cod + "'";
            bd.executarInsercao(sql);
            bd.fecharBanco();



        } catch (SQLException ex) {
            Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public int pesquisarTurma(Turma t) {
        //throw new UnsupportedOperationException("Not supported yet.");
        int cod = 0;


        String sql = "SELECT COD FROM TURMA WHERE SERIE = '" + t.getSerie() + "' AND TURNO = '" + t.getTurno() + "' AND CLASSE = '" + t.getClasse() + "' AND ANO = '" + t.getAnoLetivo() + "'";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);

            while (rs.next()) {

                cod = rs.getInt("COD");
                bd.fecharBanco();
                return cod;


            }

            // bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return 0;

    }

    public ArrayList<Horario> pegarHorarios(int codT) {

        String sql = "SELECT * FROM HORARIO WHERE CODTURMA = " + codT;
        ResultSet rs = null;
        ArrayList<Horario> horarios = new ArrayList<Horario>();

        try {
            con = bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {
                int codHorario = rs.getInt("COD");
                int codTurma = rs.getInt("CODTURMA");
                String hora = rs.getString("HORA");
                String dia = rs.getString("DIA");
                String disciplina = rs.getString("DISCIPLINA");
                Horario h = Horario.FabricaHorario(codHorario, codTurma, hora, dia, disciplina);
                horarios.add(h);
            }
            bd.fecharBanco();
            return horarios;

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

    @Override
    public ArrayList<Turma> pesquisarTurmaPorNome(String nome) {

        ArrayList<Turma> turmas = new ArrayList<Turma>();
        String sql = "SELECT * FROM TURMA WHERE SERIE = " + nome;
        ResultSet rs = null;


        try {
            con = bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            int codi = 0;
            String turno = "";
            String serie = "";
            String classe = "";
            String ano = "";

            while (rs.next()) {

                codi = rs.getInt("COD");
                turno = rs.getString("TURNO");
                serie = rs.getString("SERIE");
                classe = rs.getString("CLASSE");
                ano = rs.getString("ANO");

                Turma t = Turma.FabricaTurma(codi, turno, serie, classe, ano, null, null, null, null, null);
                turmas.add(t);
            }
            bd.fecharBanco();

            return turmas;

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

    @Override
    public ArrayList<Turma> pesquisarTurmaPorAno(String ano) {

        ArrayList<Turma> turmas = new ArrayList<Turma>();
        String sql = "SELECT * FROM TURMA WHERE ANO = " + ano;
        ResultSet rs = null;


        try {
            con = bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            int codi = 0;
            String turno = "";
            String serie = "";
            String classe = "";
            String anoo = "";

            while (rs.next()) {

                codi = rs.getInt("COD");
                turno = rs.getString("TURNO");
                serie = rs.getString("SERIE");
                classe = rs.getString("CLASSE");
                anoo = rs.getString("ANO");

                Turma t = Turma.FabricaTurma(codi, turno, serie, classe, anoo, null, null, null, null, null);
                turmas.add(t);
            }
            bd.fecharBanco();

            return turmas;

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioTurmaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }
}
