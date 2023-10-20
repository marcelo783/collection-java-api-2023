
package list.OperacoesBasicas;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    
    private List<Item> listItem;

    public CarrinhoDeCompras() {
        this.listItem  = new ArrayList<>();
    }
    
    public void adicionarItem(String item){
        listItem.add(new Item(item));
    }
    
    public void removerItem(String item){
     List<Item> itemsParaRemover = new ArrayList<>();
     
     for(Item i : listItem){
         if(i.getItem().equalsIgnoreCase(item)){
             itemsParaRemover.add(i);
         }
         
     }
     listItem.removeAll(itemsParaRemover);
    }
    
    public int obterNumeroTotalItem(){
        return listItem.size();
    }
    
    public void obterDescricaoItem(){
        System.out.println(listItem);
    }
    
    //testar os metodos
    
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        
        System.out.println("o número total de itens no carrinho é: " + carrinhoDeCompras.obterNumeroTotalItem());
        
         carrinhoDeCompras.adicionarItem("pão");
          carrinhoDeCompras.adicionarItem("pão");
           carrinhoDeCompras.adicionarItem("arroz");
          System.out.println("o número total de itens no carrinho é: " + carrinhoDeCompras.obterNumeroTotalItem());
          
          carrinhoDeCompras.removerItem("arroz");
           System.out.println("o número total de itens no carrinho é: " + carrinhoDeCompras.obterNumeroTotalItem());
           
           carrinhoDeCompras.obterDescricaoItem();
       
    }
}

