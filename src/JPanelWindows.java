import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;


public class JPanelWindows extends JPanel implements ActionListener
{
	Timer t;
	GameObject player;
	TurtleObject turtle;
	BufferedImage image, background;
	
	public JPanelWindows()
	{	
		
		player = new GameObject(100,100,150,150);
		t = new Timer(1000/60, this);
		t.start();
		 image = null;
		try
		{
			image = ImageIO.read(this.getClass().getResourceAsStream("tutl.png"));
		}
		catch(Exception e)
		{
			System.out.println("Problem");
		}    
		
		turtle = new TurtleObject(10,10,100,100,image);
		
	}
	
	public void paintComponent(Graphics g)
	{
		turtle.draw(g);
		
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		repaint();
		player.update();
	}

}
