import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TF_duration extends JTextField implements KeyListener{

	/**
	 * 
	 */
	private boolean dot_flag = false;
	private String str;
	
	private static final long serialVersionUID = 1L;
	public TF_duration(){
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		str = getText();
		
		if(!str.contains(".")){ // If dot is not exist current text field
			dot_flag = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(!dot_flag){ // Dot not typed yet.
			if(!Character.isDigit(e.getKeyChar()) && e.getKeyChar() != 8 && e.getKeyChar() != 46){
				// 8 = back space, 46 = dot
				e.consume();
			}
			if(e.getKeyChar() == 46){
				dot_flag = true;
			}
		}
		else{ // Dot typed.
			if(!Character.isDigit(e.getKeyChar()) && e.getKeyChar() != 8){
				// 8 = back space, 46 = dot
				e.consume();
			}
		}
		try{
			if(str.indexOf(".") == 0){
				setText("0" + str);
			}
		}catch(Exception er){
			
		}
	}

}
