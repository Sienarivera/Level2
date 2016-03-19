import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class TurtleObject extends GameObject {

	 BufferedImage image;
	
	public TurtleObject(int x, int y, int width, int height,BufferedImage image)
	{
		super(x,y,width,height);
		this.image = image;
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(image, super.getX(), super.getY(), super.getWidth(), super.getHeight(), null);
	}
	
}
