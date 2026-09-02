package Atividade1;

import javax.swing.JOptionPane;
public class Testequestao6 {
    public void main (String [] args){
        int quantMacas = Integer.parseInt(JOptionPane.showInputDialog("Quantas Maçãs?"));
        int quantMamoes = Integer.parseInt(JOptionPane.showInputDialog("Quantos Mamões"));
        double valorApagar = quantMacas * 1 + quantMamoes * 3.50;
        JOptionPane.showMessageDialog(null,"você pagará" +valorApagar);

    }
}
