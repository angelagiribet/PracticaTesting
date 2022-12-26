package publicadministration;

import java.math.BigDecimal;
import java.util.Date;
import data.Nif;

public class CardPayment {

    // The information associated to the payment realized via internet

    private final String reference; // The code of the operation
    private final Nif nif; // The nif of the user
    private final Date date; // The date of the operation
    private final BigDecimal imp; // The import of the payment

    public CardPayment (Nif nif, BigDecimal imp) { // Initializes attributes
        this.reference = ;
        this.nif = nif;
        this.date = ;
        this.imp = imp;
    }

    // the getters
    public String getReference() { return reference; }
    public String getNif) { return nif.toString(); }
    public String getDate() { return date.toString(); }
    public String getImport() { return imp.toString(); }

    @Override
    public String toString () {
        return "CardPayment{" + "código operación=" + reference + '\''
                + "nif ciudadano=" + nif + '\''
                + "fecha=" + date + '\''
                + "importe del pago=" + imp + '\'' + '}';
    } // converts to String
}
