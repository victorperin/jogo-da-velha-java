import java.awt.*;
import java.awt.event.*;
public class ExemploEvento extends Frame implements WindowListener
{
     Dimension dim;
     Image Im;
     Font letra;
     public ExemploEvento()
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
        /* A classe toolkit permite através do método "getDefaultToolkit90"
           que seja capturada a imagem, que no caso está na mesma pasta do 
           arquivo fonte  */
        Im = Toolkit.getDefaultToolkit().getImage ("Fonte_lab_2_gif");
        
        addWindowListener(this);
        
     }
     public void paint (Graphics g)
     {
        if (Im != null) {
          g.drawImage(Im, 190, 150, this);
          super.paint(g);
        }
     }
     
     public void windowActivated(WindowEvent e)
     {
     }
     
     public void windowDeactivated(WindowEvent e)
     {
     }
     
     public void windowIconified(WindowEvent e)
     {
     }
     
     public void windowDeiconified(WindowEvent e)
     {
     }
     
     public void windowOpened(WindowEvent e)
     {
     }
     
     public void windowClosed(WindowEvent e)
     {
     }
     
     public void windowClosing(WindowEvent e)
     {
        System.exit(0);
     }
     
     public static void main ( String args[])
     {
          new ExemploEvento().show();
     }
}
