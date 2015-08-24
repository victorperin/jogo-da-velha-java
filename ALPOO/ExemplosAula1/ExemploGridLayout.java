import java.awt.*;
import java.awt.event.*;
public class ExemploGridLayout extends Frame 
{
	
	public Button B1,B2,B3,B4, B5, B6, B7, B8,B9,B0, B11, B12, B13,B14,B15,B16 ;
	public Panel P1 ;

	public ExemploGridLayout()
	{
		
		setSize(200,200);
		setLocation(150,150);
		setTitle("A classe GridLayout");
		setBackground(Color.black);
		
		setLayout(null);	
		P1 =new Panel();
		P1.setSize(195,180);
		P1.setLocation(5,20);
		P1.setLayout(new GridLayout(4,4,2,2));
		B1 = new Button("1");
		B1.setBackground(Color.lightGray);
		B2 = new Button("2");
		B2.setBackground(Color.lightGray);
		B3 = new Button("3");
		B3.setBackground(Color.lightGray);
		B4 = new Button("4");
		B4.setBackground(Color.lightGray);
		B5 = new Button("5");
		B5.setBackground(Color.lightGray);
		B6 = new Button("6");
		B6.setBackground(Color.lightGray);
		B7 = new Button("7");
		B7.setBackground(Color.lightGray);
		B8 = new Button("8");
		B8.setBackground(Color.lightGray);
		B9 = new Button("9");
		B9.setBackground(Color.lightGray);
		B0 = new Button("0");
		B0.setBackground(Color.lightGray);
		B11 = new Button("Soma");
		B11.setBackground(Color.white);
		B12 = new Button("Subt.");
		B12.setBackground(Color.white);
		B13 = new Button("Mult");
		B13.setBackground(Color.white);
		B14 = new Button("Div");
		B14.setBackground(Color.white);
		B15 = new Button("raiz");
		B15.setBackground(Color.white);
		B16 = new Button("=");
		B16.setBackground(Color.orange);
		
		P1.add(B1);
		P1.add(B2);
		P1.add(B3);
		P1.add(B4);
		P1.add(B5);
		P1.add(B6);
		P1.add(B7);
		P1.add(B8);
		P1.add(B9);
		P1.add(B0);
		P1.add(B11);
		P1.add(B12);
		P1.add(B13);
		P1.add(B14);
		P1.add(B15);
		P1.add(B16);
		
		add(P1);
	
		addWindowListener(new FechandoJanela());
	}
	public static void main(String arg[])
	{
		new ExemploGridLayout().show();
	}
	
}
