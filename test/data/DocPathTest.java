package data;

import org.junit.jupiter.api.Test;

import javax.print.Doc;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DocPathTest {

    @Test
    public void testingConstructorNull () {
        Exception exception = assertThrows( IllegalArgumentException.class, () -> {
            DocPath dp = new DocPath (null);
        });

        String expectedMessage = "No se ha introducido ningún código.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testingConstructorWrongObject () {
        Exception exception = assertThrows( IllegalArgumentException.class, () -> {
            DocPath dp = new DocPath ("path incorrecto");
        });

        String expectedMessage = "No se ha introducido el NIF correctamente.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void testingEquals () {
        DocPath dp1 = new DocPath ("path");
        DocPath dp2 = new DocPath ("path");
        assertTrue(dp1.equals(dp2));
    }
}
