
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import polymorphism.Pinguim;

public class PinguimTest {

    @Test
    public void testBicarComBico() {
        Pinguim pinguim = new Pinguim();
        pinguim.setBico(true);
        assertEquals("Um Pinguim pode bicar", pinguim.bicar());
    }

    @Test
    public void testBicarSemBico() {
        Pinguim pinguim = new Pinguim();
        pinguim.setBico(false);
        assertEquals("Um Pinguim não pode bicar", pinguim.bicar());
    }
}
