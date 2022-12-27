package publicadministration;
import data.Nif;
import java.util.Arrays;
import java.util.Date;

public class CrimConvictionsColl {

    private final static int CRIMS = 10;

    private Nif nif;
    private CrimConviction[] crimConviction;

    // Represents the total criminal convictions registered for a citizen
    // Its components, that is, the set of criminal convictions

    public CrimConvictionsColl (Nif nif){
        this.nif = nif;
        this.crimConviction = new CrimConviction[CRIMS];
    }


    // the getters

    public Nif getNif() {
        return nif;
    }

    public CrimConviction[] getCrimConviction() {
        return crimConviction;
    }

    public void addCriminalConviction (CrimConviction crmC){
        if (crimConviction[9] == null) {
            //redimensionar
        } else {
            crimConviction.add(crmC);
        }
    }

    public CrimConviction getCriminalConviction (Date date){ . . . } // Gets a specific criminal conviction by date

    public String toString () { . . . } // Converts to String
}
