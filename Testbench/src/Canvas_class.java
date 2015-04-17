import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Canvas_class extends Canvas implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Testbench_main main;
	
	public Canvas_class(Testbench_main m){
		main = m;
		this.setSize(800, 700);
	}
	
	public void paint(Graphics g){
		
	}
	
	public void update(Graphics g){
		paint(g);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == main.btn_x1_Cosine){
			System.out.println("btn_x1_Cosine clicked.");
		}
		else if (e.getSource() == main.btn_x1_sine){
			System.out.println("btn_x1_sine clicked.");
		}
		else if (e.getSource() == main.btn_x2_sine){
			System.out.println("btn_x2_sine clicked.");
		}
		else if (e.getSource() == main.btn_x2_Cosine){
			System.out.println("btn_x2_Cosine clicked.");
		}
		else if (e.getSource() == main.btn_x1_gen){
			System.out.println("btn_x1_gen clicked.");
		}
		else if (e.getSource() == main.btn_x2_gen){
			System.out.println("btn_x2_gen clicked.");
		}
		else if (e.getSource() == main.btn_x3_gen_a){
			System.out.println("btn_x3_gen_a clicked.");
		}
		else if (e.getSource() == main.btn_x3_gen_m){
			System.out.println("btn_x3_gen_m clicked.");
		}
		else if (e.getSource() == main.btn_reset){
			System.out.println("btn_reset clicked.");
		}
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
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
