
package list.OperacoesBasicas;


public class Item {
    
    private String item;

    public Item(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return item;
    }
    
    
}
