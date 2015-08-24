package ch11.fig11_45_46;

// Fig. 11.43: PanelFrame.java
// Using a JPanel to help lay out components.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame 
{
   private JPanel buttonJPanel; // panel to hold buttons
   private JButton buttons[]; // array of buttons

   // no-argument constructor
   public PanelFrame()
   {
      super( "Panel Demo" );
      buttons = new JButton[ 5 ]; // create buttons array
      buttonJPanel = new JPanel(); // set up panel
      buttonJPanel.setLayout( new GridLayout( 1, buttons.length ) );

      // create and add buttons
      for ( int count = 0; count < buttons.length; count++ ) 
      {
         buttons[ count ] = new JButton( "Button " + ( count + 1 ) );
         buttonJPanel.add( buttons[ count ] ); // add button to panel
      } // end for

      add( buttonJPanel, BorderLayout.SOUTH ); // add panel to JFrame
   } // end PanelFrame constructor
} // end class PanelFrame


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
