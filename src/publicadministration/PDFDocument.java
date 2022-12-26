package publicadministration;

import data.DocPath;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class PDFDocument {

    private Date creatDate;

    private DocPath path;

    private File file;

    public PDFDocument () { // Initializes attributes and emulates the document download at a default path
        this.creatDate = new Date();
    }

    // the getters
    public String getDate () { return creatDate.toString(); }
    public String getPath () { return path.toString(); }
    public String getFile () { return file.toString();}

    public String toString () {
        return "PDFDocument{" + "fecha creación='" + creatDate + '\'' + "ruta documento='" + path + '\'' + '}';
    }// Converts to String members Date & DocPath

    // To implement only optionally

    public void moveDoc (DocPath destPath) throws IOException; // Moves the document to the destination path indicated

    public void openDoc (DocPath path) throws IOException {
        try {
            File path = new File ("temp\laboralLife.pdf"); Desktop.getDesktop().open(path);
        } catch (IOException ex) { ex.printStackTrace();
        }
    }// Opens the document at the path indicated
}
