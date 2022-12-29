package data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmallCodeTest {

    @Test
    public void testingConstructorNull () {
        Exception exception = assertThrows( IllegalArgumentException.class, () -> {
            SmallCode sc = new SmallCode (null);
        });

        String expectedMessage = "No se ha introducido ningún código.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testingConstructorWrongObject () {
        Exception exception = assertThrows( IllegalArgumentException.class, () -> {
            SmallCode sc = new SmallCode ("código incorrecto");
        });

        String expectedMessage = "No se ha introducido el NIF correctamente.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }


    @Test
    public void testingEquals () {
        SmallCode sm1 = new SmallCode ("code");
        SmallCode sm2 = new SmallCode ("code");
        assertTrue(sm1.equals(sm2));
    }
}
