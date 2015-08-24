// Fig. 22.7: CustomFrame.java
// Creating a custom frame that contains components 
// for testing SelfContainedPanel.
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import com.deitel.jhtp6.ch22.SelfContainedPanel;

public class CustomFrame extends JFrame 
{
   private SelfContainedPanel myPanel; // panel to draw an oval

   // set up GUI and mouse motion event handlers for application window
   public CustomFrame()
   {
      myPanel = new SelfContainedPanel(); // create self contained panel
      myPanel.setBackground( Color.YELLOW ); // set background to yellow

      setLayout( new FlowLayout() ); // set frame layout
      add( myPanel ); // add self contained panel to frame

      // set up mouse motion event handling
      addMouseMotionListener(

         new MouseMotionListener() // anonymous inner class
         {  
            // handle mouse drag event
            public void mouseDragged( MouseEvent event )
            {
               setTitle( String.format( "Dragging: x=%d; y=%d",
                  event.getX(), event.getY() ) ); // display dragging
            } // end method mouseDragged

            // handle mouse move event
            public void mouseMoved( MouseEvent event )
            {
               setTitle( String.format( "Moving: x=%d; y=%d", 
                  event.getX(), event.getY() ) ); // display moving
            } // end method mouseMoved
         } // end anonymous inner class
      ); // end call to addMouseMotionListener
   } // end CustomFrame constructor
} // end class CustomFrame

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
