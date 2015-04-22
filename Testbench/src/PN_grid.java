import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;


public class PN_grid extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image image;
	
	public PN_grid(Image image){
		this.image = image;
	}
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		if (image != null)
	    {
	        g.drawImage(image,0,0,this);
	    }
	}

}
