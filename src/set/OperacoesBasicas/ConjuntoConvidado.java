package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int ncodigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == ncodigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        ConjuntoConvidado ConjuntoConvidado = new ConjuntoConvidado();

        System.out.println("Existem " + ConjuntoConvidado.contarConvidados() + " convidados dentro de set de convidados");

        ConjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        ConjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
        ConjuntoConvidado.adicionarConvidado("Convidado 3", 1235);
        ConjuntoConvidado.adicionarConvidado("Convidado 4", 1236);

        ConjuntoConvidado.exibirConvidados();

        System.out.println("Existem " + ConjuntoConvidado.contarConvidados() + " convidados dentro de set de convidados");
        
        ConjuntoConvidado.removerConvidadoPorCodigoConvite(1234);
         System.out.println("Existem " + ConjuntoConvidado.contarConvidados() + " convidados dentro de set de convidados");
         
         ConjuntoConvidado.exibirConvidados();
    }
}
