import javax.swing.JTextField;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TF_frequency extends JTextField implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str;
	private boolean length_flag = false;

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		str = getText();
		if(str.length() > 2){
			length_flag = true;
		}
		else {
			length_flag = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(!length_flag){
			if(!Character.isDigit(e.getKeyChar()) && e.getKeyChar() != 8){
				e.consume();
			}
		}
		else{
			e.consume();
		}
	}
}
