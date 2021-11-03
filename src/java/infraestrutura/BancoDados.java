package infraestrutura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import dominio.Aluno;

public class BancoDados {

    Connection con;
    Statement st;

    public Connection abrirBanco() {

        try {
            /*
             * Class.forName("oracle.jdbc.driver.OracleDriver"); conn =
             * DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE",
             * "SYSTEM", "admin"); st = conn.createStatement();
             */


            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:~/test";
            String user = "sa";
            String password = "sa";
            con = DriverManager.getConnection(url, user, password);

            /*
             * Class.forName("org.h2.Driver"); String url =
             * "jdbc:h2:~/Pontodeacesso"; String user = "sa"; String password =
             * ""; con = DriverManager.getConnection(url, user, password);
             */

            System.out.println("\n\nConexão Estabelecida!");
            return con;

        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao se conectar com o Driver");
            e.printStackTrace();
        }
        return null;
    }

    public void fecharBanco() throws SQLException {

        if (con != null) {
            con.close();
        }

        if (st != null) {
        }
    }

    public ResultSet executarConsulta(String sql) throws SQLException {


        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        return rs;

    }

    public void executarInsercao(String sql) throws SQLException {


        PreparedStatement pst = con.prepareStatement(sql);
        pst.execute();

    }

    public Connection getCon() {
        return con;
    }

    public Statement getSt() {
        return st;
    }
}
