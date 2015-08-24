// CardLayoutDemo.java
import java.awt.*;
import java.awt.event.*;
public class CardLayoutDemo extends Frame implements ActionListener
{
  private Panel cards;
  private Button bPrim, bAnt, bProx, bUlt;
  // método main
  public static void main(String args[]) {
    CardLayoutDemo f = new CardLayoutDemo();
    f.addWindowListener(new FechandoJanela());
    f.show();
  }
  // construtor
  public CardLayoutDemo() {
    super("CardLayout Demo");
    setSize(300, 200);
    // Painel Lateral de Controle
    Panel p1 = new Panel();
    p1.setBackground(SystemColor.control);
    Panel p2 = new Panel();
    p2.setBackground(SystemColor.control);
    p2.setLayout(new GridLayout(4, 1, 5, 5));
    p2.add(bPrim = new Button("Primeiro"));
    bPrim.addActionListener(this);
    p2.add(bAnt = new Button("Anterior"));
    bAnt.addActionListener(this);
    p2.add(bProx = new Button("Proximo"));
    bProx.addActionListener(this);
    p2.add(bUlt = new Button("Último"));
    bUlt.addActionListener(this);
    p1.add(p2);
    add("East", p1);
    // Painel Múltiplo
    cards = new Panel();
    cards.setLayout(new CardLayout());
    cards.add(new Label("Primeiro Painel"), "C1");
    cards.add(new Picture("Fonte_lab_2.gif"), "C2");
    cards.add(new TextArea(), "C3");
    p2 = new Panel();
    p2.setBackground(SystemColor.control);
    p2.add(new Label("Quarto Painel"));
    p2.add(new Picture("Fonte_lab_2.gif", 32, 32));
    cards.add(p2, "C4");
    p2 = new Panel();
    p2.setBackground(SystemColor.lightGray);
    cards.add(p2, "C5");
    add("Center", cards);
  }
  public void actionPerformed(ActionEvent e) {
    CardLayout cl = (CardLayout) cards.getLayout();
    if (e.getSource()==bPrim) {
      cl.first(cards);
    } 
    else 
      if (e.getSource()==bAnt) {
        cl.previous(cards);
      } 
      else 
        if (e.getSource()==bProx) {
          cl.next(cards);
        } 
        else 
          if (e.getSource()==bUlt) {
            cl.last(cards);
          }
  }
}
