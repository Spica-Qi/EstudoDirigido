
package diagram;


public class Diagram {
    String nome;
    double valor;
    
    public double calcularDesconto() {
        return valor - (valor * 0.25);
    }
}
