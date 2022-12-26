package data;

import org.junit.jupiter.api.Test;
import data.*;

import static org.junit.jupiter.api.Assertions.*;
public class NifTest {

    @Test
    public void TestingConstructorNull () {}

    @Test
    public void TestingConstructorWrongObject () {}

    @Test
    public void TestingToString () {
        Nif nif = new Nif ("12345678A");
        String nifString = "Nif{nif ciudadano=12345678A";
        assertEquals(nif.toString(), nifString);
    }

    @Test
    public void TestingEquals () {
        Nif nif1 = new Nif ("12345678A");
        Nif nif2 = new Nif ("12345678A");
        assertTrue(nif1.equals(nif2));
    }
}
