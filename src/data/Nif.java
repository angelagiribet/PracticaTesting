package data;

final public class Nif {

    // NIF del ciutadà

    // The tax identification number in the Spanish state.
    private final String nif;


    public Nif (String code) throws IllegalAccessException {
        if(code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("No se ha introducido ningún código");
        } // Excepció en què al constructor li arriba null (objecte sense instanciar)
        isOkay(code);
            throw new IllegalArgumentException("No se ha introducido el NIF correctamente.");
        }
        this.nif = code;
    }

    public String getNif () { return nif; }

    public void isOkay (String code) {
        // definir un mètode que comprovi si el Nif està correctament format?
        return true;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nif niff = (Nif) o;
        return nif.equals(niff.nif); }

    @Override
    public int hashCode () { return nif.hashCode(); }

    @Override
    public String toString () {
        return "Nif{" + "nif ciudadano='" + nif + '\'' + '}';
    }

}
