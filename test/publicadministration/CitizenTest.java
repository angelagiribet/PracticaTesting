package publicadministration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CitizenTest {

    @Test
    public void TestingToString () {
        Citizen c = new Citizen ("nombre", "dirección", "666000000");
        String cString = "Ciudadano{" + "nif ciudadano='" + nif + '\''
                + "nombre ciudadano='" + "nombre" + '\''
                + "dirección ciudadano='" + "dirección" + '\''
                + "teléfono ciudadano='" + "666000000" + '\'' + '}';
        assertEquals(c.toString(), cString);
    }
}
