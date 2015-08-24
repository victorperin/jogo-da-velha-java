// Fig. 22.6: SelfContainedPanel.java
// A self-contained JPanel class that handles its own mouse events.
package com.deitel.jhtp6.ch22;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class SelfContainedPanel extends JPanel 
{
   private int x1; // x location of mouse press
   private int y1; // y location of mouse press
   private int x2; // x location of mouse release
   private int y2; // y location of mouse release

   // set up mouse event handling for SelfContainedPanel
   public SelfContainedPanel()
   {
      // set up mouse listener
      addMouseListener(

         new MouseAdapter() // anonymous inner class
         {   
            // handle mouse press event
            public void mousePressed( MouseEvent event )
            {
               x1 = event.getX(); // store x location of mouse press
               y1 = event.getY(); // store y location of mouse press
            } // end method mousePressed

            // handle mouse release event
            public void mouseReleased( MouseEvent event )
            {
               x2 = event.getX(); // store x location of mouse release
               y2 = event.getY(); // store y location of mouse release
               repaint(); // draw completed shape
            } // end method mouseReleased
         } // end anonymous inner class
      ); // end call to addMouseListener

      // set up mouse motion listener
      addMouseMotionListener(

         new MouseMotionAdapter() // anonymous inner class
         {   
            // handle mouse drag event
            public void mouseDragged( MouseEvent event )
            {
               x2 = event.getX(); // update second x location of oval
               y2 = event.getY(); // update second y location of oval
               repaint(); // draw shape in progress
            } // end method mouseDragged
         } // end anonymous inner class
      ); // end call to addMouseMotionListener
   } // end SelfContainedPanel constructor

   // return preferred width and height of SelfContainedPanel
   public Dimension getPreferredSize()
   {
      return new Dimension( 150, 100 ); // return preferred size
   } // end method getPreferredSize

   // paint an oval at the specified coordinates
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      g.drawOval( Math.min( x1, x2 ), Math.min( y1, y2 ),
         Math.abs( x1 - x2 ), Math.abs( y1 - y2 ) ); // draw oval
   } // end method paintComponent
} // end class SelfContainedPanel


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
