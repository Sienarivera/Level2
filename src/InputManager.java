import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public  class InputManager {
	
	

	public static boolean LEFT_ARROW_KEY = false;
	public static boolean RIGHT_ARROW_KEY = false;
	public static boolean UP_ARROW_KEY = false;
	public static boolean DOWN_ARROW_KEY = false;


	
	public static void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	public static void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method 
	}

	public static void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	
	public static void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

	
	public static void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	
	public static void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}

	
	public static void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}

	
	public static void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 if(e.getKeyCode() == KeyEvent.VK_LEFT){
	   		 LEFT_ARROW_KEY = true;
	   	 }
		 if(e.getKeyCode() == KeyEvent.VK_RIGHT){
	   		 RIGHT_ARROW_KEY = true;
	   	 }
		 if(e.getKeyCode() == KeyEvent.VK_UP){
	   		 UP_ARROW_KEY = true;
	   	 }
		 if(e.getKeyCode() == KeyEvent.VK_DOWN){
	   		 DOWN_ARROW_KEY = true;
	   	 }
		 
		 
	}

	public static void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 if(e.getKeyCode() == KeyEvent.VK_LEFT){
	   		 LEFT_ARROW_KEY = false;
	   	 }
		 if(e.getKeyCode() == KeyEvent.VK_RIGHT){
	   		 RIGHT_ARROW_KEY = false;
	   	 }
		 if(e.getKeyCode() == KeyEvent.VK_UP){
	   		 UP_ARROW_KEY = false;
	   	 }
		 if(e.getKeyCode() == KeyEvent.VK_DOWN){
	   		 DOWN_ARROW_KEY = false;
	   	 }
		 
	}

	
	public static void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
