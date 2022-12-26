package exceptions;

public class PrintingException extends Exception{
    public PrintingException() {
        super("El documento no se ha podido imprimir correctamente.");
    }
}
