package data;

public class DigitalSignature {

    // S'utilitza per representar la firma electrònica
    // Es representa com un byte[]

    private final byte[] digSign;

    public DigitalSignature (byte[] digSign) { this.digSign = digSign; }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalSignature digSignn = (DigitalSignature) o;
        return digSign.equals(digSignn.digSign); }

    @Override
    public int hashCode () { return digSign.hashCode(); }
}
