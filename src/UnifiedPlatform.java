import data.*;
import publicadministration.*;
import services.*;
import exceptions.*;

import java.net.ConnectException;
import java.util.Date;

public class UnifiedPlatform {

    //Cas d'ús a desenvolupar: SOL·LICITAR CERTIFICAT D'ANTECEDENTS PENALS

    //Variables

    private JusticeMinistry justiceMinistry;
    private CAS cas;
    private CertificationAuthority certificationAuthority;
    private GPD gpd;

    //Constructor

    public UnifiedPlatform(){
        this.justiceMinistry = null;
        this.cas = null;
        this.certificationAuthority = null;
        this.gpd = null;
    }

    //Setters

    public void setJusticeMinistry(JusticeMinistry justiceMinistry) {
        this.justiceMinistry = justiceMinistry;
    }

    public void setCas (CAS cas) {
        this.cas = cas;
    }

    public void setCertificationAuthority (CertificationAuthority certificationAuthority) {
        this.certificationAuthority = certificationAuthority;
    }

    public void setGpd (GPD gpd) {
        this.gpd = gpd;
    }

    //Mètodes a implementar

    public void selectJusMin () { . . . };

    public void selectProcedures () { . . . };

    public void selectCriminalReportCertf () { . . . };

    public void selectAuthMethod (byte opc) { . . . };

    public void enterNIFandPINobt (Nif nif, Date valDate) { . . . } throws
    NifNotRegisteredException, IncorrectValDateException,
    AnyMobileRegisteredException, ConnectException;

    public void enterPIN (SmallCode pin) { . . . } throws NotValidPINException,
    ConnectException;

    private void enterForm (Citizen citz, Goal goal) { . . . }
    throws IncompleteFormException, IncorrectVerificationException, ConnectException;
    // DGP ha de verificar les dades

    private void realizePayment () { . . . };

    private void enterCardData (CreditCard cardD)
    throws IncompleteFormException, NotValidPaymentDataException,
            InsufficientBalanceException, ConnectException {
        if (cardD == null) {
            throw new IncompleteFormException();
        }
        // Certification Authority ho ha de verificar
    }

    private void obtainCertificate () { . . . } throws BadPathException, DigitalSignatureException,
    ConnectException;

    private void printDocument () { . . . } throws BadPathException, PrintingException;

    // The setter methods for injecting the dependences

    // Other input events (not required)

    // Other internal operations (not required)

    private void registerPayment () { . . . };

    private void openDocument (DocPath path) { . . . } throws BadPathException;

    private void printDocument (DocPath path) { . . . } throws BadPathException, PrintingException;

}
