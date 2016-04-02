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
	GameObject player;
	TurtleObject turtle, backgroundPage, backgroundPage2, bp3, bp4, bp5, bp6, bp7;
	BufferedImage background1, background2, backgroundTurtleAttack, backgroundTurtleRun, backgroundTurtleStuff, backgroundTurtlePoke;
	GameWindows w;

	public JPanelWindows() {
		
		t = new Timer(1000 , this);

	    
			try {
				background1 = ImageIO.read(this.getClass().getResourceAsStream("BackgroundPoke.png"));
				background2 = ImageIO.read(this.getClass().getResourceAsStream("flyingTurtleScreen1.png"));
				backgroundTurtleAttack =  ImageIO.read(this.getClass().getResourceAsStream("PokemonTurtleScreen2.png"));
				backgroundTurtlePoke =  ImageIO.read(this.getClass().getResourceAsStream("PokemonTurtleScreenPokemon.png"));
				backgroundTurtleRun =  ImageIO.read(this.getClass().getResourceAsStream("PokemonTurtleScreenRun.png"));
				backgroundTurtleStuff =  ImageIO.read(this.getClass().getResourceAsStream("PokemonTurtleScreenStuff.png"));

			} 
			catch (Exception e) {
				//System.out.println("Problem");
			}
	
		backgroundPage = new TurtleObject(1, 1, 800, 600, background1);
		backgroundPage2 = new TurtleObject(1, 1, 800, 600, background2);
		bp3 = new TurtleObject(1, 1, 800, 600, backgroundTurtleAttack);
		bp4 = new TurtleObject(1, 1, 800, 600, backgroundTurtlePoke);
		bp5 = new TurtleObject(1, 1, 800, 600, backgroundTurtleRun);
		bp6 = new TurtleObject(1, 1, 800, 600, backgroundTurtleStuff);
		t.start();
	}
	

	public void paintComponent(Graphics g) {
		if(count ==0){
		backgroundPage.draw(g);
		}
		if(count == 1)
			backgroundPage2.draw(g);
		if(count == 2)
			bp3.draw(g);
		if(count == 3)
			bp4.draw(g);
		if(count == 4)
			bp5.draw(g);
		if(count == 5)
			bp6.draw(g);
		
		
	}
	
	public void setCount(int s)
	{
		this.count = s;
	}
	
	public int getCount()
	{
		return count;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
		
	}

}
