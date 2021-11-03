/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestrutura;

import dominio.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioCalendarioBD implements InterfaceRepositorioCalendario {
    
    private BancoDados bd = new BancoDados();
    Connection con;

    @Override
    public void adicionarEvento(Calendario c) {
        try{
            
            String sql = "INSERT INTO CALENDARIO VALUES (?,?,?,?)";
            con = bd.abrirBanco();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, c.getCod());
            pst.setInt(2, c.getCodTurma());
            pst.setString(3, c.getData());
            pst.setString(4, c.getEvento());
            pst.execute(sql);
            
            bd.fecharBanco();
        
        }catch(SQLException ex){
            Logger.getLogger(RepositorioCalendarioBD.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }

    @Override
    public void alterarCalendario(Calendario c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removerCalendario(int cod) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
  
  /*  @Override
    public void adicionarEvento(Calendario c) {
        
    }
    

   
    @Override
    public void removerCalendario(int cod) {
       /*  String data = null;
         String evento = null;
         String codCalendario = null;
         ResultSet rs = null;
        
         try {
             String sql = "SELECT COD.* DATA.*, EVENTO.* FROM CALENDARIO, '" + cod+ "'";
             con = bd.abrirBanco();
            
             rs = bd.executarConsulta(sql);
             while (rs.next()) {

                data = rs.getString("DATA");
                evento = rs.getString("EVENTO");

                codCalendario = rs.getString("codCalendario");
                System.out.println(data+ " " + evento + " " + codCalendario + " ");
            }

                sql = "DELETE FROM CALENDARIO WHERE COD = '" + cod + "'";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();

            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioCalendarioBD.class.getName()).log(Level.SEVERE, null, ex);

        }
    
       
    }


    @Override
    public void alterarCalendario(Calendario c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }*/
    
}
