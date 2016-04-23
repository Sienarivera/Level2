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

public class GameWindows implements ActionListener, KeyListener {
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
		panel.addKeyListener(this);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		
		}

	

	public int getWidth() {
		return 500;

	}

	public int getHeight() {
		return 224;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		JPanelWindows.keyPressed(e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		JPanelWindows.keyTyped(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		JPanelWindows.keyReleased(e);
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		InputManager.actionPerformed(e);
	}

	

}
