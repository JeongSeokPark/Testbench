import javax.swing.JTextField;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TF_amplitude extends JTextField implements KeyListener{

	/**
	 * 
	 */
	private String str;
	private boolean length_flag = false;
	private boolean isPositive = true;
	
	private static final long serialVersionUID = 1L;
	public TF_amplitude(){
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		str = getText();
		if(isPositive){
			if(str.length() > 4){
				length_flag = true;
			}
			else {
				length_flag = false;
			}
		}
		else if(!isPositive){
			if(str.length() > 5){
				length_flag = true;
			}
			else {
				length_flag = false;
			}
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(!length_flag){
			if(e.getKeyChar() == 45){ // negative number.
				isPositive = false;
			}
			else if(e.getKeyChar() != 45){ // Positive number.
				isPositive = true;
			}
			if(!Character.isDigit(e.getKeyChar()) && e.getKeyChar() != 8 && e.getKeyChar() != 45){
				e.consume();
			}
		}
		else{
			e.consume();
		}
		
		
		try{
			if(str.indexOf("-") != 0){ // wrong operand position.
				setText("");
			}
		}catch(Exception er){
			
		}
	}

}
