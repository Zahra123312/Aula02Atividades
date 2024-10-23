import javax.swing.*;
public class Solucao02 {

    public static void main(String[] args) {
     double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Inclua um numero")) ;
     double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Inclua um numero")) ;

     double soma = numero1 + numero2;

     if (soma <= 20){ 
         soma = soma - 5;
         JOptionPane.showMessageDialog(null,"A soma dos dois numero vai ser "+soma);
     }else {
         JOptionPane.showMessageDialog(null," A soma é maior que 20");

     }

    }

}
