
package projeto_escolha_numero;
import javax.swing.JOptionPane;

public class Projeto_escolha_Numero {

   
    public static void main(String[] args) {
       int x1 = Integer.parseInt(JOptionPane.showInputDialog(" Escolha um numero inteiro "));
       switch(x1){
           case 0 -> JOptionPane.showMessageDialog(null," Valor correto "); 
           case 1 -> JOptionPane.showMessageDialog(null," Valor correto ");
           case 2 -> JOptionPane.showMessageDialog(null," Valor correto ");
           case 3 -> JOptionPane.showMessageDialog(null," Valor correto ");
           case 4 -> JOptionPane.showMessageDialog(null," Valor correto ");
           case 5 -> JOptionPane.showMessageDialog(null," Valor correto ");
           case 6 -> JOptionPane.showMessageDialog(null," Valor correto ");
           case 7 -> JOptionPane.showMessageDialog(null," Valor correto ");
           case 9 -> JOptionPane.showMessageDialog(null," Valor correto "); 
           
       }
       if(x1>9){
       JOptionPane.showMessageDialog(null," Valor valor incorreto "); 
       }
    }
    
}
