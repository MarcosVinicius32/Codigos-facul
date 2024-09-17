package loja_de_pisos_grafica;
import javax.swing.JOptionPane;

public class Loja_de_Pisos_Grafica {

    public static void main(String[] args) {
       String largura0 = JOptionPane.showInputDialog("coloque o valor da largura da area (em cm)");
       Double largura = Double.valueOf(largura0);
       String comprimento1 = JOptionPane.showInputDialog("coloque o valor do comprimento da area (em cm)");
       Double comprimento = Double.valueOf(comprimento1);
       String valor_caixa1 = JOptionPane.showInputDialog("coloque o valor das caixas em (reais)");
       Double valor_caixa = Double.valueOf(valor_caixa1);
       Double area_coberta_caixa = 2.5;
       Double area_total = largura * comprimento; 
       int numero_de_caixas2 = (int)Math.ceil(area_total/area_coberta_caixa);
       Double custo_total = numero_de_caixas2 * valor_caixa;
       JOptionPane.showMessageDialog(null,"vai necessitar de " + numero_de_caixas2 + "caixas de piso" + " e o custo ficara em " + custo_total + "de reais");
    }
    
}
