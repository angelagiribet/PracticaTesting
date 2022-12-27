package publicadministration;

import data.DocPath;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class PDFDocument {

    private Date createDate;

    private DocPath path;

    private File file;

    public PDFDocument () { // Initializes attributes and emulates the document download at a default path
        this.createDate = new Date();
    }

    // the getters
    public String getDate () { return createDate.toString(); }
    public String getPath () { return path.toString(); }
    public String getFile () { return file.toString();}

    public String toString () {
        return "PDFDocument{" + "fecha creación='" + createDate + '\'' + "ruta documento='" + path + '\'' + '}';
    }// Converts to String members Date & DocPath

    // To implement only optionally

    public void moveDoc(DocPath destPath) throws IOException // Moves the document to the destination path indicated
    {

    }

    public void openDoc (DocPath path) throws IOException {
        try {
            File place = new File(String.valueOf(path));
            Desktop.getDesktop().open(place);
        } catch (IOException ex) { ex.printStackTrace();
        }
    }// Opens the document at the path indicated
}
