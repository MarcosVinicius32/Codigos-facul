package vetorprimeiro;
import java.util.Scanner;

public class Vetorprimeiro {

  
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     int vet[]= new int[5];
     int i;
     for (i=0;i<=4;i++){
         System.out.printf("digite um valor para uma posicao %d: ",i);
         vet[i] = read.nextInt();
     }
     for (i=0; i <= 4;i++){
      System.out.printf("valor na posicao %d: \n",i,vet[i]);
     
     }
    }
    
}
