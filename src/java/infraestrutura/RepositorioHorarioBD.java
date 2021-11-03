/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura;

import dominio.Horario;
import dominio.InterfaceRepositorioHorario;
import dominio.InterfaceRepositorioMensagem;
import dominio.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioHorarioBD implements InterfaceRepositorioHorario {

    private BancoDados bd = new BancoDados();
    Connection con;

    @Override
    public ArrayList<Horario> recuperarHorarios() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Horario> recuperarHorariosTurma(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Horario pesquisarHorario(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void adicionarHorario(Horario h) {

        try {

            String sql = "INSERT INTO HORARIO VALUES (?,?,?,?,?)";
            con = bd.abrirBanco();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, h.getCod());
            pst.setInt(2, h.getCodTurma());
            pst.setString(3, h.getHora());
            pst.setString(4, h.getDia());
            pst.setString(5, h.getDisciplina());
            pst.execute();

            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);

        }finally{
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioHorarioBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void alterarHorario(Horario h) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void deletarHorario(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
