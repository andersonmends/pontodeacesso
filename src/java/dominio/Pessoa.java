package dominio;

//import dados.CaixaDeMensagens;
import java.util.Date;
import javax.swing.Icon;

public class Pessoa {

    private long matricula;
    private String ultimoAcesso;
    private String email;
    private String tel1;
    private String tel2;
    private String login;
    private String nome;
    private String senha;
    private String sexo;
    private Icon foto;
    private Endereco endereco;
    private Documentos documentos;

    public Pessoa() {
    }

    public static Pessoa FabricaPessoa(long mat, String ultimoAcesso, String email, String tel1, String tel2,
            String login, String nome, String senha, String sexo, Icon foto, Endereco endereco, Documentos documentos) {

        Pessoa aux = new Pessoa();
        aux.setMatPessoa(mat);
        aux.setNome(nome);
        aux.setDocumentos(documentos);
        aux.setEndereco(endereco);
        aux.setEmail(email);
        aux.setFoto(foto);
        aux.setLogin(login);
        aux.setSenha(senha);
        aux.setTel1(tel1);
        aux.setTel2(tel2);
        aux.setUltimoAcesso(ultimoAcesso);
        aux.setSexo(sexo);

        return aux;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Icon getFoto() {
        return foto;
    }

    public void setFoto(Icon foto) {
        this.foto = foto;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getMatPessoa() {
        return matricula;
    }

    public void setMatPessoa(long matPessoa) {
        this.matricula = matPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(String ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Documentos getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Documentos documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Último Acesso: " + ultimoAcesso + ", email: " + email + ", Telefone 1: " + tel1 + ", Telefone 2: " + tel2 + ", Login: " + login + ", Nome: " + nome + ", Senha: " + senha + ", Sexo: " + sexo + ", Endereço: " + endereco + ", Documentos: " + documentos;
    }
}
