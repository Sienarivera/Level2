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
		if(InputManager.LEFT_ARROW_KEY){
			x--;
		}
		if(InputManager.RIGHT_ARROW_KEY)
		{
			x++;
		}
		if(InputManager.UP_ARROW_KEY)
		{
			y++;
			}
	}
	
}
