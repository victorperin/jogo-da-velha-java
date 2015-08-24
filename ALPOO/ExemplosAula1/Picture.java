// Picture.java
import java.awt.*;
import java.awt.event.*;
public class Picture extends Canvas {
  private Image image;
  private int iHeight, iWidth;
  // Construtor Default
  // Componente assume o tamanho da imagem
  public Picture (String imageName) {
    this(imageName, 0, 0);
  }
  // Construtor Parametrizado
  // Componente assume o tamanho fornecido
  public Picture(String imageName, int width, int height) {
    image = Toolkit.getDefaultToolkit().getImage(imageName);
    MediaTracker tracker = new MediaTracker(this);
    tracker.addImage(image, 0);
    try {
      tracker.waitForID(0);
    } 
    catch (Exception e) {
      e.printStackTrace();
    }
    iWidth = (width==0 ? image.getWidth(this) : width);
    iHeight = (height==0 ? image.getHeight(this) : height);
    setBackground(SystemColor.control);
    setSize(iWidth, iHeight);
  }
  public void paint (Graphics g) {
    // renderiza imagem com ampliacao/reducao dada
    g.drawImage(image, 0, 0, iWidth, iHeight, this);
  }
}
