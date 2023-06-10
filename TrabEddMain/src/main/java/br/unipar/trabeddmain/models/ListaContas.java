package br.unipar.trabeddmain.models;

import br.unipar.trabeddmain.exceptions.ContaExistenteException;
import java.util.List;

public class ListaContas {
    
    private Conta[] listaContas = new Conta[10];

    public ListaContas() {
    }

    public Conta[] getListaContas() {
        return listaContas;
    }

    public void setListaContas(Conta conta) throws ContaExistenteException{
        for(int i=0; i<listaContas.length;i++){
            if(listaContas[i]==null){  
                listaContas[i]=conta;
                break;
            }else{
                if(conta.getNrConta()==listaContas[i].getNrConta()){
                    throw new ContaExistenteException();
                }
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
    
//    public void deposito(double valor, int pos){
//        listaContas[pos].setMovimentacoes(valor);
//    }
//    
//    public void sacar(double valor, int pos){
//        listaContas[pos].setMovimentacoes(valor*(-1));
//    }
    public void deposito(double valor, int pos){
        listaContas[pos].setVlrMovimentacoes(listaContas[pos].getSldInicial() + valor);
    }
    
    public void sacar(double valor, int pos){
        listaContas[pos].setVlrMovimentacoes(listaContas[pos].getVlrMovimentacoes()-valor);
    }
    
    public double calcularSaldo(int i ){
        ordenacaoNumeroConta();
        if(listaContas.length==0){
            return 0;
        }else{
            if(listaContas[i]!=null){
                double saldoAtual = listaContas[i].getSldInicial() + listaContas[i].getVlrMovimentacoes();
                double saldoRestante = calcularSaldo(i+1);
                return saldoAtual + saldoRestante;
            }
            else{
                return 0;
            }
        }        
    } 
    
    public String verificarNegativo(String msg, int i){
        ordenacaoNumeroConta();
        if(listaContas.length<=i){
            return msg;
        }else{
            if(listaContas[i]!=null){
                double saldoAtual = listaContas[i].getSldInicial() + listaContas[i].getVlrMovimentacoes();
                if(saldoAtual<0){
                    msg += listaContas[i].getNmTitutal() + " " + listaContas[i].getNrConta() + " " + saldoAtual + "\n";
                }                
            }
            return verificarNegativo(msg, i+1);            
        }
    }
    @Override
    public String toString() {
        return "ListaContas{" + "listaContas=" + listaContas + '}';
    }
    
    
    
    

    
}
