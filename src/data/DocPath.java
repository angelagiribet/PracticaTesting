package data;

final public class DocPath {

    // Ruta en el sistema d'arxius
    // Es representa com un String

    private final String docPath;

    public DocPath (String docPath) { this.docPath = docPath; }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPath docPathh = (DocPath) o;
        return docPath.equals(docPathh.docPath); }

    @Override
    public int hashCode () { return docPath.hashCode(); }
}
