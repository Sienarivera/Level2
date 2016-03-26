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
	TurtleObject turtle, backgroundPage, pikachu;
	BufferedImage pika;
	BufferedImage image, background;
	GameWindows w;
	
	public JPanelWindows()
	{	
		
		
		t = new Timer(1000/60, this);
		t.start();
		try
		{
			image = ImageIO.read(this.getClass().getResourceAsStream("tutl.png"));
			background = ImageIO.read(this.getClass().getResourceAsStream("FlyingTurtleB.png"));
			pika = ImageIO.read(this.getClass().getResourceAsStream("pika.png"));
		}
		catch(Exception e)
		{
			System.out.println("Problem");
		}    
		
		turtle = new TurtleObject(500,60,200,200,image);
		backgroundPage = new TurtleObject(1,1,800,600, background);
		pikachu = new TurtleObject(100,200,74*3,94*3,pika);
		
	}
	
	public void paintComponent(Graphics g)
	{
		backgroundPage.draw(g);
		turtle.draw(g);
		pikachu.draw(g);
	
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}

}
