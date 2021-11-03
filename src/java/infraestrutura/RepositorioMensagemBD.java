/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura;

import dominio.InterfaceRepositorioMensagem;
import dominio.Mensagem;
import dominio.Pessoa;
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
public class RepositorioMensagemBD implements InterfaceRepositorioMensagem {

    private BancoDados bd = new BancoDados();
    private Connection con;

    public ArrayList<Mensagem> recuperarMensagens() {

        ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
        String sql = "SELECT * FROM mensagens;";
        ResultSet rs = null;

        bd.abrirBanco();

        try {
            rs = bd.executarConsulta(sql);

            while (rs.next()) {

                int cod = rs.getInt("COD");
                String destino = rs.getString("DESTINO");
                String rementente = rs.getString("REMETENTE");
                String assunto = rs.getString("ASSUNTO");
                String texto = rs.getString("TEXTO");

                Mensagem m = Mensagem.FabricaMensagem();
                m.setCod(cod);
                m.setDestino(destino);
                m.setRemetente(rementente);
                m.setAssunto(assunto);
                m.setTexto(texto);

                mensagens.add(m);
            }



        } catch (SQLException ex) {
            Logger.getLogger(RepositorioMensagemBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bd.fecharBanco();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioMensagemBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mensagens;
    }

    public Mensagem pesquisarMensagem(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void adicionarMensagem(Mensagem m) {


        try {

            con = bd.abrirBanco();

            String sql = "INSERT INTO MENSAGENS values(?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, "");
            pst.setInt(2, 30);
            pst.setInt(3, 30);
            pst.setString(4, m.getDestino());
            pst.setString(5, m.getRemetente());
            pst.setString(6, m.getAssunto());
            pst.setString(7, m.getTexto());

            pst.execute();


        } catch (SQLException ex) {
            Logger.getLogger(RepositorioMensagemBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bd.fecharBanco();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioMensagemBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterarMensagem(Mensagem m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deletarMensagem(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Mensagem> pesquisarMensagensPorAluno(int codAluno) {


        ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
        String sql = "SELECT aluno.codturma , mensagens.* FROM aluno, mensagens WHERE aluno.codturma = mensagens.destino and aluno.matpessoa = " + codAluno;
        ResultSet rs = null;

        bd.abrirBanco();

        try {
            rs = bd.executarConsulta(sql);

            while (rs.next()) {

                int cod = rs.getInt("COD");
                String destino = rs.getString("DESTINO");
                String rementente = rs.getString("REMETENTE");
                String assunto = rs.getString("ASSUNTO");
                String texto = rs.getString("TEXTO");

                Mensagem m = Mensagem.FabricaMensagem();
                m.setCod(cod);
                m.setDestino(destino);
                m.setRemetente(rementente);
                m.setAssunto(assunto);
                m.setTexto(texto);

                mensagens.add(m);
            }
            bd.fecharBanco();
            return mensagens;


        } catch (SQLException ex) {
            Logger.getLogger(RepositorioMensagemBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioMensagemBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;


    }
}
