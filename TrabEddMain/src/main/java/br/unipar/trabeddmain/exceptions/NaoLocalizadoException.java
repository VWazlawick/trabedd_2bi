package br.unipar.trabeddmain.exceptions;

public class NaoLocalizadoException extends Exception{

    public NaoLocalizadoException(String ex) {
        super(ex + " não localizado");
    }
    
}
