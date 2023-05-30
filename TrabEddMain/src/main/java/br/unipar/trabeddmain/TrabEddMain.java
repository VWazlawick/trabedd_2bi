package br.unipar.trabeddmain;

import br.unipar.trabeddmain.models.Conta;
import br.unipar.trabeddmain.models.ListaContas;

public class TrabEddMain {

    public static void main(String[] args) {
        Conta c1 = new Conta(1,"000", "Victor", 100);
        Conta c2 = new Conta(2,"1111", "vqweq", 122);
        
        ListaContas lc = new ListaContas();
                
        try {
            lc.setListaContas(c1);
            lc.setListaContas(c2);
            
            for(int i=0;i<lc.getListaContas().length;i++){
                if(lc.getListaContas()[i]!=null){
                    System.out.println(lc.getListaContas()[i].getNmTitutal());
                }
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
