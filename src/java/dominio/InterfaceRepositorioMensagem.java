/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

import java.util.ArrayList;

/**
 *
 * @author Anderson
 */
public interface InterfaceRepositorioMensagem {

    public ArrayList<Mensagem> recuperarMensagens();
    public Mensagem pesquisarMensagem (int cod);
    public void adicionarMensagem (Mensagem m);
    public void alterarMensagem (Mensagem m);
    public void deletarMensagem (int cod);
    public ArrayList<Mensagem> pesquisarMensagensPorAluno(int codAluno); 

}
