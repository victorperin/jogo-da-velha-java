import java.awt.*;
public class ExemploEventoAdaptadora extends Frame
{
     Dimension dim;
     Image Im;
     Font letra;
     public ExemploEventoAdaptadora()
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
        
        addWindowListener(new FechandoJanela());
        
     }
     public void paint (Graphics g)
     {
        if (Im != null) {
          g.drawImage(Im, 190, 150, this);
          super.paint(g);
        }
     }
     
     public static void main ( String args[])
     {
          new ExemploEventoAdaptadora().show();
     }
}
