import javax.swing.JTextField;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
// import java.util.regex.*;

public class TF_duration extends JTextField implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TF_duration(){
		addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(!Character.isDigit(e.getKeyChar()) && e.getKeyChar() != 8 && e.getKeyChar() != 45 && e.getKeyChar() != 46){
			e.consume();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
