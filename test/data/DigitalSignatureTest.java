package data;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DigitalSignatureTest {

    @Test
    public void TestingEquals () {
        DigitalSignature dg1 = new DigitalSignature (byte[] digSign);
        DigitalSignature dg2 = new DigitalSignature (byte[] digSign);
        assertTrue(dg1.equals(dg2));
    }
}
