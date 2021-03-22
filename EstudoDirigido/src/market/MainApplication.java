
package market;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Carrinhos car = new Carrinhos();
        
        int i;
        do {
            Produtos produto = new Produtos();            
            System.out.println("1 - Adicionar ao carrinho");
            System.out.println("2 - Visualizar carrinho");
            System.out.println("3 - Finalizar compra");
            System.out.println("0 - Sair");
            i = read.nextInt();
            if(i <0 && i >3) {
                System.out.println("Opção incorreta!");
            }
            
            switch(i) {
                case 1: 
                    System.out.println("Informe o código do produto: ");
                    produto.setCodigo(read.nextInt());
                    System.out.println("Informe a descrição do produto: ");
                    produto.setDescProduto(read.next());
                    System.out.println("Informe o preço do produto: ");
                    produto.setPreco(read.nextInt());
                    System.out.println("Informe a quantidade do produto: ");
                    produto.setQuantidade(read.nextInt());
                    car.itens.add(produto);
                    break;
                case 2:
                    if(car.itens.size() == 0) {
                        System.out.println("\nO carrinho está vazio\n");
                    } else {
                        car.exibirCarrinho();
                    }
                    break;
                case 3:
                   if(car.itens.size() == 0) {
                        System.out.println("\nO carrinho está vazio\n");
                    } else {
                        System.out.println("\nValor final: \n" + car.finalizarCompra());
                    }
            }
        } while(i != 0);
        
        System.out.println("Adeus.");
        
    }
}
