import java.awt.*;
import java.awt.event.*;
public class ExemploFlowLayout extends Frame 
{
	public Label L1 ;

	public Button B1, B2, B3, B4, B5,B6, B7, B8;
	public TextField Tx1, Tx2 ;
	public Dimension dim;
	public ExemploFlowLayout()
	{
		dim = new Dimension(450,260);
		setSize(dim);
		setLocation(220,180);
		setTitle("A classe FlowLayout");
		setBackground(new Color(250,250,200));
		
		setLayout(new FlowLayout(1));	
						
		L1 = new Label("Esta é a classe \"FlowLayout\" :");
		
		L1.setBackground(new Color(250,250,200));
		
		Tx1 = new TextField(" ");
		
		Tx2 = new TextField("Escreva outra mensagem aqui ");
			
		B1 = new Button("Sair");
		B1.setBackground(new Color(250,250,200));
	
		
		B2 = new Button("red");
		B2.setBackground(new Color(250,250,200));
		
		B3 = new Button("green");
		B3.setBackground(new Color(250,250,200));
	
		B4 = new Button("blue");
		B4.setBackground(new Color(250,250,200));
		
		
		B5 = new Button("orange");
		B5.setBackground(new Color(250,250,200));
		
		
		B6 = new Button("Cinza");
		B6.setBackground(new Color(250,250,200));
		
		
		B7 = new Button("Yellow");
		B7.setBackground(new Color(250,250,200));
		
		
		B8 = new Button("DarkOrange");
		B8.setBackground(new Color(250,250,200));
	
		
		add(L1);
		add(Tx1);
		add(Tx2);
		add(B3);
		add(B4);
		add(B1);
		add(B2);
		add(B5);
		add(B6);
		add(B7);
		add(B8);
		addWindowListener(new FechandoJanela());
	}
	public static void main(String arg[])
	{
		new ExemploFlowLayout().setVisible(true);
	}
	
}
