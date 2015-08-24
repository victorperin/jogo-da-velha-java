//"D:\Arquivos de programas\Java\jdk1.5.0_10\bin\javac"  -Xlint:deprecation ExemploFrame.java
import java.awt.*;
public class ExemploFrame extends Frame
{
     public ExemploFrame()
     {
        setTitle ("Primeira Tela"); // escreve String na barra de título do Frame
        setResizable (false); //tela redimensionada ou não
        setSize( 400, 300); // tamanho da tela (largura, altura);
        setLocation (0, 0); //posição do objeto na tela do computador, 
                                               // (x,y) canto superior esquerda do vídeo.
        setBackground (Color.blue); // cor de fundo
     }
     public static void main ( String args[])
     {
          ExemploFrame ex = new ExemploFrame();
          //ex.show();
          ex.setVisible(true);
     }
}
// setBounds(100,100,400,300) = setLocation(100,100) + setSize(400,300)
