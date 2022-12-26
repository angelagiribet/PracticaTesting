package exceptions;

public class NotValidPaymentDataException extends Exception {
    public NotValidPaymentDataException() {
        super("El pago no se ha realizado con éxito.");
    }
}
