package br.unipar.trabeddmain;

import br.unipar.trabeddmain.exceptions.NaoLocalizadoException;
import br.unipar.trabeddmain.exceptions.OpcaoInvalidaException;
import br.unipar.trabeddmain.models.Conta;
import br.unipar.trabeddmain.models.ListaContas;
import javax.swing.JOptionPane;

public class TrabEddMain {

    public static void main(String[] args) {
        boolean ont = true;
        ListaContas lc = new ListaContas();
        while(ont==true){
            try {
                

                String input = JOptionPane.showInputDialog("O que deseja fazer:\n"
                        + "Cadastrar Nova Conta (1)\n"
                        + "Listar Contas (2)\n"
                        + "Depósito (3)\n"
                        + "Sacar (4)\n"
                        + "Calcular Saldo Total(5)\n"
                        + "Verificar Saldo Negativo (6)\n"
                        + "Sair (7)");
                switch (input) {
                    case "1":
                        Conta c1 = new Conta();
                        for(int i=0;i<lc.getListaContas().length;i++){
                            if(lc.getListaContas()[i]==null){
                                c1.setIdConta(i+1);
                            }
                        }

                        String inputDados = JOptionPane.showInputDialog("Informe o Nome");
                        c1.setNmTitutal(inputDados);
                        inputDados = JOptionPane.showInputDialog("Informe o número da conta ");
                        c1.setNrConta(Integer.parseInt(inputDados));
                        inputDados = JOptionPane.showInputDialog("Informe o Saldo Inicial:");
                        c1.setSldInicial(Double.parseDouble(inputDados));

                        lc.setListaContas(c1);
                        System.out.println(lc.getListaContas()[0].getNmTitutal());
                        break;
                    case "2":
                        System.out.println(lc.getListaContas()[0].getNmTitutal());
                        String opcao = JOptionPane.showInputDialog("Deseja ordenar pelo Número da Conta (1) ou"
                                + " Saldo da Conta (2)?");
                        switch (opcao) {
                            case "1":
                                lc.ordenacaoNumeroConta();
                                String msg="";
                                for(int i=0;i<lc.getListaContas().length;i++){
                                    if(lc.getListaContas()[i]!=null){
                                        msg += lc.getListaContas()[i].toString() + "\n";
                                    }
                                }
                                JOptionPane.showMessageDialog(null, msg);
                                break;
                            case "2":
                                lc.ordenacaoSaldoConta();
                                msg="";
                                for(int i=0;i<lc.getListaContas().length;i++){
                                    if(lc.getListaContas()[i]!=null){
                                        msg += lc.getListaContas()[i].toString() + "\n";
                                    }
                                }
                                JOptionPane.showMessageDialog(null, msg);
                                break;    
                            default:
                                throw new OpcaoInvalidaException();
                        }
                        break;
                    case "3":
                        opcao = JOptionPane.showInputDialog("Deseja pesquisar pelo Nome (1) ou "
                                + " pelo Número da Conta (2)?");
                        switch (opcao) {
                            case "1":
                                inputDados = JOptionPane.showInputDialog("Qual o nome do Titular?");
                                int pos = lc.pesquisaLinearNome(inputDados);
                                if(pos!=-1){
                                    inputDados = JOptionPane.showInputDialog("Qual o valor do depósito?");
                                    lc.deposito(Double.parseDouble(inputDados), pos);
                                }else{
                                    throw new NaoLocalizadoException("Conta");
                                }
                                
                                break;
                            case "2":
                                inputDados = JOptionPane.showInputDialog("Qual o número da conta?");
                                pos = lc.pesquisaLinearNrConta(Integer.parseInt(inputDados));
                                if(pos!=-1){
                                    inputDados = JOptionPane.showInputDialog("Qual o valor do depósito?");
                                    lc.deposito(Double.parseDouble(inputDados), pos);
                                }else{
                                    throw new NaoLocalizadoException("Conta");
                                }
                                break;                                
                            default:
                                throw new OpcaoInvalidaException();
                        }
                        break; 
                    case "4":
                        opcao = JOptionPane.showInputDialog("Deseja pesquisar pelo Nome (1) ou "
                                + " pelo Número da Conta (2)?");
                        switch (opcao) {
                            case "1":
                                inputDados = JOptionPane.showInputDialog("Qual o nome do Titular?");
                                int pos = lc.pesquisaLinearNome(inputDados);
                                if(pos!=-1){
                                    inputDados = JOptionPane.showInputDialog("Qual o valor deseja sacar?");
                                    lc.sacar(Double.parseDouble(inputDados), pos);
                                }else{
                                    throw new NaoLocalizadoException("Conta");
                                }
                                
                                break;
                            case "2":
                                inputDados = JOptionPane.showInputDialog("Qual o número da conta?");
                                pos = lc.pesquisaLinearNrConta(Integer.parseInt(inputDados));
                                if(pos!=-1){
                                    inputDados = JOptionPane.showInputDialog("Qual o valor deseja sacar?");
                                    lc.sacar(Double.parseDouble(inputDados), pos);
                                }else{
                                    throw new NaoLocalizadoException("Conta");
                                }
                                break;                                
                            default:
                                throw new OpcaoInvalidaException();
                        }
                        break; 
                    case "5":
                        JOptionPane.showMessageDialog(null, "O saldo de todas as contas é: R$" + lc.calcularSaldo(0));
                        break;
                    case "6":
                        JOptionPane.showMessageDialog(null, lc.verificarNegativo("", 0));
                        break;
                    case "7":
                        ont=false;                            
                        break;    
                    default:
                        throw new OpcaoInvalidaException();
                }
                
        
//            for(int i=0;i<lc.getListaContas().length;i++){
//                    if(lc.getListaContas()[i]!=null){
//                        JOptionPane.showMessageDialog(null, lc.getListaContas()[i].toString());
//                    }
//                }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
        
        
        
        
        
        
        
    }
}
