
package diagram;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Diagram diagram = new Diagram();
        
        System.out.println("Digite o nome: ");
        diagram.nome = read.next();
        System.out.println("Digite o valor: ");
        diagram.valor = read.nextDouble();
        
        System.out.println("Desconto: " + diagram.calcularDesconto());
      
    }
}
