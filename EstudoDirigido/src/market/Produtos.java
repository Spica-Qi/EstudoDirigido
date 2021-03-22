
package market;

public class Produtos {
    public int codigo;
    public String descProduto;
    public float preco;
    public int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void ListarDados(){
        System.out.println("Código: " + codigo);
        System.out.println("Descrição do Produto: " + descProduto);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    @Override
    public String toString() {
        return "\ncodigo: " + codigo + "\nDescrição do produto: " + descProduto + "\nPreço: " + preco + "\nQuantidade: " + quantidade;
    }
}
