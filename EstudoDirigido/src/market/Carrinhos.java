
package market;

import java.util.ArrayList;

public class Carrinhos {
    ArrayList<Produtos> itens = new ArrayList<>();

    public ArrayList<Produtos> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Produtos> itens) {
        this.itens = itens;
    }
    
    Produtos produto = new Produtos();
    
    public void exibirCarrinho() {
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i));
        }
    }
    
    public float finalizarCompra() {
        float valorTotal = 0;
        for (int i = 0; i < itens.size(); i++) {
            valorTotal += itens.get(i).preco * itens.get(i).quantidade;
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "" + itens;
    }
  
}
