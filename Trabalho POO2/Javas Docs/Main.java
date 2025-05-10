
package polymorphism;

public class Main {
    public static void main(String[] args) {
        Pinguim pinguim = new Pinguim();
        System.out.println(pinguim.bicar());
        pinguim.setBico(false);
        System.out.println(pinguim.nadar());
        System.out.println(pinguim.bicar());

        Pato pato = new Pato();
        System.out.println(pato.voar());
        System.out.println(pato.nadar());
        System.out.println(pato.bicar());
        pato.setBico(false);
        System.out.println(pato.bicar());
    }
}


/**
 * Classe principal que demonstra o uso das classes Pato e Pinguim
 * com seus respectivos comportamentos polimórficos.
 */
public class Main {
    public static void main(String[] args) {
        polymorphism.Pinguim pinguim = new polymorphism.Pinguim();
        System.out.println(pinguim.bicar());
        pinguim.setBico(false);
        System.out.println(pinguim.nadar());
        System.out.println(pinguim.bicar());

        polymorphism.Pato pato = new polymorphism.Pato();
        System.out.println(pato.voar());
        System.out.println(pato.nadar());
        System.out.println(pato.bicar());
        pato.setBico(false);
        System.out.println(pato.bicar());
    }
}
