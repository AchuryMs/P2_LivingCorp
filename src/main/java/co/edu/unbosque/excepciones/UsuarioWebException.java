package co.edu.unbosque.excepciones;

public class UsuarioWebException extends Exception{
    public UsuarioWebException() {
        super();
    }

    public void PropiedadNoencontradaException(String message) {

    }

    public UsuarioWebException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsuarioWebException(Throwable cause) {
        super(cause);
    }

    protected UsuarioWebException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
