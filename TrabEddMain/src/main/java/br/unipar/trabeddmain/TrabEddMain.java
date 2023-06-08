package br.unipar.trabeddmain;

import br.unipar.trabeddmain.models.Conta;
import br.unipar.trabeddmain.models.ListaContas;
import javax.swing.JOptionPane;

public class TrabEddMain {

    public static void main(String[] args) {
        Conta c1 = new Conta(1,22222, "Victor", 100);
        Conta c2 = new Conta(2,1111, "vqweq", 122);
        Conta c3 = new Conta(3, 2313, "vicqweq", 200);
        
        ListaContas lc = new ListaContas();
                
        try {
            lc.setListaContas(c1);
            lc.setListaContas(c2);
            lc.setListaContas(c3);
            lc.ordenacaoSaldoConta();
            for(int i=0;i<lc.getListaContas().length;i++){
                System.out.println(lc.getListaContas()[i].getSldInicial());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        
    }
}
