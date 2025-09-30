package projeto_loja_de_pisos;
import java.util.Scanner;

public class Projeto_loja_de_Pisos {

  
    public static void main(String[] args) {
     Double l,co,areatotal,c,custototal;
    Scanner read = new Scanner(System.in);   
    System.out.println("Escreva a largura do comprimento(em cm quadrados)");
    l = read.nextDouble();
    System.out.println("Escreva o comprimento da area(em cm quadrados)");
    co =read.nextDouble();
    System.out.println("Escreva o valor da caixa de pisos (em reais)");
    c = read.nextDouble();
    Double AREA_COBERTA_POR_CAIXAS= 2.5;
    areatotal=l*co;
    int numero_de_caixas=(int)Math.ceil( areatotal /AREA_COBERTA_POR_CAIXAS);
    custototal= numero_de_caixas*c;
    System.out.println("Vai necessitar de " + numero_de_caixas +" caixas de piso " + " e o custo ficara em " + custototal +" R$ ");
  
    }
    
}
