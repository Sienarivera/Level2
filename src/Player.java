import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player extends GameObject {
	
	 BufferedImage image;
	
	public Player(int x, int y, int width, int height,BufferedImage image)
	{
		super(x,y,width,height);
		this.image = image;
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(image, super.getX(), super.getY(), super.getWidth(), super.getHeight(), null);
	
	}
	
	public void update() {
		if(JPanelWindows.LEFT_ARROW_KEY){
			setX(super.getX()-2);
			System.out.println("blah");
		}
		if(JPanelWindows.RIGHT_ARROW_KEY)
		{
			setX(super.getX()+2);
		}
		if(JPanelWindows.UP_ARROW_KEY)
		{
			setY(super.getY()+4);

			}
		
	}
	
}
