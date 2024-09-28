package projeto_calculadora;
import java.util.Scanner;

public class Projeto_Calculadora {

  
    public static void main(String[] args) {
    int opc;
    Scanner read = new Scanner(System.in);
    System.out.println("Digite uma opcão: ");
    System.out.println("1- soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao\n5-Sair");
   
    opc = read.nextInt();
    switch(opc){
       case 1:  
                System.out.println("voce escolheu a soma");
                System.out.println("escreva o valor de a");
                int a = read.nextInt();
                System.out.println("escolha o valor de b");
                int b = read.nextInt();
                System.out.println("a soma dos dois termo e" + (a+b));
        break;  
        case 2:
            System.out.println("voce escolheu a subtração");
                break;  
        case 3:
            System.out.println("voce escolheu a multiplicação\n a multiplicacao de duas vareaveis ") ;
                break;  
        case 4:
            System.out.println("Voce escolheu a divisão\n a divisão de duas vareaveis ");
            break;  
        case 5: 
            System.out.println("obrigado por usar nosso programa");
            break;  
        default: System.out.println("opção inválida");
            }
    }
    }
    
