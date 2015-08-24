// Fig. 22.7: PopupFrame.java
// Demonstrating JPopupMenus.
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.ButtonGroup;

public class PopupFrame extends JFrame 
{
   private JRadioButtonMenuItem items[]; // holds items for colors
   private final Color colorValues[] = 
      { Color.BLUE, Color.YELLOW, Color.RED }; // colors to be used
   private JPopupMenu popupMenu; // allows user to select color

   // no-argument constructor sets up GUI
   public PopupFrame()
   {
      super( "Using JPopupMenus" );

      ItemHandler handler = new ItemHandler(); // handler for menu items
      String colors[] = { "Blue", "Yellow", "Red" }; // array of colors

      ButtonGroup colorGroup = new ButtonGroup(); // manages color items
      popupMenu = new JPopupMenu(); // create pop-up menu
      items = new JRadioButtonMenuItem[ 3 ]; // items for selecting color

      // construct menu item, add to popup menu, enable event handling
      for ( int count = 0; count < items.length; count++ ) 
      {
         items[ count ] = new JRadioButtonMenuItem( colors[ count ] );
         popupMenu.add( items[ count ] ); // add item to pop-up menu
         colorGroup.add( items[ count ] ); // add item to button group
         items[ count ].addActionListener( handler ); // add handler
      } // end for

      setBackground( Color.WHITE ); // set background to white

      // declare a MouseListener for the window to display pop-up menu
      addMouseListener(

         new MouseAdapter() // anonymous inner class
         {  
            // handle mouse press event
            public void mousePressed( MouseEvent event )
            { 
               checkForTriggerEvent( event ); // check for trigger
            } // end method mousePressed

            // handle mouse release event
            public void mouseReleased( MouseEvent event )
            { 
               checkForTriggerEvent( event ); // check for trigger
            } // end method mouseReleased

            // determine whether event should trigger popup menu
            private void checkForTriggerEvent( MouseEvent event )
            {
               if ( event.isPopupTrigger() ) 
                  popupMenu.show( 
                     event.getComponent(), event.getX(), event.getY() );  
            } // end method checkForTriggerEvent
         } // end anonymous inner class
      ); // end call to addMouseListener
   } // end PopupFrame constructor

   // private inner class to handle menu item events
   private class ItemHandler implements ActionListener 
   {
      // process menu item selections
      public void actionPerformed( ActionEvent event )
      {
         // determine which menu item was selected
         for ( int i = 0; i < items.length; i++ )
         {
            if ( event.getSource() == items[ i ] ) 
            {
               getContentPane().setBackground( colorValues[ i ] );
               return;
            } // end if
         } // end for
      } // end method actionPerformed
   } // end private inner class ItemHandler
} // end class PopupFrame

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
 