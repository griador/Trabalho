
/**
 * Interface para aves que podem voar.
 * Fornece um método padrão de voo.
 */
package polymorphism;

public interface AveVoa {

    /**
     * Retorna uma string indicando que a ave pode voar.
     * 
     * @return String de confirmação
     */
    public default String voar() {
        return "Pode voar";
    }
}
