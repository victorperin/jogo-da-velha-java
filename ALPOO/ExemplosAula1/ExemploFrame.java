//"D:\Arquivos de programas\Java\jdk1.5.0_10\bin\javac"  -Xlint:deprecation ExemploFrame.java
import java.awt.*;
public class ExemploFrame extends Frame
{
     public ExemploFrame()
     {
        setTitle ("Primeira Tela"); // escreve String na barra de t�tulo do Frame
        setResizable (false); //tela redimensionada ou n�o
        setSize( 400, 300); // tamanho da tela (largura, altura);
        setLocation (0, 0); //posi��o do objeto na tela do computador, 
                                               // (x,y) canto superior esquerda do v�deo.
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
