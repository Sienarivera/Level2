import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameWindows implements ActionListener, KeyListener, MouseListener, MouseMotionListener
{
	JFrame frame;
	JPanelWindows panel;
	private int width, height;
	KeyListener key;
	MouseListener mouse;
	MouseMotionListener mouseL;
	
	
	public GameWindows()
	{
		width = 800;
		height = 600;
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
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		panel.addKeyListener(this);
		
	}

	public int getWidth()
	{
		return 800;
	
	}
	
	public int getHeight()
	{
		return 600;
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Dragged");
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Moved");
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Clicked");
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Pressed");
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Released");
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Entered");
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Exited");
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key Typed");
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key Pressed");
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key Released");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	}
	
}

