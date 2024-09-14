package projeto_imc_corporal;
import java.util.Scanner;

public class Projeto_IMC_Corporal {

    public static void main(String[] args) {
        double peso, altura,imc;//declarão das variaveis
        Scanner read = new Scanner(System.in);
        System.out.println("escreva seu peso");
        peso = read.nextDouble();
        System.out.println("escreva sua altura");
        altura= read.nextDouble();
        imc = peso/(altura*altura);
        System.out.println("Seu imc e " + imc + "KG/m2");
        
        
    }
    
}
