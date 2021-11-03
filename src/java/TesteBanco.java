
import infraestrutura.BancoDados;

import infraestrutura.BancoDados;
import java.sql.ResultSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Waléria Souza
 */
public class TesteBanco {
    public static void main(String[] args) {
        
        try {
        BancoDados banco = new BancoDados();
        banco.abrirBanco();
        
        ResultSet rs =  banco.executarConsulta("select * from PESSOA");
        
        while(rs.next()){
            String s = rs.getString("nome");
            System.out.println(s);
        }
        
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
