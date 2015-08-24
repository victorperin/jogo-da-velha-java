// Fig. 22.3: CustomPanel.java
// A customized JPanel class.
import java.awt.Graphics;
import javax.swing.JPanel;

public class CustomPanel extends JPanel 
{
   public static enum Shape { CIRCLE, SQUARE };
   private Shape shape; // type of shape to draw

   // use shape to draw an oval or rectangle
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      if ( shape == Shape.CIRCLE )
         g.fillOval( 50, 10, 60, 60 ); // draw circle
      else if ( shape == Shape.SQUARE )
         g.fillRect( 50, 10, 60, 60 ); // draw square
   } // end method paintComponent

   // set shape value and repaint CustomPanel
   public void draw( Shape shapeToDraw )
   {
      shape = shapeToDraw; // set shape that will be drawn
      repaint(); // repaint the panel to draw new shape
   } // end method draw
} // end class CustomPanel



/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
