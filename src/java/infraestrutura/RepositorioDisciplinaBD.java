/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura;

import dominio.Disciplina;
import dominio.InterfaceRepositorioDisciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anderson
 */
public class RepositorioDisciplinaBD implements InterfaceRepositorioDisciplina {

    private BancoDados bd = new BancoDados();
    Connection con;

    public ArrayList<Disciplina> recuperarDisciplinas() {

        String sql = "SELECT * FROM DISCIPLINA";
        Disciplina d = null;
        ResultSet rs = null;
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);

            while (rs.next()) {
                int codi = rs.getInt("COD");
                int codHorario = rs.getInt("HORARIOCOD");
                String nome = rs.getString("NOME");
                String descricao = rs.getString("DESCRICAO");
                int ch = rs.getInt("CARGAHORARIA");

                d = Disciplina.FabricaDisciplina(codi, descricao, ch, nome, null, null, null);
                disciplinas.add(d);

            }
            bd.fecharBanco();
            return disciplinas;

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return disciplinas;

    }

    @Override
    public Disciplina pesquisarDisciplina(int cod) {
        String sql = "SELECT * FROM DISCIPLINA WHERE COD = '" + cod + "'";
        Disciplina d = null;
        ResultSet rs = null;
        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);

            while (rs.next()) {
                int codi = rs.getInt("COD");
                int codHorario = rs.getInt("HORARIOCOD");
                String nome = rs.getString("NOME");
                String descricao = rs.getString("DESCRICAO");
                int ch = rs.getInt("CARGAHORARIA");

                d = Disciplina.FabricaDisciplina(codi, descricao, ch, nome, null, null, null);
                bd.fecharBanco();
                return d;
            }

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return d;
    }

    public void adicionarDisciplina(Disciplina d) {

        String sql = "INSERT INTO DISCIPLINA VALUES(?,?,?,?,?)";

        try {
            con = bd.abrirBanco();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, d.getCod());
            pst.setInt(2, 0);
            pst.setString(3, d.getNome());
            pst.setString(4, d.getDescricao());
            pst.setInt(5, d.getCargaHoraria());
            pst.execute();

            bd.fecharBanco();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }

    public void removerDisciplina(int cod) {

        String sql = "DELETE FROM DISCIPLINA WHERE COD = '" + cod + "'";
        con = bd.abrirBanco();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(sql);
            pst.execute();
            bd.fecharBanco();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void alterarDisciplina(Disciplina d, int codAntigo) {
        String sql = "DELETE FROM DISCIPLINA WHERE COD = '" + codAntigo + "'";
        con = bd.abrirBanco();
        PreparedStatement pst;

        try {
            pst = con.prepareStatement(sql);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
        }



        try {
            sql = "INSERT INTO DISCIPLINA VALUES(?,?,?,?,?)";
            con = bd.abrirBanco();
            pst = con.prepareStatement(sql);
            pst.setInt(1, codAntigo);
            pst.setInt(2, 0);
            pst.setString(3, d.getNome());
            pst.setString(4, d.getDescricao());
            pst.setInt(5, d.getCargaHoraria());
            pst.execute();

            bd.fecharBanco();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }

    @Override
    public ArrayList<Disciplina> pesquisarDisciplinasPorNome(String nomee) {
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        String sql = "SELECT * FROM DISCIPLINA WHERE NOME like'%" + nomee + "%'";
        Disciplina d = null;
        ResultSet rs = null;
        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);

            while (rs.next()) {
                int codi = rs.getInt("COD");
                int codHorario = rs.getInt("HORARIOCOD");
                String nome = rs.getString("NOME");
                String descricao = rs.getString("DESCRICAO");
                int ch = rs.getInt("CARGAHORARIA");

                d = Disciplina.FabricaDisciplina(codi, descricao, ch, nome, null, null, null);
                disciplinas.add(d);

            }
            bd.fecharBanco();
            return disciplinas;

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioDisciplinaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }
}
