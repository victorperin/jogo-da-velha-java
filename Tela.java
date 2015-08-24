import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Tela extends JFrame implements ActionListener{

  private static final long serialVersionUID = 1L;

  private Botao[][] botoes = new Botao[3][3];
  private int contadorCliques = 0;

  public Tela(){
    super("Jogo da Velha");
    //JFrame frame = new JFrame("Exemplo de Frame");
    this.setSize(300, 300);
    // define o tamanho do frame
    this.setVisible(true);
    // ativa visualização do frame
    this.setLayout( new GridLayout(3,3) );






    for(int x=0;x<3;x++){
      for(int y=0;y<3;y++){
        botoes[x][y] = new Botao();
        this.add(botoes[x][y]);
      }
    }

  }


  public void actionPerformed(ActionEvent evento){
  }









  public static void main (String[] args){
    Tela tela = new Tela();
  }











}
