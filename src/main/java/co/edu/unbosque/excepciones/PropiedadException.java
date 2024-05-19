package co.edu.unbosque.excepciones;

public class PropiedadException extends Exception{
    public PropiedadException() {
        super();
    }

    public void PropiedadNoencontradaException(String message) {

    }

    public PropiedadException(String message, Throwable cause) {
        super(message, cause);
    }

    public PropiedadException(Throwable cause) {
        super(cause);
    }

    protected PropiedadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
