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
			main.lbl_x1_SineCosine.setText("Cos(2\u03C0");
		}
		else if (e.getSource() == main.btn_x1_sine){
			System.out.println("btn_x1_sine clicked.");
			main.lbl_x1_SineCosine.setText("Sin(2\u03C0");
		}
		else if (e.getSource() == main.btn_x2_sine){
			System.out.println("btn_x2_sine clicked.");
			main.lbl_x2_SineCosine.setText("Sin(2\u03C0");
		}
		else if (e.getSource() == main.btn_x2_Cosine){
			System.out.println("btn_x2_Cosine clicked.");
			main.lbl_x2_SineCosine.setText("Cos(2\u03C0");
		}
		else if (e.getSource() == main.btn_x1_gen){
			System.out.println("btn_x1_gen clicked.");
		}
		else if (e.getSource() == main.btn_x2_gen){
			System.out.println("btn_x2_gen clicked.");
		}
		else if (e.getSource() == main.btn_x3_gen_a){
			System.out.println("btn_x3_gen_a clicked.");
			main.lbl_x3.setText("X\u2083(t) = X\u2081(t) + X\u2082(t)");
		}
		else if (e.getSource() == main.btn_x3_gen_m){
			System.out.println("btn_x3_gen_m clicked.");
			main.lbl_x3.setText("X\u2083(t) = X\u2081(t) * X\u2082(t)");
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
