/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura;

import dominio.InterfaceRepositorioNoticia;
import dominio.Noticia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioNoticiaBD implements InterfaceRepositorioNoticia {

    public void adicionarNoticias(Noticia n) {

        
        
                
                
        String sql = "INSERT INTO NOTICIAS VALUES(" + n.getCod() + "," + "'" + n.getData() + "'" + "," + 0 + "," + "'" + n.getTitulo()
                + "'" + "," + "'" + n.getAssunto() + "'" + "," + "'" + n.getTexto() + "'" + ")";

        BancoDados bd = new BancoDados();
        bd.abrirBanco();
        try {
            bd.executarConsulta(sql);
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioNoticiaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Noticia> recuperarNoticias() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removerNoticia(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Noticia pesquisarNoticia(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void alterarNoticia(Noticia n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
