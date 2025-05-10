
/**
 * Interface para aves que não voam, mas podem nadar.
 * Fornece um método padrão de natação.
 */
package polymorphism;

public interface AveNaoVoa {

    /**
     * Retorna uma string indicando que a ave pode nadar.
     * 
     * @return String de confirmação
     */
    public default String nadar() {
        return "Pode nadar";
    }
}
