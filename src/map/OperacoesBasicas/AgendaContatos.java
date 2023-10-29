package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);

    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Marcelo", 2345);
        agendaContatos.adicionarContato("Marcelo oliveira", 5433);
        agendaContatos.adicionarContato("Marcelo java", 888);
        agendaContatos.adicionarContato("Marcelo Dio", 2345);
        agendaContatos.adicionarContato("Marcelo", 4321);
        agendaContatos.adicionarContato("Marcelo santos", 25439);

        
        agendaContatos.exibirContato();
        
        agendaContatos.removerContato("Marcelo Dio");
       agendaContatos.exibirContato();
        
       System.out.println("o numero é: " + agendaContatos.pesquisaPorNome("Marcelo java"));

    }

}
