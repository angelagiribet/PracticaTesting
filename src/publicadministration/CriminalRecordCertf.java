package publicadministration;

import data.DigitalSignature;
import data.Goal;
import data.Nif;

public class CriminalRecordCertf extends PDFDocument { // Represents the Criminal Record Certificate
    private Nif nif;
    private String name;
    private Goal goal;
    private DigitalSignature digSign;
    private CrimConvictionsColl crimConvs;

    public CriminalRecordCertf (Nif nif, String name, Goal g,
                                DigitalSignature ds, CrimConvictionsColl crmC) {  //  Initializes attributes
        this.nif = nif;
        this.name = name;
        this.goal = g;
        this.digSign = ds;
        this.crimConvs = crmC;
    }

    // the getters
    public String getNif() { return nif.toString(); }
    public String getName() { return name; }
    public String getGoal() { return goal.toString(); }
    public String getDigSign() { return digSign.toString(); }
    public String getCrimConvs() { return crimConvs.toString(); }
}
