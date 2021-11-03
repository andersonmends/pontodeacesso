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
public interface InterfaceRepositorioNoticia {

    public void adicionarNoticias (Noticia n);
    public ArrayList<Noticia> recuperarNoticias ();
    public void removerNoticia (int cod);
    public Noticia pesquisarNoticia (int cod);
    public void alterarNoticia (Noticia n);

}
