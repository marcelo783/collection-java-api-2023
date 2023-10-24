package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos(Set<Contato> contatoSet) {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNomes = new HashSet<>();

        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNomes.add(c);
            }
        }
        return contatosPorNomes;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    
    public static void main(String[] args) {
          Set<Contato> contatos = new HashSet<>();
         AgendaContatos agendaContatos = new AgendaContatos(contatos);
         
         agendaContatos.exibirContatos();
         
         agendaContatos.adicionarContato("Marcelo", 123456);
         agendaContatos.adicionarContato("Marcelo", 7654);
         agendaContatos.adicionarContato("Marcelo oliveira", 11111);
         agendaContatos.adicionarContato("Marcelo Dio", 765454);
         agendaContatos.adicionarContato("Maria silva", 11111);
         
         agendaContatos.exibirContatos();
         
        System.out.println(agendaContatos.pesquisarPorNome("Marcelo"));
         
        System.out.println("contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria silva", 5555));
         
    }

}
