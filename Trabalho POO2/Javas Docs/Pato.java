
/**
 * Representa um pato, uma subclasse de Aves que pode voar e nadar.
 * Implementa comportamento especializado para bicar.
 */
package polymorphism;

public class Pato extends Aves implements AveNaoVoa, AveVoa {

    @Override
    public void setBico(Boolean bico) {
        this.bico = bico;
    }

    /**
     * Retorna uma descrição se o pato pode bicar ou não.
     * 
     * @return String indicando a capacidade de bicar
     */
    @Override
    public String bicar() {
        return bico ? "Um Pato pode bicar" : "Um Pato não pode bicar";
    }
}
