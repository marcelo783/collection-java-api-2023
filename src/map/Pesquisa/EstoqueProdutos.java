package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoCaro() {
        Produto produtoMaisaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisaro = p;
                }
            }
        }
        return produtoMaisaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "produto A", 10, 5.0);
        estoque.adicionarProduto(2L, "produto B", 5, 10);
        estoque.adicionarProduto(3L, "produto C", 2, 15.0);
         estoque.adicionarProduto(8L, "produto D", 2, 20.0);
        
        estoque.exibirProdutos();
        
        System.out.println("Valor total do estoque: R$ " + estoque.calculaValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoque.obterProdutoCaro());

    }

}
