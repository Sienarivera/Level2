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
	


	public GameWindows() {
		width = 500;
		height = 240;
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

		
		}

	

	public int getWidth() {
		return 500;

	}

	public int getHeight() {
		return 224;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		InputManager.mouseDragged(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		InputManager.mouseMoved(e);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method 
		InputManager.mouseClicked(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		InputManager.mousePressed(e);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		InputManager.mouseReleased(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		InputManager.mouseEntered(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		InputManager.mouseExited(e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		InputManager.keyTyped(e);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		InputManager.keyPressed(e);
		 
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		InputManager.keyReleased(e);
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		InputManager.actionPerformed(e);
	}

}
