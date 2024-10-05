package projeto_for;
import java.util.Scanner;
public class Projeto_For {

    
    public static void main(String[] args) {
      int i,numero;  
      Scanner read = new Scanner(System.in);
      System.out.println("escreva um numero inteiro");
       numero = read.nextInt();
        for(i=1; i<=10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i) );    
        }
    }
    
}
