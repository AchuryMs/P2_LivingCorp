package co.edu.unbosque.excepciones;

public class ReservaRecursoException extends Exception{
    public ReservaRecursoException() {
        super();
    }

    public void ReservaRecursoNoencontradaException(String message) {

    }

    public ReservaRecursoException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReservaRecursoException(Throwable cause) {
        super(cause);
    }

    protected ReservaRecursoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
