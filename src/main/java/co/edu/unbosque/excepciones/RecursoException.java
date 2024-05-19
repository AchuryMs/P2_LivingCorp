package co.edu.unbosque.excepciones;

public class RecursoException extends Exception{
    public RecursoException() {
        super();
    }

    public void PropiedadNoencontradaException(String message) {

    }

    public RecursoException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecursoException(Throwable cause) {
        super(cause);
    }

    protected RecursoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
