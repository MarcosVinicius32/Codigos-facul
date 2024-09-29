package projeto_hospedagemhotel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class Projeto_HospedagemHotel {

   
    public static void main(String[] args) {
    double valor_simples = 255.50;
    double valor_dupla = 300.50;
    double valor_tripla = 350.50; 
        String codigo = JOptionPane.showInputDialog("Digite o código do tipo da diária:\nS - Simples\nD - Duplo\nT - Triplo");

        String diariasStr = JOptionPane.showInputDialog("Digite a quantidade de diárias desejadas:");
        int diarias = Integer.parseInt(diariasStr);
        double valorTotal = 0;

        
        switch (codigo) {
            case "S":
                valorTotal = valor_simples * diarias;
                break;
                case "s":
                valorTotal = valor_simples * diarias;
                break;
            case "D": 
                valorTotal =  valor_dupla *  diarias;
                break;
                case "d": 
                valorTotal =  valor_dupla *  diarias;
                break;
            case "T": 
                valorTotal = valor_tripla * diarias;
                break;
                case "t": 
                valorTotal = valor_tripla * diarias;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de diária inválido");
    
        }
 
        JOptionPane.showMessageDialog(null, "Valor total a pagar: R$ " + valorTotal);
       if(valorTotal > 200.00){
       JFrame frame = new JFrame("JOptionPane exemplo");
       int resposta = JOptionPane.showConfirmDialog(frame,"Voce deseja parcelar ?" + JOptionPane.YES_NO_OPTION);
       
    if (resposta == JOptionPane.YES_OPTION) {
        int parcela = Integer.parseInt(JOptionPane.showInputDialog("Em quantas vezes voce pretende parcelar ? "));
        double valor_parcela_total = valorTotal/parcela;
        JOptionPane.showMessageDialog(frame,"o valor que voce ira pagar em parcelas e de " + valor_parcela_total + "R$ reais");
        System.exit(0);
      }
      else {
         JOptionPane.showMessageDialog(null, "Obrigada por utilizar nossos serviços\nvolte sempre!!!");
         System.exit(0);
      }
        }
    }
}
    
