// Fig. 22.4: DrawFrame.java
// Using a customized Panel object.
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class DrawFrame extends JFrame 
{
   private JPanel buttonPanel; // panel to hold the buttons
   private CustomPanel myPanel; // panel for drawing shapes
   private JButton circleButton; // button to create a circle
   private JButton squareButton; // button to create a square

   // set up GUI
   public DrawFrame()
   {
      super( "CustomPanel Test" );

      myPanel = new CustomPanel(); // create custom drawing area
      myPanel.setBackground( Color.GREEN ); // set color to green

      squareButton = new JButton( "Square" ); // button to create square
      squareButton.addActionListener(

         new ActionListener() // anonymous inner class 
         {  
            // draw a square
            public void actionPerformed( ActionEvent event )
            {
               myPanel.draw( CustomPanel.Shape.SQUARE ); // draw square
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end call to addActionListener

      circleButton = new JButton( "Circle" ); // button to create circle
      circleButton.addActionListener(

         new ActionListener() // anonymous inner class
         {   
            // draw a circle
            public void actionPerformed( ActionEvent event )
            {
               myPanel.draw( CustomPanel.Shape.CIRCLE ); // draw circle
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end call to addActionListener

      buttonPanel = new JPanel(); // panel to hold buttons
      buttonPanel.setLayout( new GridLayout( 1, 2 ) ); // use gridlayout
      buttonPanel.add( circleButton ); // add circle button
      buttonPanel.add( squareButton ); // add square button

      add( myPanel, BorderLayout.CENTER ); // add drawing panel to frame
      add( buttonPanel, BorderLayout.SOUTH ); // add buttons to frame
   } // end DrawFrame constructor
} // end class DrawFrame

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
