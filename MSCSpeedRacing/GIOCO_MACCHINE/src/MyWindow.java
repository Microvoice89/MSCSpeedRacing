import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu ;
import javax.swing.JMenuItem ;
import javax.swing.JMenuBar ;


public class MyWindow
{
	public final int widgh;
	public final int height;
	public MyWindow()
	{ widgh = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	 height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		JFrame Finestra =new JFrame ("MSCSpeedRacing");
        Finestra.setBounds(0,0,widgh,height);
        Finestra.setVisible(true);
        Panel p = new Panel();
    	p.setBackground(Color.black);
    	Finestra.add(p);
    	
    	Button b1 = new Button("Ettore");
    	
    	Button b2 = new Button("Giuseppe");
    	
    	Button b3 = new Button("Mirco");
    	//p.setLayout(new FlowLayout(FlowLayout.CENTER));
    	
    	p.add(b1);
    	
    	p.add(b1);
    	
    	p.add(b2);
    	
    	p.add(b3);
    	
    /*	MenuBar barra=new MenuBar();
    	MenuItem apri=new MenuItem("Apri");
    	MenuItem chiudi=new MenuItem("Chiudi");
    	MenuItem salva=new MenuItem("Salva");
    	MenuItem esci=new MenuItem("Esci");
    	//void remove(int index) ;
    //	void remove(MenuComponent item) 
    //	void removeAll()
    	
    	Menu file= new Menu("File");
    	file.add(apri);
    	file.add(salva);
    	file.add(chiudi);
    	file.addSeparator();
    	file.add(esci);
    	barra.add(file);
    	//barra.add(edit);
    	//barra. setHelpMenu(help);*/
        Finestra.setVisible(true);
	}
	
	
	
}
