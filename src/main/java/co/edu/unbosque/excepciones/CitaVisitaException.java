package co.edu.unbosque.excepciones;

public class CitaVisitaException extends Exception{
    public CitaVisitaException() {
        super();
    }

    public void PropiedadNoencontradaException(String message) {
    }

    public CitaVisitaException(String message, Throwable cause) {
        super(message, cause);
    }

    public CitaVisitaException(Throwable cause) {
        super(cause);
    }

    protected CitaVisitaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
