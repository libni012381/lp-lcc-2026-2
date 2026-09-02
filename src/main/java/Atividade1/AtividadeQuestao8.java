package Atividade1;
import javax.swing.JOptionPane;

public class AtividadeQuestao8 {
    public static void main (String [] args){
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        String cidade = JOptionPane.showInputDialog("Qual a cidade que você nasceu?");
        JOptionPane.showMessageDialog(null,"Oi "+ nome+ " ! Que legal saber que você é da cidade  " + cidade+ " onde " + nome + " é o valor String lido e " + cidade + " é o valor da cidade lido.");

    }
}
