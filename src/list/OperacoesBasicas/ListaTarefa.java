/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARCELO
 */
public class ListaTarefa {
    
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        
        System.out.println("o número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        System.out.println("o número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("o número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.obterDescricoesTarefas();
      
    }
}
