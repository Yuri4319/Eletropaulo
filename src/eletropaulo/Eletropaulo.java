package eletropaulo;

import javax.swing.JOptionPane;

public class Eletropaulo {

    public static void main(String[] args) {
       
        Informacoes energia = new Informacoes();
        energia.setPrimLeitura(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura anterior:")));
        energia.setSegLeitura(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura atual:")));        
        energia.gasto(energia.getPrimLeitura(),energia.getSegLeitura());
        energia.taxate(energia.getDiferenca());
        energia.taxatusd(energia.getDiferenca());
        energia.somataxas(energia.getTe(),energia.getTusd());
        energia.icms(energia.getTtSemBandeira());
        energia.bandeira(energia.getDiferenca());
        energia.acrecimo(energia.getBandeira(),energia.getIcms());
        energia.taxaPagar(energia.getIcms());
        energia.recibo(energia.getPrimLeitura(),energia.getSegLeitura(),energia.getDiferenca(),energia.getTtSemBandeira(),energia.getBandeira(),energia.getTtBandeira());
        
    }
    
}
