package data;

public class SmallCode {

    // Codi de 3 dígits utilitzat per al Safe Verification Code i també pel Sistema Cl@ve
    // Es guarda com un String

    private final String svc;

    public SmallCode (String code) {
        this.svc = code;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallCode svcc = (SmallCode) o;
        return svc.equals(svcc.svc); }

    @Override
    public int hashCode () { return svc.hashCode(); }
}
