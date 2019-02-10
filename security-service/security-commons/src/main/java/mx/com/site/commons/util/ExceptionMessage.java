package mx.com.site.commons.util;

public enum ExceptionMessage {

    EXCEPTION_MESSAGE("Error al ejecutar operacion contacte a su administrador !!");

    private String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
