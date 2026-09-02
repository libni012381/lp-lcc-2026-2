package Atividade1;
import javax.swing.JOptionPane;
public class ImcQuestao7 {
    public static void main(String []args){
        String pesostr = JOptionPane.showInputDialog("Qual o seu peso?");
        double peso = Double.parseDouble(pesostr);
        String alturastr = JOptionPane.showInputDialog("Qual a sua altura?");
        double altura = Double.parseDouble(alturastr);
        double media = (peso / (altura * altura));
        JOptionPane.showMessageDialog(null,"Seu IMC é de exatos:" +media);

    }
}
