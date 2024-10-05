package projeeto_somatorio_grafico;
import javax.swing.JOptionPane;
public class Projeeto_Somatorio_Grafico {

   
    public static void main(String[] args) {
    double n1;
    double soma = 0;
    for(int i = 1; i<=10; i++){
    n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
    soma = soma + n1; 
    }
        System.out.println("A somatoria e " + soma);
    }
    
}
