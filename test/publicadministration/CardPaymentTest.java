package publicadministration;

import data.Nif;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardPaymentTest {

    @Test
    public void TestingToString () {
        Nif nif = new Nif ("12345678A");
        BigDecimal imp = new BigDecimal(15000);
        CardPayment cp = new CardPayment (nif, imp);
        String cpString = "CardPayment{" + "código operación=" + reference + '\''
                + "nif ciudadano'=" + "12345678A" + '\''
                + "fecha'=" + date + '\''
                + "importe del pago='" + "15000" + '\'' + '}';
        assertEquals(cp.toString(), cpString);
    }
}
