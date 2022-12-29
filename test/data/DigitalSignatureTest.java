package data;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DigitalSignatureTest {

    @Test
    public void testingConstructorNull () {
        Exception exception = assertThrows( IllegalArgumentException.class, () -> {
            DigitalSignature dg = new DigitalSignature (null);
        });

        String expectedMessage = "No se ha introducido ningún código.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testingEquals () {
        DigitalSignature dg1 = new DigitalSignature (byte[] digSign);
        DigitalSignature dg2 = new DigitalSignature (byte[] digSign);
        assertTrue(dg1.equals(dg2));
    }
}
