import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class JPanelWindows extends JPanel implements ActionListener, KeyListener {
	Timer t;
	int count;
	BufferedImage background, playerSprite;
	Player player;
	ImageObject backgroundImage;

	GameWindows w;
	public static boolean LEFT_ARROW_KEY = false;
	public static boolean RIGHT_ARROW_KEY = false;
	public static boolean UP_ARROW_KEY = false;


	public JPanelWindows() {
		
		t = new Timer(100 , this);

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
		t.start();

	}

	public void paintComponent(Graphics g) {
		backgroundImage.draw(g);
		player.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		player.update();
		repaint();

	}

	public void keyPressed(KeyEvent e) {
		System.out.println("blah");
		 if(e.getKeyCode() == KeyEvent.VK_LEFT){
	   		 LEFT_ARROW_KEY = true;
	   	 }
		 if(e.getKeyCode() == KeyEvent.VK_RIGHT){
	   		 RIGHT_ARROW_KEY = true;
	   	 }
		 if(e.getKeyCode() == KeyEvent.VK_UP){
	   		 UP_ARROW_KEY = true;
	   	 }
		 
		 
	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		
	}
	public void keyReleased(KeyEvent e) {
		System.out.println("blah");
		// TODO Auto-generated method stub
		 if(e.getKeyCode() == KeyEvent.VK_LEFT){
	   		 LEFT_ARROW_KEY = false;
	   	 }
		 if(e.getKeyCode() == KeyEvent.VK_RIGHT){
	   		 RIGHT_ARROW_KEY = false;
	   	 }
		 if(e.getKeyCode() == KeyEvent.VK_UP){
	   		 UP_ARROW_KEY = false;
	   	 }
		 
	}
}
