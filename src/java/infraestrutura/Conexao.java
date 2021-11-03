package infraestrutura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import dominio.Aluno;


public class Conexao {

    Connection conn;
    Statement st;
    
    
    
    public Conexao() {
        open();
    }

    public void open() {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "SYSTEM", "admin");
            st = conn.createStatement();
            
            
            System.out.println("\n\nConexão Estabelecida!");


            /* UPDATE */
            //st.executeUpdate("UPDATE ALUNO SET NOME='MAH' WHERE CPF=123");
            //st.executeUpdate("UPDATE ALUNO SET NOME='JOAO' WHERE CPF=1234 ");

            /* DELETE */
            //st.execute("DELETE FROM ALUNO WHERE CPF=8888");

            /* CONSULTAR */
            //ResultSet rs = st.executeQuery("SELECT * FROM Aluno");

            /* RECUPERAR DADOS DA CONSULTA	*/
            /*
            while(rs.next()){
            int cpf = rs.getInt("CPF");
            String nome = rs.getString("NOME");
            System.out.println(cpf + ", " + nome);
            }
             */



        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao se conectar com o Driver");
            e.printStackTrace();
        }
    }

    public void cadastrar() throws SQLException {
        /* ADICIONAR */
        PreparedStatement pst = conn.prepareStatement("INSERT INTO ALUNO VALUES (?,?,?,?)");
        pst.setString(1, "nome");
        
        pst.execute();

        /*
        st.execute("INSERT INTO ALUNO VALUES ('" + aluno.getNome() + "', " + aluno.getCPF() + ")");
        System.out.println("Valor adicionado!");*/
    }
    
    public String alunoPorCod() throws SQLException {

            
            ResultSet rs = st.executeQuery("SELECT * FROM Pessoa");

            /* RECUPERAR DADOS DA CONSULTA	*/


            /*
            while(rs.next()){
            int cpf = rs.getInt("CPF");
            String nome = rs.getString("NOME");
            System.out.println(cpf + ", " + nome);
            }*/
            
            String nome = rs.getString("NOME");
            
            return nome;
    
    }

    
    public ArrayList<Aluno> listarTodosAlunos() throws SQLException {
            ResultSet rs = st.executeQuery("SELECT * FROM Pessoa");
            ArrayList<Aluno> lista = new ArrayList<Aluno>();
            
            /* RECUPERAR DADOS DA CONSULTA	*/
            
            while(rs.next()){
            String login = rs.getString("LOGIN");
            String senha = rs.getString("SENHA");
                        
            Aluno a = new Aluno();
//            a.setLogin(login);
//            a.setSenha(senha);
//            lista.add(a);
            }           
            
            
            return lista;
    
    }
    
}
