import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GameObject {
	private int x, y, width, height;
	BufferedImage image;

	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics g)
	{
		g.drawImage(image, x, y, width, height,null);
	}

	public void update() {
	
		
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}

}
