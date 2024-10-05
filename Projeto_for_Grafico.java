package projeto_for_grafico;
import javax.swing.JOptionPane;
public class Projeto_for_Grafico {

    public static void main(String[] args) {
      int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
      for(int i = 0; i<=10; i++){
          JOptionPane.showInternalMessageDialog(null,num + " x " + i + " = " + (num*i));
          
    }
    }
    
}
