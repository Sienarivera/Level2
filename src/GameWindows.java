import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GameWindows implements ActionListener, KeyListener, MouseListener, MouseMotionListener {
	JFrame frame;
	JPanelWindows panel;
	private int width, height;
	KeyListener key;
	MouseListener mouse;
	MouseMotionListener mouseL;
	BufferedImage background1;
	JButton button, buttonClicked;

	int count;
	private final int RED = -3920896;
	private final int GREEN = -10450126;
	private final int BLUE = -11981403;
	private final int YELLOW = -1456;
	private final int WHITE=-1052432 ;

	public GameWindows() {
		width = 800;
		height = 600;
		count = 0;
	}

	public static void main(String[] args) {
		GameWindows w = new GameWindows();
		w.createUI();

	}

	public void createUI() {
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanelWindows();
		frame.add(panel);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		panel.addKeyListener(this);

		try {
			background1 = ImageIO.read(this.getClass().getResourceAsStream("flyingTurtleScreen1.png"));

		} catch (Exception e) {
			System.out.println("Problem");
		}

	}

	public int getWidth() {
		return 800;

	}

	public int getHeight() {
		return 600;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		int mouseX = e.getX();
		int mouseY = e.getY();
		if(panel.getCount() == 1) {
			int mouseColor = background1.getRGB(mouseX, mouseY);
				if(mouseColor == RED)
					panel.setCount(2);
				if(mouseColor == GREEN)
					panel.setCount(3);
				if(mouseColor == BLUE)
					panel.setCount(4);
				if(mouseColor == YELLOW)
					panel.setCount(5);
				
		}
		if(panel.getCount() == 2){
			int mouseColor = background1.getRGB(mouseX, mouseY);
		if(mouseColor == RED)
			panel.setCount(2);
		if(mouseColor == GREEN)
			panel.setCount(3);
		if(mouseColor == BLUE)
			panel.setCount(4);
		if(mouseColor == YELLOW)
			panel.setCount(5);
		if(mouseColor == WHITE)
			panel.setCount(1);
		}
		else{
			int mouseColor = background1.getRGB(mouseX, mouseY);
			if(mouseColor == WHITE)
				panel.setCount(1);
			}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (panel.getCount() == 0)
			panel.setCount(1);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
