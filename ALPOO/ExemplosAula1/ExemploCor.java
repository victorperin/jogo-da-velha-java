import java.awt.*;
public class ExemploCor extends Frame
{
     public ExemploCor()
     {
        setTitle ("Primeira Tela"); // escreve String na barra de título do Frame
        setResizable (false); //tela redimensionada ou não
        setBounds(100,100,400,300); // (x,y,largura,altura)
        // cria uma cor mais escura
        Color novaCor = new Color (120, 200, 255);
        // fornece nova cor como parametro do metodo
        setBackground (novaCor); // cor de fundo
     }
     public static void main ( String args[])
     {
          ExemploCor ex = new ExemploCor();
          ex.show();
          //ex.setVisible(true);
     }
}

