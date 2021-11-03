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
public interface InterfaceRepositorioDisciplina {

    public ArrayList<Disciplina> recuperarDisciplinas();
    public ArrayList<Disciplina> pesquisarDisciplinasPorNome(String nome);
    public Disciplina pesquisarDisciplina (int cod);
    public void adicionarDisciplina (Disciplina d);
    public void removerDisciplina (int cod);
    public void alterarDisciplina (Disciplina d, int codAntigo);
    

}
