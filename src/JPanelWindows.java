import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class JPanelWindows extends JPanel implements ActionListener {
	Timer t;
	int count;
	BufferedImage background, playerSprite;
	Player player;
	ImageObject backgroundImage;

	GameWindows w;

	public JPanelWindows() {
		
		t = new Timer(1000 , this);


		BufferedImage background = null;
		BufferedImage playerSprite = null;
		try
		{
		background = ImageIO.read(this.getClass().getResourceAsStream("level2.png"));
		playerSprite = ImageIO.read(this.getClass().getResourceAsStream("koopa1.png"));
		}
		catch(Exception e)
		{
			System.out.println("Blah");
		}   
	    
		backgroundImage = new ImageObject(1,1, 3800 ,224, background);
		player = new Player(10,160,86/2,97/2,playerSprite);
		
	}

	public void paintComponent(Graphics g) {
		backgroundImage.draw(g);
		player.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

	}

}
