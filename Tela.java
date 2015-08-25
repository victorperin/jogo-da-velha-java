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
    setDefaultCloseOperation(EXIT_ON_CLOSE);





    for(int x=0;x<3;x++){
      for(int y=0;y<3;y++){
        botoes[x][y] = new Botao();
        this.add(botoes[x][y]);
        botoes[x][y].addActionListener(this);
      }
    }

  }


  public void actionPerformed(ActionEvent evento){
    for(int x=0;x<3;x++){
      for(int y=0;y<3;y++){
        if(evento.getSource() == botoes[x][y]){
          jogar(x,y,(contadorCliques % 2)+1);
        }
      }
    }

    if(contadorCliques==9) terminarJogo(0);
    checarVencedorVertical();
    checarVencedorHorizontal();
    checarVencedorDiagonal1();
    checarVencedorDiagonal2();
  }

  //verifica se houve algum vencedor, caso haja, termina o jogo
  private void checarVencedorVertical(){
    for(int y=0;y<3;y++){
      int countJogador1 = 0;
      int countJogador2 = 0;
      for(int x=0;x<3;x++){
        if(botoes[x][y].jogador==1)countJogador1++;
        else if(botoes[x][y].jogador==2)countJogador2++;
      }
      if(countJogador1==3) terminarJogo(1);
      else if(countJogador2==3) terminarJogo(2);
    }
  }
  //checa vencedor nas horizontais
  private void checarVencedorHorizontal(){
    for(int x=0;x<3;x++){
      int countJogador1 = 0;
      int countJogador2 = 0;
      for(int y=0;y<3;y++){
        if(botoes[x][y].jogador==1)countJogador1++;
        else if(botoes[x][y].jogador==2)countJogador2++;
      }
      if(countJogador1==3) terminarJogo(1);
      else if(countJogador2==3) terminarJogo(2);
    }
  }
  //checa vencedor na primeira diagonal
  private void checarVencedorDiagonal1(){
    int countJogador1 = 0;
    int countJogador2 = 0;
    for(int x=0;x<3;x++){
      if(botoes[x][x].jogador==1)countJogador1++;
      else if(botoes[x][x].jogador==2)countJogador2++;
    }
    if(countJogador1==3) terminarJogo(1);
    else if(countJogador2==3) terminarJogo(2);
  }
  //checa vencedor na segunda diagonal
  private void checarVencedorDiagonal2(){
    int countJogador1 = 0;
    int countJogador2 = 0;
    for(int x=0;x<3;x++){
      if(botoes[x][2-x].jogador==1)countJogador1++;
      else if(botoes[x][2-x].jogador==2)countJogador2++;
    }
    if(countJogador1==3) terminarJogo(1);
    else if(countJogador2==3) terminarJogo(2);
  }

  // método executado quando o jogo termina
  // se vencedor = 0 - empate
  // se vencedor = 1 - jogador 1 ganhou
  // se vencedor = 2 - jogador 2 ganhou
  private void terminarJogo(int vencedor){
    if(vencedor>0){
      new MensagemVencedor(vencedor);
    }
    for(int x=0;x<3;x++){
      for(int y=0;y<3;y++){
        botoes[x][y].setText("");
        botoes[x][y].jogador=0;
        botoes[x][y].setEnabled(true);
        contadorCliques=0;
      }
    }

  }

  // método executado a cada jogada
  //posX é a posição no arrayX do botão
  //posY é a posição no arrayY do botão
  //jogador é o número do jogador (ou 1 ou 2)
  private void jogar(int posX,int posY, int jogador){
    String texto = (jogador==1)?"X":"O";
    botoes[posX][posY].setText(texto);
    botoes[posX][posY].jogador = jogador;
    botoes[posX][posY].setEnabled(false);
    contadorCliques++;
  }


}
