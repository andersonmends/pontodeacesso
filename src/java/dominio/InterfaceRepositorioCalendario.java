/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Waléria Souza
 */
public interface InterfaceRepositorioCalendario {
    public void adicionarEvento (Calendario c);
    public void removerCalendario (int cod);
    public void alterarCalendario (Calendario c);
    
}
