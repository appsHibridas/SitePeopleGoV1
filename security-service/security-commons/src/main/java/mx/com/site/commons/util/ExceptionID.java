package mx.com.site.commons.util;

public enum ExceptionID {

    NULL_POINTER_EXCEPTION_MESSAGE(1,"no trae el valor email favor de verificar");

    private int idException;
    private String message;

    ExceptionID(int idException, String message) {
        this.idException = idException;
        this.message = message;
    }

    public int getIdException() {
        return idException;
    }

    public void setIdException(int idException) {
        this.idException = idException;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
