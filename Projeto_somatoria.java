package projeto_somatoria;
import java.util.Scanner;

public class Projeto_Somatoria {

   
    public static void main(String[] args) {
       double n1; 
       Scanner read = new Scanner (System.in);
       double soma = 0;
       for(int i=1; i<=10; i++ ){
           System.out.println("Digite um numero :");
           n1 = read.nextDouble();
           soma = soma+n1;
       }
       System.out.println("A somatoria e " + soma );
    }
    
}
