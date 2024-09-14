package media_quatro_valores;
import java.util.Scanner;
public class Media_quatro_valores {

    public static void main(String[] args) {
       double n1,n2,n3,n4;
       Scanner read = new Scanner(System.in);
       System.out.println("escreva todas as n1");
       n1 = read.nextDouble();
        System.out.println("escreva todas as n2");
       n2 = read.nextDouble();
        System.out.println("escreva todas as n3");
       n3 = read.nextDouble();
        System.out.println("escreva todas as n4");
       n4 = read.nextDouble();
       double media = (n1+n2+n3+n4)/4;
       System.out.println("sua media e " + media);
       // criando if (SE)
       if (media >=6){
           System.out.println("parabens você passou");
       }
       else if (media >=4 && media <= 6){
           System.out.println("voce esta de recuperacao");
       
       }
       else{
           System.out.println("voce nao passou");
    }
    }
}
