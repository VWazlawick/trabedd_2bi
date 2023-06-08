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
                break;
            }
        }
    }

    public void ordenacaoNumeroConta(){
        for(int i=0;i<listaContas.length-1;i++){
            for(int j=0;j<listaContas.length-1-i;j++){
                if(listaContas[j+1]!=null){
                    if(listaContas[j].getNrConta()>listaContas[j+1].getNrConta()){
                        int aux = listaContas[j].getNrConta();
                        listaContas[j].setNrConta(listaContas[j+1].getNrConta());
                        listaContas[j+1].setNrConta(aux);
                    }
                }
            }
        }
    }
    
    public void ordenacaoSaldoConta(){
        for(int i=0;i<listaContas.length-1;i++){
            for(int j=0;j<listaContas.length-i-1;j++){
                if(listaContas[j+1]!=null){
                    if(listaContas[j].getSldInicial()>listaContas[j+1].getSldInicial()){
                        double aux = listaContas[j].getSldInicial();
                        listaContas[j].setSldInicial(listaContas[j+1].getSldInicial());
                        listaContas[j+1].setSldInicial(aux);
                    }
                }
            }
        }
    }
    
    public int pesquisaLinearNrConta(int pesquisa){
        this.ordenacaoNumeroConta();
        for(int i=0;i<listaContas.length;i++){
            if(listaContas[i]!=null){
                if(pesquisa==listaContas[i].getNrConta()){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public int pesquisaLinearNome(String nome){
        this.ordenacaoNumeroConta();
        for(int i=0;i<listaContas.length;i++){
            if(listaContas[i]!=null){
                if(nome.equals(listaContas[i].getNmTitutal())){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public void deposito(double valor, int pos){
        listaContas[pos].setMovimentacoes(valor);
    }
    
    public void sacar(double valor, int pos){
        listaContas[pos].setMovimentacoes(valor*(-1));
    }
    @Override
    public String toString() {
        return "ListaContas{" + "listaContas=" + listaContas + '}';
    }
    
    
    
    

    
}
