
/**
 * Classe base que representa características comuns a aves.
 * Contém atributos como asas, bico e penas, além de métodos para manipulação e comportamento.
 */
package polymorphism;

public class Aves {

    private Boolean asas = true;
    protected Boolean bico = true;
    private Boolean penas = true;

    /**
     * Altera o estado do atributo bico.
     * 
     * @param bico true se a ave possui bico funcional, false caso contrário
     */
    public void setBico(Boolean bico) {
        this.bico = bico;
    }

    /**
     * Retorna a mensagem indicando se a ave pode ou não bicar.
     * 
     * @return String com a descrição da capacidade de bicar
     */
    public String bicar() {
        return bico ? "Pode bicar" : "Não pode bicar";
    }
}
