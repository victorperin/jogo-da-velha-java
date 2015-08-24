import java.awt.*;
import java.awt.event.*;

public class ExemploCardLayout extends Frame 
implements ActionListener
{
	public Panel Max, P1,P2,P3,Pbot ;
	public Button B1,B2,B3;
	public Label L1, L2, L3 ;
	public TextField Tx1, Tx2 ;

	public ExemploCardLayout()
	{
		setTitle("O Gerenciador CardLayout");
		setSize(300,200);
		setLocation(250,200);
		setBackground(Color.black);
		setLayout(new BorderLayout());
		B1= new Button("verde");
		B1.addActionListener(this);
		B2 = new Button("laranja");
		B2.addActionListener(this);
		B3 = new Button("Amarelo");
		B3.addActionListener(this);
		L1 = new Label("A cor é verde");
		L2 = new Label("A cor é laranja");
		L3 = new Label("A cor é Amarelo");
		Tx1= new TextField("escreva aqui :");
		Tx2= new TextField("              ");
		
		Max = new Panel();
		Max.setSize(200,200);
		Max.setLayout(new CardLayout());
		
		Pbot = new Panel();
		Pbot.setSize(100,200);
		Pbot.setLayout(new GridLayout(3,1));
		Pbot.add(B1);
		Pbot.add(B2);
		Pbot.add(B3);
		
		P1 = new Panel();
		P1.setBackground(Color.green);
		P1.setLayout(new FlowLayout());
		P1.add(L1);
		
		P2 = new Panel();
		P2.setBackground(Color.orange);
		P2.setLayout(new FlowLayout());
		P2.add(L2);
		
		P3 = new Panel();
		P3.setBackground(Color.yellow);
		P3.setLayout(new FlowLayout());
		P3.add(L3);
		
		Max.add(P1,"P1");
		Max.add(P2,"P2");
		Max.add(P3,"P3");
		
		add(Max,BorderLayout.CENTER);
		add(Pbot,BorderLayout.WEST);			
		addWindowListener(new FechandoJanela());
	}
	public void actionPerformed( ActionEvent e)
	{
		CardLayout cl = (CardLayout) Max.getLayout();
		if(e.getSource()==B1)
		{
			cl.show(Max,"P1");
		}
			if(e.getSource()==B2)
		{
			cl.show(Max,"P2");
		}
			if(e.getSource()==B3)
		{
			cl.show(Max,"P3");
		}
	}
	public static void main(String arg[])
	{
		ExemploCardLayout f = new ExemploCardLayout();
		f.show();
	}
	
}
