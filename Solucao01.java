import javax.swing.*;

public class Solucao01 {

    public static void main(String[] args) {
     int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Inclua um numero inteiro")) ;
     int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Inclua um numero inteiro")) ;

     int soma = numero1 + numero2;

     if (soma > 10){
         JOptionPane.showMessageDialog(null,"A soma dos dois numero vai ser "+soma);
     }else {
         JOptionPane.showMessageDialog(null," A soma é menor ou igual a 10");
        }

    }

}
