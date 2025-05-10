
/**
 * Representa um pinguim, uma subclasse de Aves que não voa, mas pode nadar.
 * Possui implementação própria do método bicar.
 */
package polymorphism;

public class Pinguim extends Aves implements AveNaoVoa {

    @Override
    public void setBico(Boolean bico) {
        this.bico = bico;
    }

    /**
     * Retorna uma descrição se o pinguim pode bicar ou não.
     * 
     * @return String indicando a capacidade de bicar
     */
    @Override
    public String bicar() {
        return bico ? "Um Pinguim pode bicar" : "Um Pinguim não pode bicar";
    }
}
