import javax.swing.JFrame;

public class GameWindows
{
	JFrame frame;
	JPanelWindows panel;
	private int width, height;
	
	public GameWindows()
	{
		width = 500;
		height = 500;
	}
	
	
	public static void main(String[] args)
	{
		GameWindows w = new GameWindows();
		w.createUI();

	}

	public void createUI()
	{
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanelWindows();
		frame.add(panel);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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

