package publicadministration;

import data.Nif

public class Citizen {

    // Represents all the information required for a citizen
    private Nif nif;
    private String name;
    private String address;
    private String mobileNumb;

    // Other additional information (not required)

    public Citizen (String name, String add, String mobile){
        this.name = name;
        this.address = add;
        this.mobileNumb = mobile;
    } //  Initializes attributes

    // the getters
    public String getNif() { return nif.toString(); }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getMobileNumb() { return mobileNumb; }

    public String toString () {
        return "Ciudadano{" + "nif ciudadano='" + nif + '\''
                + "nombre ciudadano='" + name + '\''
                + "dirección ciudadano='" + address + '\''
                + "teléfono ciudadano='" + mobileNumb + '\'' + '}';
    } // converts to String
}
