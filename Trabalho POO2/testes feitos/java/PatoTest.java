import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import polymorphism.Pato;

public class PatoTest {

    @Test
    public void testBicarComBico() {
        Pato pato = new Pato();
        pato.setBico(true);
        assertEquals("Um Pato pode bicar", pato.bicar());
    }

    @Test
    public void testBicarSemBico() {
        Pato pato = new Pato();
        pato.setBico(false);
        assertEquals("Um Pato não pode bicar", pato.bicar());
    }
}
