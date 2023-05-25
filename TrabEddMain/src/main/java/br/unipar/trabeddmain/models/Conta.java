package br.unipar.trabeddmain.models;

public class Conta {
    private int idConta;
    private String nrConta;
    private String nmTitutal;
    private double sldInicial;

    public Conta() {
    }

    public Conta(int idConta, String nrConta, String nmTitutal, double sldInicial) {
        this.idConta = idConta;
        this.nrConta = nrConta;
        this.nmTitutal = nmTitutal;
        this.sldInicial = sldInicial;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNrConta() {
        return nrConta;
    }

    public void setNrConta(String nrConta) {
        this.nrConta = nrConta;
    }

    public String getNmTitutal() {
        return nmTitutal;
    }

    public void setNmTitutal(String nmTitutal) {
        this.nmTitutal = nmTitutal;
    }

    public double getSldInicial() {
        return sldInicial;
    }

    public void setSldInicial(double sldInicial) {
        this.sldInicial = sldInicial;
    }

    @Override
    public String toString() {
        return "Conta{" + "idConta=" + idConta + ", nrConta=" + nrConta + ", nmTitutal=" + nmTitutal + ", sldInicial=" + sldInicial + '}';
    }

    
}
