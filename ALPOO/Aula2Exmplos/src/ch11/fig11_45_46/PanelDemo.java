package ch11.fig11_45_46;

// Fig. 11.44: PanelDemo.java
// Testing PanelFrame.
import javax.swing.JFrame;

public class PanelDemo extends JFrame 
{
   public static void main( String args[] )
   { 
      PanelFrame panelFrame = new PanelFrame(); 
      panelFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      panelFrame.setSize( 450, 200 ); // set frame size
      panelFrame.setVisible( true ); // display frame
   } // end main
} // end class PanelDemo


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
