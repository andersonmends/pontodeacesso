package dominio;

import java.util.Date;

public class Administrador {

    private String dataAdm;
    private Pessoa pessoa;

    private Administrador() {
    }

    public static Administrador FabricaAdministrador(String dataAdm, Pessoa p) {

        Administrador aux = new Administrador();
        aux.setDataAdm(dataAdm);
        aux.setPessoa(p);

        return aux;
    }

    public String getDataAdm() {
        return dataAdm;
    }

    public void setDataAdm(String dataAdm) {
        this.dataAdm = dataAdm;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Administrador{" + "dataAdm=" + dataAdm + ", pessoa=" + pessoa + '}';
    }
    
    
}
