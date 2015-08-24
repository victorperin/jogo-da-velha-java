import java.awt.*;
import java.awt.event.*;
public class ExemploEventAction extends Frame implements ActionListener
{
	public Label L1 ;
	public Button B1, B2, B3;
	public TextField Tx ;
	public Dimension dim;

	public ExemploEventAction()
	{
		dim = Toolkit.getDefaultToolkit().getScreenSize();	
		setSize(dim);
		setLocation(0,0);
		setTitle("A interface \"ActionListener\"");
		setBackground(new Color(250,250,200));
		setLayout(null);	
						
		L1 = new Label("Aperte o botão :");
		L1.setLocation(50,50);
		L1.setBackground(new Color(250,250,200));
		L1.setSize(150,20);
			
		B1 = new Button("Sair");
		B1.setSize(60,20);
		B1.setLocation(50,150);
		B1.setBackground(new Color(200,220,200));
		B1.addActionListener(this);
		
		B2 = new Button("Red");
		B2.setSize(60,20);
		B2.setLocation(200,150);
		B2.setBackground(new Color(200,220,200));
		B2.addActionListener(this);
		
		B3 = new Button("Voltar");
		B3.setSize(60,20);
		B3.setLocation(200,200);
		B3.setBackground(new Color(200,220,200));
		B3.addActionListener(this);
		
		add(L1);
		add(B1);
		add(B2);
		add(B3);
		addWindowListener(new FechandoJanela());
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if ( e.getSource( ) == B1 )
		{
		System.exit ( 0 )  ;
		}
		if ( e.getSource( ) == B2 )
		{
		setBackground ( Color.red ) ;
		L1.setBackground(Color.red);
		}
		if ( e.getSource( ) == B3 )
		{
		setBackground (new Color(250,250,200)) ;
		L1.setBackground(new Color(250,250,200));
		}

	} 

	public static void main(String arg[])
	{
		new ExemploEventAction().show();
	}
	
}
