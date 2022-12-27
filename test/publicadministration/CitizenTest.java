package publicadministration;

import data.Nif;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CitizenTest {

    @Test
    public void TestingToString () {
        Nif nif = new Nif("47320966K");
        Citizen c = new Citizen (nif, "dirección", "666000000", "665879012");
        String cString = "Ciudadano{" + "nif ciudadano='" + nif + '\''
                + "nombre ciudadano='" + "nombre" + '\''
                + "dirección ciudadano='" + "dirección" + '\''
                + "teléfono ciudadano='" + "666000000" + '\'' + '}';
        assertEquals(c.toString(), cString);
    }
}
