/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public interface InterfaceRepositorioHorario {
    
    public ArrayList<Horario> recuperarHorarios();
    public ArrayList<Horario> recuperarHorariosTurma(int cod);
    public Horario pesquisarHorario (int cod);
    public void adicionarHorario (Horario h);
    public void alterarHorario (Horario h);
    public void deletarHorario (int cod);
    
}
