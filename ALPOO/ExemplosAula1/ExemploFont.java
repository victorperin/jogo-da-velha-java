import java.awt.*;
public class ExemploFont extends Frame
{
     Dimension dim;
     Font letra;
     public ExemploFont()
     {
        setTitle ("Primeira Tela"); // escreve String na barra de título do Frame
        setResizable (false); //tela redimensionada ou não
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        // Defina um estilo de escrita
        letra = new Font (" TimesRoman ", Font.PLAIN, 16);
        setFont (letra);
        setLocation(0,0); 
        setSize(dim);
        // cria uma cor mais escura
        Color novaCor = new Color (120, 200, 100);
        // fornece nova cor como parametro do metodo
        setBackground (novaCor); // cor de fundo
     }
    
     public static void main ( String args[])
     {
          ExemploFont ex = new ExemploFont();
          //ex.show(); 
          ex.setVisible(true);
     }
}
