package infraestrutura;

import aplicacao.Fachada;
import dominio.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RepositorioPessoaBD implements InterfaceRepositorioPessoa {

    private BancoDados bd = new BancoDados();
    Connection con;

    @Override
    public ArrayList<Pessoa> recuperarPessoas() {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        String sql = "SELECT * FROM pessoa;";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {



                long mat = rs.getLong("MATPESSOA");
                String login = rs.getString("LOGIN");

                String cep = rs.getString("CEPEND");
                String num = rs.getString("NUMEND");
                String ultac = rs.getString("ULTACESSO");
                String email = rs.getString("EMAIL");
                String t1 = rs.getString("TEL1");
                String t2 = rs.getString("TEL2");

                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String cpf = rs.getString("CPF");
                String rg = rs.getString("RG");
                String orgexp = rs.getString("ORGEXP");
                String dtNasc = rs.getString("DATANASC");

                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");



                Endereco end = Endereco.FabricaEndereco(rg, num, sexo, tipo, dtNasc, rg);
                Documentos doc = new Documentos(cpf, rg, orgexp, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, doc);



                pessoas.add(p);
            }
            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return pessoas;
    }

    @Override
    public ArrayList<Aluno> recuperarAlunos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Professor> recuperarProfessor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Administrador> recuperarAdministrador() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pessoa pesquisarPessoaPorMatricula(int matricula) {

        String sql = "select pessoa.*, endereco.* from pessoa, endereco where pessoa.matpessoa = '"
                + matricula
                + "' and pessoa.cepend = endereco.cep and pessoa.numend = endereco.num;";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {



                long mat = rs.getLong("MATPESSOA");
                String login = rs.getString("LOGIN");


                String ultac = rs.getString("ULTACESSO");
                String email = rs.getString("EMAIL");
                String t1 = rs.getString("TEL1");
                String t2 = rs.getString("TEL2");

                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String cpf = rs.getString("CPF");
                String rg = rs.getString("RG");
                String orgexp = rs.getString("ORGEXP");
                String dtNasc = rs.getString("DATANASC");

                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");

                String cep = rs.getString("CEPEND");
                String num = rs.getString("NUMEND");
                String bairro = rs.getString("BAIRRO");
                String estado = rs.getString("ESTADO");
                String cidade = rs.getString("CIDADE");
                String rua = rs.getString("RUA");


                Endereco end = Endereco.FabricaEndereco(cep, num, estado, bairro, cidade, rua);
                Documentos doc = new Documentos(cpf, rg, orgexp, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, doc);

                bd.fecharBanco();
                return p;

            }
            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;

    }

    @Override
    public Aluno pesquisarAluno(int matricula) {
        String sql = "select aluno.*, pessoa.*, endereco.* from aluno, pessoa, endereco where aluno.matpessoa = '"
                + matricula
                + "' and aluno.matpessoa = pessoa.matpessoa"
                + " and pessoa.cepend = endereco.cep and pessoa.numend = endereco.num;";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {



                long mat = rs.getLong("MATPESSOA");
                String login = rs.getString("LOGIN");


                String ultac = rs.getString("ULTACESSO");
                String email = rs.getString("EMAIL");
                String t1 = rs.getString("TEL1");
                String t2 = rs.getString("TEL2");

                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String cpf = rs.getString("CPF");
                String rg = rs.getString("RG");
                String orgexp = rs.getString("ORGEXP");
                String dtNasc = rs.getString("DATANASC");

                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");

                String cep = rs.getString("CEPEND");
                String num = rs.getString("NUMEND");
                String bairro = rs.getString("BAIRRO");
                String estado = rs.getString("ESTADO");
                String cidade = rs.getString("CIDADE");
                String rua = rs.getString("RUA");

                String nomepai = rs.getString("NOEMPAI");
                String nomemae = rs.getString("NOMEMAE");
                
                
                Fachada f = Fachada.getInstance();
                int codTurma = rs.getInt("CODTURMA");
                
                Turma t = f.pesquisarTurmaPorCod(codTurma);
                        


                Endereco end = Endereco.FabricaEndereco(cep, num, estado, bairro, cidade, rua);
                Documentos doc = new Documentos(cpf, rg, orgexp, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, doc);
                Aluno a = Aluno.FabricaAluno(nomemae, nomepai, t, null, mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, cpf, rg, orgexp, dtNasc);


                return a;

            }
            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public Professor pesquisarProfessor(int matricula) {
        String sql = "select professor.*, pessoa.*, endereco.* from professor, pessoa, endereco where professor.matpessoa = '"
                + matricula
                + "' and professor.matpessoa = pessoa.matpessoa"
                + " and pessoa.cepend = endereco.cep and pessoa.numend = endereco.num;";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {



                long mat = rs.getLong("MATPESSOA");
                String login = rs.getString("LOGIN");


                String ultac = rs.getString("ULTACESSO");
                String email = rs.getString("EMAIL");
                String t1 = rs.getString("TEL1");
                String t2 = rs.getString("TEL2");

                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String cpf = rs.getString("CPF");
                String rg = rs.getString("RG");
                String orgexp = rs.getString("ORGEXP");
                String dtNasc = rs.getString("DATANASC");

                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");

                String cep = rs.getString("CEPEND");
                String num = rs.getString("NUMEND");
                String bairro = rs.getString("BAIRRO");
                String estado = rs.getString("ESTADO");
                String cidade = rs.getString("CIDADE");
                String rua = rs.getString("RUA");


                String titulo = rs.getString("TITULACAO");
                String dtAd = rs.getString("DATAADM");
                int ch = rs.getInt("CH");



                Endereco end = Endereco.FabricaEndereco(cep, num, estado, bairro, cidade, rua);
                Documentos doc = new Documentos(cpf, rg, orgexp, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, doc);
                Professor pp = Professor.FabricaProfessor(dtAd, titulo, ch, p);



                return pp;

            }
            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public Administrador pesquisarAdministrador(int matricula) {
        String sql = "select administrador.*, pessoa.*, endereco.* from administrador, pessoa, endereco where administrador.matpessoa = '"
                + matricula
                + "' and administrador.matpessoa = pessoa.matpessoa"
                + " and pessoa.cepend = endereco.cep and pessoa.numend = endereco.num;";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {



                long mat = rs.getLong("MATPESSOA");
                String login = rs.getString("LOGIN");


                String ultac = rs.getString("ULTACESSO");
                String email = rs.getString("EMAIL");
                String t1 = rs.getString("TEL1");
                String t2 = rs.getString("TEL2");

                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String cpf = rs.getString("CPF");
                String rg = rs.getString("RG");
                String orgexp = rs.getString("ORGEXP");
                String dtNasc = rs.getString("DATANASC");

                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");

                String cep = rs.getString("CEPEND");
                String num = rs.getString("NUMEND");
                String bairro = rs.getString("BAIRRO");
                String estado = rs.getString("ESTADO");
                String cidade = rs.getString("CIDADE");
                String rua = rs.getString("RUA");

                String dtAdm = rs.getString("DATAADM");



                Endereco end = Endereco.FabricaEndereco(cep, num, estado, bairro, cidade, rua);
                Documentos doc = new Documentos(cpf, rg, orgexp, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, doc);
                Administrador adm = Administrador.FabricaAdministrador(dtAdm, p);

                return adm;

            }
            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);


        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public void adicionarPessoa(Pessoa p) {
        boolean ok = false;
        int mat = 0;
        try {
            con = bd.abrirBanco();
            //Inserir o ENDEREÇO
            try {

                String sql = "INSERT INTO ENDERECO VALUES(?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, p.getEndereco().getCEP());
                pst.setString(2, p.getEndereco().getNum());
                pst.setString(3, p.getEndereco().getEstado());
                pst.setString(4, p.getEndereco().getBairro());
                pst.setString(5, p.getEndereco().getCidade());
                pst.setString(6, p.getEndereco().getRua());
                pst.execute();

                ok = true;

            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                ok = false;
            }

            if (ok == true) {
                try {
                    //Ver qual a maior matricula

                    String sql = "SELECT max(matPessoa) from PESSOA";
                    ResultSet rs = bd.executarConsulta(sql);


                    while (rs.next()) {
                        mat = rs.getInt("MATPESSOA");

                    }



                } catch (Exception ex) {
                    Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                }



                try {
                    String sql = "INSERT INTO PESSOA VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, (int) p.getMatPessoa());
                    pst.setString(2, p.getEndereco().getCEP());
                    pst.setString(3, p.getEndereco().getNum());
                    pst.setString(4, p.getUltimoAcesso());
                    pst.setString(5, p.getDocumentos().getDtNasc());
                    pst.setString(6, p.getEmail());
                    pst.setString(7, p.getTel1());
                    pst.setString(8, p.getTel2());
                    pst.setString(9, p.getNome());
                    pst.setString(10, "Admin");
                    pst.setString(11, p.getDocumentos().getCpf());
                    pst.setString(12, p.getDocumentos().getRg());
                    pst.setString(13, p.getDocumentos().getOrExp());
                    pst.setString(14, p.getSenha());
                    pst.setString(15, p.getSexo());
                    pst.setString(16, p.getLogin());


                    pst.execute();

                    ok = true;
                    bd.fecharBanco();

                } catch (SQLException ex) {
                    Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    ok = false;
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        }




    }

    @Override
    public void removerPessoa(int matricula) {
        throw new UnsupportedOperationException("Não é possivel remover apenas pessoas do banco");
    }

    public Pessoa pesquisarPessoaPorLogin(String login) {
        ResultSet rs = null;
        String sql = "SELECT * FROM pessoa WHERE login = '" + login + "';";

        bd.abrirBanco();
        try {
            rs = bd.executarConsulta(sql);

            //Pessoa p = Pessoa.FabricaPessoa();
            Pessoa p = new Pessoa();
            while (rs.next()) {

                String loginPessoa = rs.getString("LOGIN");
                String senha = rs.getString("SENHA");


                p.setLogin(loginPessoa);
                p.setSenha(senha);
            }
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        }


        return null;
    }

    @Override
    public Pessoa pesquisarPessoa(int matricula) {
        ResultSet rs = null;
        String sql = "SELECT * FROM pessoa WHERE matpessoa = '" + matricula + "';";

        bd.abrirBanco();
        try {
            rs = bd.executarConsulta(sql);

            //Pessoa p = Pessoa.FabricaPessoa();
            Pessoa p = new Pessoa();
            while (rs.next()) {

                String loginPessoa = rs.getString("LOGIN");
                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");



                p.setLogin(loginPessoa);
                p.setSenha(senha);
                p.setSexo(sexo);
            }
            bd.fecharBanco();
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


        return null;
    }

    @Override
    public ArrayList<Pessoa> pesquisarPessoaPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void adicionarAluno(Aluno p) {
        boolean ok = false;
        int mat = 0;

        try {
            con = bd.abrirBanco();
            //Inserir o ENDEREÇO
            try {

                String sql = "INSERT INTO ENDERECO VALUES(?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, p.getPessoa().getEndereco().getCEP());
                pst.setString(2, p.getPessoa().getEndereco().getNum());
                pst.setString(3, p.getPessoa().getEndereco().getEstado());
                pst.setString(4, p.getPessoa().getEndereco().getBairro());
                pst.setString(5, p.getPessoa().getEndereco().getCidade());
                pst.setString(6, p.getPessoa().getEndereco().getRua());
                pst.execute();

                ok = true;

            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                ok = false;
            }

            if (ok == true) {
                try {
                    //Ver qual a maior matricula
//
//                    String sql = "SELECT max(matPessoa) from PESSOA";
//                    ResultSet rs = bd.executarConsulta(sql);
//                    
//                    
//                    while (rs.next()) {
//                        mat = rs.getInt("MATPESSOA");
//                        
//                    }
//                    
                } catch (Exception ex) {
                    Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                }



                try {
                    String sql = "INSERT INTO PESSOA VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, (int) p.getPessoa().getMatPessoa());
                    pst.setString(2, p.getPessoa().getEndereco().getCEP());
                    pst.setString(3, p.getPessoa().getEndereco().getNum());
                    pst.setString(4, p.getPessoa().getUltimoAcesso());
                    pst.setString(5, p.getPessoa().getDocumentos().getDtNasc());
                    pst.setString(6, p.getPessoa().getEmail());
                    pst.setString(7, p.getPessoa().getTel1());
                    pst.setString(8, p.getPessoa().getTel2());
                    pst.setString(9, p.getPessoa().getNome());
                    pst.setString(10, "Aluno");
                    pst.setString(11, p.getPessoa().getDocumentos().getCpf());
                    pst.setString(12, p.getPessoa().getDocumentos().getRg());
                    pst.setString(13, p.getPessoa().getDocumentos().getOrExp());
                    pst.setString(14, p.getPessoa().getSenha());
                    pst.setString(15, p.getPessoa().getSexo());
                    pst.setString(16, p.getPessoa().getLogin());


                    pst.execute();
                    try {
                        //Ver qual a maior matricula

                        sql = "INSERT INTO ALUNO VALUES (?,?,?,?)";
                        pst = con.prepareStatement(sql);
                        pst.setInt(1, (int) p.getPessoa().getMatPessoa());
                        pst.setInt(2, p.getTurma().getCod());
                        pst.setString(3, p.getNomeMae());
                        pst.setString(4, p.getNomePai());
                        pst.execute();

                        bd.fecharBanco();


                    } catch (Exception ex) {
                        Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ok = true;
                    bd.fecharBanco();

                } catch (SQLException ex) {
                    Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    ok = false;
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }

    @Override
    public void removerAluno(int mat) {
        String cepEnd = null;
        String numEnd = null;
        String matPessoa = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT PESSOA.* , ALUNO.*, ENDERECO.* FROM PESSOA , ALUNO , ENDERECO WHERE PESSOA.CEPEND = ENDERECO.CEP AND "
                    + "ALUNO.MATPESSOA  = PESSOA.MATPESSOA AND PESSOA.NUMEND = ENDERECO.NUM AND ALUNO.MATPESSOA = '" + mat + "'";
            con = bd.abrirBanco();

            rs = bd.executarConsulta(sql);

            while (rs.next()) {

                cepEnd = rs.getString("CEPEND");
                numEnd = rs.getString("NUMEND");

                matPessoa = rs.getString("MATPESSOA");
                System.out.println(cepEnd + " " + numEnd + " " + matPessoa + " ");
            }

            sql = "DELETE FROM ENDERECO WHERE CEP = '" + cepEnd + "' AND NUM = '" + numEnd + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            sql = "DELETE FROM PESSOA WHERE MATPESSOA = '" + matPessoa + "'";
            pst = con.prepareStatement(sql);
            pst.execute();

            sql = "DELETE FROM ALUNO WHERE MATPESSOA = '" + matPessoa + "'";
            pst = con.prepareStatement(sql);
            pst.execute();

            bd.fecharBanco();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @Override
    public void alterarAluno(Aluno p, String cepAntigo, String numAntigo, int matAntigo) {
        boolean ok = false;


        try {
            con = bd.abrirBanco();
            //Inserir o ENDEREÇO
            try {

                String sql = "DELETE FROM ENDERECO WHERE CEP = '" + cepAntigo + "' AND NUM = '" + numAntigo + "'";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();

                sql = "INSERT INTO ENDERECO VALUES(?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, p.getPessoa().getEndereco().getCEP());
                pst.setString(2, p.getPessoa().getEndereco().getNum());
                pst.setString(3, p.getPessoa().getEndereco().getEstado());
                pst.setString(4, p.getPessoa().getEndereco().getBairro());
                pst.setString(5, p.getPessoa().getEndereco().getCidade());
                pst.setString(6, p.getPessoa().getEndereco().getRua());
                pst.execute();

                ok = true;

            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                ok = false;
            }

            if (ok == true) {
                try {

                    String sql = "DELETE FROM PESSOA WHERE MATPESSOA = '" + matAntigo + "'";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.execute();

                    sql = "INSERT INTO PESSOA VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setInt(1, (int) p.getPessoa().getMatPessoa());
                    pst.setString(2, p.getPessoa().getEndereco().getCEP());
                    pst.setString(3, p.getPessoa().getEndereco().getNum());
                    pst.setString(4, p.getPessoa().getUltimoAcesso());
                    pst.setString(5, p.getPessoa().getDocumentos().getDtNasc());
                    pst.setString(6, p.getPessoa().getEmail());
                    pst.setString(7, p.getPessoa().getTel1());
                    pst.setString(8, p.getPessoa().getTel2());
                    pst.setString(9, p.getPessoa().getNome());
                    pst.setString(10, "Aluno");
                    pst.setString(11, p.getPessoa().getDocumentos().getCpf());
                    pst.setString(12, p.getPessoa().getDocumentos().getRg());
                    pst.setString(13, p.getPessoa().getDocumentos().getOrExp());
                    pst.setString(14, p.getPessoa().getSenha());
                    pst.setString(15, p.getPessoa().getSexo());
                    pst.setString(16, p.getPessoa().getLogin());
                    pst.execute();
                    try {
                        //Ver qual a maior matricula

                        sql = "DELETE FROM ALUNO WHERE MATPESSOA = '" + matAntigo + "'";
                        pst = con.prepareStatement(sql);
                        pst.execute();


                        sql = "INSERT INTO ALUNO VALUES (?,?,?,?)";
                        pst = con.prepareStatement(sql);
                        pst.setInt(1, (int) p.getPessoa().getMatPessoa());
                        pst.setInt(2, p.getTurma().getCod());
                        pst.setString(3, p.getNomeMae());
                        pst.setString(4, p.getNomePai());
                        pst.execute();

                        bd.fecharBanco();


                    } catch (Exception ex) {
                        Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ok = true;
                    bd.fecharBanco();

                } catch (SQLException ex) {
                    Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    ok = false;
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @Override
    public ArrayList<Aluno> pesquisarAlunoPorNome(String nomee) {

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        String sql = "select aluno.*, pessoa.*, endereco.* from aluno, pessoa, endereco where pessoa.nome like'%" + nomee + "%'"
                + " and aluno.matpessoa = pessoa.matpessoa"
                + " and pessoa.cepend = endereco.cep and pessoa.numend = endereco.num;";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {



                long mat = rs.getLong("MATPESSOA");
                String login = rs.getString("LOGIN");


                String ultac = rs.getString("ULTACESSO");
                String email = rs.getString("EMAIL");
                String t1 = rs.getString("TEL1");
                String t2 = rs.getString("TEL2");

                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String cpf = rs.getString("CPF");
                String rg = rs.getString("RG");
                String orgexp = rs.getString("ORGEXP");
                String dtNasc = rs.getString("DATANASC");

                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");

                String cep = rs.getString("CEPEND");
                String num = rs.getString("NUMEND");
                String bairro = rs.getString("BAIRRO");
                String estado = rs.getString("ESTADO");
                String cidade = rs.getString("CIDADE");
                String rua = rs.getString("RUA");

                String nomepai = rs.getString("NOEMPAI");
                String nomemae = rs.getString("NOMEMAE");
                
                


                Endereco end = Endereco.FabricaEndereco(cep, num, estado, bairro, cidade, rua);
                Documentos doc = new Documentos(cpf, rg, orgexp, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, doc);
                Aluno a = Aluno.FabricaAluno(nomemae, nomepai, null, null, mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, cpf, rg, orgexp, dtNasc);
                alunos.add(a);



            }

            bd.fecharBanco();
            return alunos;


        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } finally {
            try {
                bd.fecharBanco();

            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void adicionarProfessor(Professor a) {

        boolean ok = false;
        int mat = 0;

        try {
            con = bd.abrirBanco();
            //Inserir o ENDEREÇO
            try {

                String sql = "INSERT INTO ENDERECO VALUES(?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, a.getPessoa().getEndereco().getCEP());
                pst.setString(2, a.getPessoa().getEndereco().getNum());
                pst.setString(3, a.getPessoa().getEndereco().getEstado());
                pst.setString(4, a.getPessoa().getEndereco().getBairro());
                pst.setString(5, a.getPessoa().getEndereco().getCidade());
                pst.setString(6, a.getPessoa().getEndereco().getRua());
                pst.execute();

                ok = true;

            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                ok = false;
            }

            if (ok == true) {
                try {
                } catch (Exception ex) {
                    Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                }



                try {
                    String sql = "INSERT INTO PESSOA VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, (int) a.getPessoa().getMatPessoa());
                    pst.setString(2, a.getPessoa().getEndereco().getCEP());
                    pst.setString(3, a.getPessoa().getEndereco().getNum());
                    pst.setString(4, a.getPessoa().getUltimoAcesso());
                    pst.setString(5, a.getPessoa().getDocumentos().getDtNasc());
                    pst.setString(6, a.getPessoa().getEmail());
                    pst.setString(7, a.getPessoa().getTel1());
                    pst.setString(8, a.getPessoa().getTel2());
                    pst.setString(9, a.getPessoa().getNome());
                    pst.setString(10, "Professor");
                    pst.setString(11, a.getPessoa().getDocumentos().getCpf());
                    pst.setString(12, a.getPessoa().getDocumentos().getRg());
                    pst.setString(13, a.getPessoa().getDocumentos().getOrExp());
                    pst.setString(14, a.getPessoa().getSenha());
                    pst.setString(15, a.getPessoa().getSexo());
                    pst.setString(16, a.getPessoa().getLogin());


                    pst.execute();
                    try {
                        sql = "INSERT INTO PROFESSOR VALUES (?,?,?,?)";
                        pst = con.prepareStatement(sql);
                        pst.setInt(1, (int) a.getPessoa().getMatPessoa());
                        pst.setString(2, a.getDataAdm());
                        pst.setString(3, a.getTitulacao());
                        pst.setInt(4, a.getCargaHoraria());
                        pst.execute();

                        bd.fecharBanco();

                    } catch (Exception ex) {
                        Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ok = true;
                    bd.fecharBanco();

                } catch (SQLException ex) {
                    Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    ok = false;
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void removerProfessor(int mat) {
        String cepEnd = null;
        String numEnd = null;
        String matPessoa = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT PESSOA.* , PROFESSOR.*, ENDERECO.* FROM PESSOA , PROFESSOR , ENDERECO WHERE PESSOA.CEPEND = ENDERECO.CEP AND "
                    + "PROFESSOR.MATPESSOA  = PESSOA.MATPESSOA AND PESSOA.NUMEND = ENDERECO.NUM AND PROFESSOR.MATPESSOA = '" + mat + "'";
            con = bd.abrirBanco();

            rs = bd.executarConsulta(sql);

            while (rs.next()) {

                cepEnd = rs.getString("CEPEND");
                numEnd = rs.getString("NUMEND");

                matPessoa = rs.getString("MATPESSOA");
                System.out.println(cepEnd + " " + numEnd + " " + matPessoa + " ");
            }

            sql = "DELETE FROM ENDERECO WHERE CEP = '" + cepEnd + "' AND NUM = '" + numEnd + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            sql = "DELETE FROM PROFESSOR WHERE MATPESSOA = '" + matPessoa + "'";
            pst = con.prepareStatement(sql);
            pst.execute();

            sql = "DELETE FROM PESSOA WHERE MATPESSOA = '" + matPessoa + "'";
            pst = con.prepareStatement(sql);
            pst.execute();



            bd.fecharBanco();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void alterarProfessor(Professor p, String cepAntigo, String numAntigo, int matAntigo) {
        boolean ok = false;


        try {
            con = bd.abrirBanco();
            //Inserir o ENDEREÇO
            try {

                String sql = "DELETE FROM ENDERECO WHERE CEP = '" + cepAntigo + "' AND NUM = '" + numAntigo + "'";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();

                sql = "INSERT INTO ENDERECO VALUES(?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, cepAntigo);
                pst.setString(2, numAntigo);
                pst.setString(3, p.getPessoa().getEndereco().getEstado());
                pst.setString(4, p.getPessoa().getEndereco().getBairro());
                pst.setString(5, p.getPessoa().getEndereco().getCidade());
                pst.setString(6, p.getPessoa().getEndereco().getRua());
                pst.execute();
                System.out.println("Deletou o endereço");
                ok = true;

            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                ok = false;
            }

            if (ok == true) {
                try {

                    String sql = "DELETE FROM PESSOA WHERE MATPESSOA = '" + matAntigo + "'";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.execute();

                    System.out.println("Deletou a Pessoa");


                    sql = "INSERT INTO PESSOA VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setInt(1, (int) matAntigo);
                    pst.setString(2, p.getPessoa().getEndereco().getCEP());
                    pst.setString(3, p.getPessoa().getEndereco().getNum());
                    pst.setString(4, p.getPessoa().getUltimoAcesso());
                    pst.setString(5, p.getPessoa().getDocumentos().getDtNasc());
                    pst.setString(6, p.getPessoa().getEmail());
                    pst.setString(7, p.getPessoa().getTel1());
                    pst.setString(8, p.getPessoa().getTel2());
                    pst.setString(9, p.getPessoa().getNome());
                    pst.setString(10, "Professor");
                    pst.setString(11, p.getPessoa().getDocumentos().getCpf());
                    pst.setString(12, p.getPessoa().getDocumentos().getRg());
                    pst.setString(13, p.getPessoa().getDocumentos().getOrExp());
                    pst.setString(14, p.getPessoa().getSenha());
                    pst.setString(15, p.getPessoa().getSexo());
                    pst.setString(16, p.getPessoa().getLogin());
                    pst.execute();
                    System.out.println("Reinseriu a Pessoa");
                    try {
                        //Ver qual a maior matricula

                        sql = "DELETE FROM PROFESSOR WHERE MATPESSOA = '" + matAntigo + "'";
                        pst = con.prepareStatement(sql);
                        pst.execute();
                        System.out.println("Deletou o porfessor");

                        sql = "INSERT INTO PROFESSOR VALUES (?,?,?,?)";
                        pst = con.prepareStatement(sql);
                        pst.setInt(1, matAntigo);
                        pst.setString(2, p.getDataAdm());
                        pst.setString(3, p.getTitulacao());
                        pst.setInt(4, p.getCargaHoraria());
                        pst.execute();
                        System.out.println("Deletou o porfessor");
                        bd.fecharBanco();


                    } catch (Exception ex) {
                        Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ok = true;
                    bd.fecharBanco();

                } catch (SQLException ex) {
                    Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    ok = false;
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @Override
    public ArrayList<Professor> pesquisarProfessorPorNome(String nomee) {

        ArrayList<Professor> profs = new ArrayList<Professor>();
        String sql = "select professor.*, pessoa.*, endereco.* from professor, pessoa, endereco where pessoa.nome like '%" + nomee + "%'"
                + " and professor.matpessoa = pessoa.matpessoa"
                + " and pessoa.cepend = endereco.cep and pessoa.numend = endereco.num;";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {



                long mat = rs.getLong("MATPESSOA");
                String login = rs.getString("LOGIN");


                String ultac = rs.getString("ULTACESSO");
                String email = rs.getString("EMAIL");
                String t1 = rs.getString("TEL1");
                String t2 = rs.getString("TEL2");

                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String cpf = rs.getString("CPF");
                String rg = rs.getString("RG");
                String orgexp = rs.getString("ORGEXP");
                String dtNasc = rs.getString("DATANASC");

                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");

                String cep = rs.getString("CEPEND");
                String num = rs.getString("NUMEND");
                String bairro = rs.getString("BAIRRO");
                String estado = rs.getString("ESTADO");
                String cidade = rs.getString("CIDADE");
                String rua = rs.getString("RUA");

                String titulo = rs.getString("TITULACAO");
                String dataAdm = rs.getString("DATAADM");
                int cargaHoraria = rs.getInt("CH");




                Endereco end = Endereco.FabricaEndereco(cep, num, estado, bairro, cidade, rua);
                Documentos doc = new Documentos(cpf, rg, orgexp, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, doc);
                Professor professor = Professor.FabricaProfessor(dataAdm, titulo, cargaHoraria, p);

                profs.add(professor);

            }

            bd.fecharBanco();
            return profs;


        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } finally {
            try {
                bd.fecharBanco();

            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void adicionarAdministrador(Administrador a) {
        boolean ok = false;
        int mat = 0;

        try {
            con = bd.abrirBanco();
            //Inserir o ENDEREÇO
            try {

                String sql = "INSERT INTO ENDERECO VALUES(?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, a.getPessoa().getEndereco().getCEP());
                pst.setString(2, a.getPessoa().getEndereco().getNum());
                pst.setString(3, a.getPessoa().getEndereco().getEstado());
                pst.setString(4, a.getPessoa().getEndereco().getBairro());
                pst.setString(5, a.getPessoa().getEndereco().getCidade());
                pst.setString(6, a.getPessoa().getEndereco().getRua());
                pst.execute();

                ok = true;

            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                ok = false;
            }

            if (ok == true) {
                try {
                    //Ver qual a maior matricula
//
//                    String sql = "SELECT max(matPessoa) from PESSOA";
//                    ResultSet rs = bd.executarConsulta(sql);
//                    
//                    
//                    while (rs.next()) {
//                        mat = rs.getInt("MATPESSOA");
//                        
//                    }
//                    
                } catch (Exception ex) {
                    Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                }



                try {
                    String sql = "INSERT INTO PESSOA VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, (int) a.getPessoa().getMatPessoa());
                    pst.setString(2, a.getPessoa().getEndereco().getCEP());
                    pst.setString(3, a.getPessoa().getEndereco().getNum());
                    pst.setString(4, a.getPessoa().getUltimoAcesso());
                    pst.setString(5, a.getPessoa().getDocumentos().getDtNasc());
                    pst.setString(6, a.getPessoa().getEmail());
                    pst.setString(7, a.getPessoa().getTel1());
                    pst.setString(8, a.getPessoa().getTel2());
                    pst.setString(9, a.getPessoa().getNome());
                    pst.setString(10, "Administrador");
                    pst.setString(11, a.getPessoa().getDocumentos().getCpf());
                    pst.setString(12, a.getPessoa().getDocumentos().getRg());
                    pst.setString(13, a.getPessoa().getDocumentos().getOrExp());
                    pst.setString(14, a.getPessoa().getSenha());
                    pst.setString(15, a.getPessoa().getSexo());
                    pst.setString(16, a.getPessoa().getLogin());


                    pst.execute();
                    try {
                        //Ver qual a maior matricula

                        sql = "INSERT INTO ADMINISTRADOR VALUES (?,?)";
                        pst = con.prepareStatement(sql);
                        pst.setInt(1, (int) a.getPessoa().getMatPessoa());
                        pst.setString(2, a.getDataAdm());
                        pst.execute();

                        bd.fecharBanco();


                    } catch (Exception ex) {
                        Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ok = true;
                    bd.fecharBanco();

                } catch (SQLException ex) {
                    Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
                    ok = false;
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void removerAdministrador(int mat) {
        String cepEnd = null;
        String numEnd = null;
        String matPessoa = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT PESSOA.* , ADMINISTRADOR.*, ENDERECO.* FROM PESSOA , ADMINISTRADOR , ENDERECO WHERE PESSOA.CEPEND = ENDERECO.CEP AND "
                    + "ADMINISTRADOR.MATPESSOA  = PESSOA.MATPESSOA AND PESSOA.NUMEND = ENDERECO.NUM AND ADMINISTRADOR.MATPESSOA = '" + mat + "'";
            con = bd.abrirBanco();

            rs = bd.executarConsulta(sql);

            while (rs.next()) {

                cepEnd = rs.getString("CEPEND");
                numEnd = rs.getString("NUMEND");

                matPessoa = rs.getString("MATPESSOA");
                System.out.println(cepEnd + " " + numEnd + " " + matPessoa + " ");
            }

            sql = "DELETE FROM ENDERECO WHERE CEP = '" + cepEnd + "' AND NUM = '" + numEnd + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            sql = "DELETE FROM ADMINISTRADOR WHERE MATPESSOA = '" + matPessoa + "'";
            pst = con.prepareStatement(sql);
            pst.execute();

            sql = "DELETE FROM PESSOA WHERE MATPESSOA = '" + matPessoa + "'";
            pst = con.prepareStatement(sql);
            pst.execute();

            bd.fecharBanco();
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void alterarAdministrador(int mat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Administrador> pesquisarAdministradorPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void alterarPessoa(Pessoa a, String cepAntigo, String numAntigo, int matAntigo) {
        try {
            con = bd.abrirBanco();

            String sql = "DELETE FROM ENDERECO WHERE CEP = '" + cepAntigo + "' AND NUM = '" + numAntigo + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            sql = "INSERT INTO ENDERECO VALUES(?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, a.getEndereco().getCEP());
            pst.setString(2, a.getEndereco().getNum());
            pst.setString(3, a.getEndereco().getEstado());
            pst.setString(4, a.getEndereco().getBairro());
            pst.setString(5, a.getEndereco().getCidade());
            pst.setString(6, a.getEndereco().getRua());
            pst.execute();






        } catch (Exception ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Aluno> pesquisarAlunoPorAno(String ano) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        String sql = "select aluno.* , endereco.*, pessoa.*, turma.* from aluno, endereco, pessoa , turma where turma.ano =" + ano + "and aluno.matpessoa = pessoa.matpessoa and pessoa.cepend = endereco.cep and pessoa.numend = endereco.num and aluno.codturma = turma.cod ";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {



                long mat = rs.getLong("MATPESSOA");
                String login = rs.getString("LOGIN");


                String ultac = rs.getString("ULTACESSO");
                String email = rs.getString("EMAIL");
                String t1 = rs.getString("TEL1");
                String t2 = rs.getString("TEL2");

                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String cpf = rs.getString("CPF");
                String rg = rs.getString("RG");
                String orgexp = rs.getString("ORGEXP");
                String dtNasc = rs.getString("DATANASC");

                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");

                String cep = rs.getString("CEPEND");
                String num = rs.getString("NUMEND");
                String bairro = rs.getString("BAIRRO");
                String estado = rs.getString("ESTADO");
                String cidade = rs.getString("CIDADE");
                String rua = rs.getString("RUA");

                String nomepai = rs.getString("NOEMPAI");
                String nomemae = rs.getString("NOMEMAE");

                int codTurma = rs.getInt("COD");
                String turno = rs.getString("TURNO");
                String qntMsg = rs.getString("QTDMSG");
                String classe = rs.getString("CLASSE");
                String anot = rs.getString("ANO");
                String serie = rs.getString("SERIE");


                Turma t = Turma.FabricaTurma(codTurma, turno, serie, classe, anot, null, null, null, null, null);
                Endereco end = Endereco.FabricaEndereco(cep, num, estado, bairro, cidade, rua);
                Documentos doc = new Documentos(cpf, rg, orgexp, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, doc);
                Aluno a = Aluno.FabricaAluno(nomemae, nomepai, null, null, mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, cpf, rg, orgexp, dtNasc);
                alunos.add(a);



            }

            bd.fecharBanco();
            return alunos;


        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } finally {
            try {
                bd.fecharBanco();

            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<Professor> pesquisarProfessorPorAno(String ano) {

        ArrayList<Professor> profs = new ArrayList<Professor>();
        String sql = "select professor.*, pessoa.*, endereco.* from professor, pessoa, endereco where professor.dataadm like '" + ano + "%'"
                + " and professor.matpessoa = pessoa.matpessoa"
                + " and pessoa.cepend = endereco.cep and pessoa.numend = endereco.num;";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {



                long mat = rs.getLong("MATPESSOA");
                String login = rs.getString("LOGIN");


                String ultac = rs.getString("ULTACESSO");
                String email = rs.getString("EMAIL");
                String t1 = rs.getString("TEL1");
                String t2 = rs.getString("TEL2");

                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String cpf = rs.getString("CPF");
                String rg = rs.getString("RG");
                String orgexp = rs.getString("ORGEXP");
                String dtNasc = rs.getString("DATANASC");

                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");

                String cep = rs.getString("CEPEND");
                String num = rs.getString("NUMEND");
                String bairro = rs.getString("BAIRRO");
                String estado = rs.getString("ESTADO");
                String cidade = rs.getString("CIDADE");
                String rua = rs.getString("RUA");

                String titulo = rs.getString("TITULACAO");
                String dataAdm = rs.getString("DATAADM");
                int cargaHoraria = rs.getInt("CH");




                Endereco end = Endereco.FabricaEndereco(cep, num, estado, bairro, cidade, rua);
                Documentos doc = new Documentos(cpf, rg, orgexp, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, doc);
                Professor professor = Professor.FabricaProfessor(dataAdm, titulo, cargaHoraria, p);

                profs.add(professor);

            }

            bd.fecharBanco();
            return profs;


        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } finally {
            try {
                bd.fecharBanco();

            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Aluno pesquisarAlunoPorLogin(String matricula) {
        String sql = "select aluno.*, pessoa.*, endereco.* from aluno, pessoa, endereco where aluno.login = '"
                + matricula
                + "' and aluno.matpessoa = pessoa.matpessoa"
                + " and pessoa.cepend = endereco.cep and pessoa.numend = endereco.num;";
        ResultSet rs = null;

        try {
            bd.abrirBanco();
            rs = bd.executarConsulta(sql);


            while (rs.next()) {



                long mat = rs.getLong("MATPESSOA");
                String login = rs.getString("LOGIN");


                String ultac = rs.getString("ULTACESSO");
                String email = rs.getString("EMAIL");
                String t1 = rs.getString("TEL1");
                String t2 = rs.getString("TEL2");

                String nome = rs.getString("NOME");
                String tipo = rs.getString("TIPO");
                String cpf = rs.getString("CPF");
                String rg = rs.getString("RG");
                String orgexp = rs.getString("ORGEXP");
                String dtNasc = rs.getString("DATANASC");

                String senha = rs.getString("SENHA");
                String sexo = rs.getString("SEXO");

                String cep = rs.getString("CEPEND");
                String num = rs.getString("NUMEND");
                String bairro = rs.getString("BAIRRO");
                String estado = rs.getString("ESTADO");
                String cidade = rs.getString("CIDADE");
                String rua = rs.getString("RUA");

                String nomepai = rs.getString("NOEMPAI");
                String nomemae = rs.getString("NOMEMAE");



                Endereco end = Endereco.FabricaEndereco(cep, num, estado, bairro, cidade, rua);
                Documentos doc = new Documentos(cpf, rg, orgexp, dtNasc);
                Pessoa p = Pessoa.FabricaPessoa(mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, doc);
                Aluno a = Aluno.FabricaAluno(nomemae, nomepai, null, null, mat, ultac, email, t1, t2, login, nome, senha, sexo, null, end, cpf, rg, orgexp, dtNasc);


                return a;

            }
            bd.fecharBanco();

        } catch (SQLException ex) {
            Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        } finally {
            try {
                bd.fecharBanco();
            } catch (SQLException ex) {
                Logger.getLogger(RepositorioPessoaBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
