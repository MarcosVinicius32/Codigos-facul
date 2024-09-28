package projeto_calculadora;
import java.util.Scanner;

public class Projeto_calculadora {

    
    public static void main(String[] args) {
       int opc;
    Scanner read = new Scanner(System.in);
    System.out.println("Digite uma opcão: ");
    System.out.println("1- soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao\n5-Sair");
   
    opc = read.nextInt();
    switch(opc){
       case 1:  
            System.out.println("voce escolheu a soma");
            System.out.println("escreva o valor 1");
            int a = read.nextInt();
            System.out.println("escolha o valor 2");
            int b = read.nextInt();
            System.out.println("a soma dos dois termo e " + (a+b));
        break;  
        case 2:
            System.out.println("voce escolheu a subtração");
            System.out.println("escolha um valor 1");
            int c = read.nextInt();
            System.out.println("escolha o valor 2");
            int d = read.nextInt(); 
            System.out.println("a subtração dos dois termos e " + (c-d));
                break;  
        case 3:
            System.out.println("voce escolheu a multiplicação");
            System.out.println("coloque o valor 1");
            int e = read.nextInt();
            System.out.println("coloque o valor 2");
            int f = read.nextInt();
            System.out.println("a multiplicação dos dois termos e " + (e*f));
                break;  
        case 4:
            System.out.println("Voce escolheu a divisão ");
            System.out.println("coloque o valor 1");
            double g = read.nextInt();
            System.out.println("coloque o valor 2");
            double h = read.nextInt();
            System.out.println("A Divisão dos dois termos " + (g/h));
            break;  
        case 5: 
            System.out.println("obrigado por usar nosso programa");
            break;  
        default: System.out.println("opção inválida");
            }
    }
    }
