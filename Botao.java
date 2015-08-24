import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botao extends JButton{
  private static final long serialVersionUID = 1L;

  public Botao(){
    super();
  }

  public void actionPerformed(ActionEvent evento){
    System.out.print("teste");
  }
}
