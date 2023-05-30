package br.unipar.trabeddmain.models;

public class ListaContas {
    
    private Conta[] listaContas = new Conta[10];

    public ListaContas() {
    }

    public Conta[] getListaContas() {
        return listaContas;
    }

    public void setListaContas(Conta conta) {
        for(int i=0; i<listaContas.length;i++){
            if(listaContas[i]==null){
                listaContas[i]=conta;
                i=listaContas.length;
            }
        }
    }

    @Override
    public String toString() {
        return "ListaContas{" + "listaContas=" + listaContas + '}';
    }
    
    
    
    

    
}
