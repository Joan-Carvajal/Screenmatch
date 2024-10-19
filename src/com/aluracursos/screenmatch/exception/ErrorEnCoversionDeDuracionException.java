package com.aluracursos.screenmatch.exception;

public class ErrorEnCoversionDeDuracionException extends RuntimeException {

    private  String mensaje;
    public ErrorEnCoversionDeDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
