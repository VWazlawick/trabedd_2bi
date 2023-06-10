package br.unipar.trabeddmain.models;

public class Conta {
    private int idConta;
    private int nrConta;
    private String nmTitutal;
    private double sldInicial;
    private double vlrMovimentacoes;

    public Conta() {
    }

    public Conta(int idConta, int nrConta, String nmTitutal, double sldInicial, double vlrMovimentacoes) {
        this.idConta = idConta;
        this.nrConta = nrConta;
        this.nmTitutal = nmTitutal;
        this.sldInicial = sldInicial;
        this.vlrMovimentacoes = vlrMovimentacoes;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public int getNrConta() {
        return nrConta;
    }

    public void setNrConta(int nrConta) {
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

    public double getVlrMovimentacoes() {
        return vlrMovimentacoes;
    }

    public void setVlrMovimentacoes(double vlrMovimentacoes) {
        this.vlrMovimentacoes = vlrMovimentacoes;
    }

    @Override
    public String toString() {
        return "Conta{" + "idConta=" + idConta + ", nrConta=" + nrConta + ", nmTitutal=" + nmTitutal + ", sldInicial=" + sldInicial + ", vlrMovimentacoes=" + vlrMovimentacoes + '}';
    }

    
    
    

      

    
}
