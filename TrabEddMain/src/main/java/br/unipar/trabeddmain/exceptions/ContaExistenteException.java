package br.unipar.trabeddmain.exceptions;

public class ContaExistenteException extends Exception{
    public ContaExistenteException(){
        super("Número de conta já cadastrada!!");
    }
}
