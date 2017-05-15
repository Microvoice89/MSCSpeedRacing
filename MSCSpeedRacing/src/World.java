import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class World
{
	private final int width, height;
    
	
	public World()
	{
		width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		 height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		 //System.out.println("l:" +larghezza+"    h: "+altezza);
	     
         	
	     
	     
	}

	
	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}

	
}