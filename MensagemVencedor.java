import javax.swing.JOptionPane;

public class MensagemVencedor{

  public  MensagemVencedor(int vencedor){
    String texto = "O jogador "+vencedor+" venceu o jogo!";
    String titulo = "Parabéns!";
    JOptionPane.showMessageDialog(null,texto,titulo,JOptionPane.PLAIN_MESSAGE);
  }
}
