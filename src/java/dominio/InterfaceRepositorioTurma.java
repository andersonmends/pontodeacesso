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
public interface InterfaceRepositorioTurma {

    public ArrayList<Turma> recuperarTurmas();
    public Turma pesquisarTurmaPorCod (int cod);
    public ArrayList<Turma> pesquisarTurmaPorNome(String nome);
    public ArrayList<Turma> pesquisarTurmaPorAno(String ano);
    public void adicionarTurma (Turma t);
    public void alterarTurma (Turma t,int codAntigo);
    public void deletarTurma (int cod);

    public int pesquisarTurma(Turma t);
    
    public ArrayList<Horario> pegarHorarios(int codT);

}
