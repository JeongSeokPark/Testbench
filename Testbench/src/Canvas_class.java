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
	private boolean x1_sine_flag = false;
	private boolean x2_sine_flag = false;
	private boolean x1_gen_flag = false;
	private boolean x2_gen_flag = false;
	private boolean x1_gen_clicked = false;
	private boolean x2_gen_clicked = false;
	
	private double duration_start = 0.0, duration_finish = 0.0;
	private int x1_amplitude = 0, x1_frequency = 0, x1_phase = 0;
	private int x2_amplitude = 0, x2_frequency = 0, x2_phase = 0;
	private String amp = "", fomular = "", fre = "", tplus = "", phase = "";
	
	private CRC crc = new CRC();
	
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
			main.lbl_x1_SineCosine.setText("Cos(2\u03C0");
			x1_sine_flag = false;
		}
		else if (e.getSource() == main.btn_x1_sine){
			main.lbl_x1_SineCosine.setText("Sin(2\u03C0");
			x1_sine_flag = true;
		}
		else if (e.getSource() == main.btn_x2_sine){
			main.lbl_x2_SineCosine.setText("Sin(2\u03C0");
			x2_sine_flag = true;
		}
		else if (e.getSource() == main.btn_x2_Cosine){
			main.lbl_x2_SineCosine.setText("Cos(2\u03C0");
			x2_sine_flag = false;
		}
		else if (e.getSource() == main.btn_x1_gen){
			x1_gen_flag = true;
			x1_gen_clicked = true;
			
			crc.CRC_duration(main.tf_duration_start, main.tf_duration_finish);
			crc.CRC_function_variable(main.tf_x1_amplitude, main.tf_x1_frequency, main.tf_x1_phase);
			
			main.lbl_equal1.setText(") = ");			
			amp = main.tf_x1_amplitude.getText();
			fomular = main.lbl_x1_SineCosine.getText();
			fre = main.tf_x1_frequency.getText();
			phase = main.tf_x1_phase.getText();
			
			if(Integer.parseInt(main.tf_x1_phase.getText()) < 0){
				tplus = "t - ";
				phase = String.valueOf(-Integer.parseInt(main.tf_x1_phase.getText()));
			}
			else{
				tplus = main.lbl_x1_tplus.getText();
			}
			
			main.lbl_X1_result.setText(amp + fomular + fre + tplus + phase + ")");
			
			grid_x_axis_value_maker();
			grid_y_axis_value_maker(main.tf_x1_amplitude);
			
			x1_gen_clicked = false;
		}
		else if (e.getSource() == main.btn_x2_gen){
			x2_gen_flag = true;
			x2_gen_clicked = true;
			
			crc.CRC_duration(main.tf_duration_start, main.tf_duration_finish);
			crc.CRC_function_variable(main.tf_x2_amplitude, main.tf_x2_frequency, main.tf_x2_phase);
			
			main.lbl_equal2.setText(") = ");			
			amp = main.tf_x2_amplitude.getText();
			fomular = main.lbl_x2_SineCosine.getText();
			fre = main.tf_x2_frequency.getText();
			phase = main.tf_x2_phase.getText();
			
			if(Integer.parseInt(main.tf_x2_phase.getText()) < 0){
				tplus = "t - ";
				phase = String.valueOf(-Integer.parseInt(main.tf_x2_phase.getText()));
			}
			else{
				tplus = main.lbl_x2_tplus.getText();
			}
			
			main.lbl_X2_result.setText(amp + fomular + fre + tplus + phase + ")");
			
			grid_x_axis_value_maker();
			grid_y_axis_value_maker(main.tf_x2_amplitude);
			
			x2_gen_clicked = false;
		}
		else if (e.getSource() == main.btn_x3_gen_a){
			main.lbl_x3.setText("X\u2083(t) = X\u2081(t) + X\u2082(t)");
		}
		else if (e.getSource() == main.btn_x3_gen_m){
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
	
	public void grid_x_axis_value_maker(){
		double startValue = Double.parseDouble(main.tf_duration_start.getText()), finishValue = Double.parseDouble(main.tf_duration_finish.getText());
		double interval = 0.0;
		
		startValue = startValue * 1000;
		finishValue = finishValue * 1000;
		interval = (finishValue - startValue)/10;
		
		main.lbl_x_axis_0.setText(String.valueOf((int)startValue));
		main.lbl_x_axis_1.setText(String.valueOf((int)(startValue + interval * 1)));
		main.lbl_x_axis_2.setText(String.valueOf((int)(startValue + interval * 2)));
		main.lbl_x_axis_3.setText(String.valueOf((int)(startValue + interval * 3)));
		main.lbl_x_axis_4.setText(String.valueOf((int)(startValue + interval * 4)));
		main.lbl_x_axis_5.setText(String.valueOf((int)(startValue + interval * 5)));
		main.lbl_x_axis_6.setText(String.valueOf((int)(startValue + interval * 6)));
		main.lbl_x_axis_7.setText(String.valueOf((int)(startValue + interval * 7)));
		main.lbl_x_axis_8.setText(String.valueOf((int)(startValue + interval * 8)));
		main.lbl_x_axis_9.setText(String.valueOf((int)(startValue + interval * 9)));
		main.lbl_x_axis_10.setText(String.valueOf((int)finishValue));		
	}
	
	public void grid_y_axis_value_maker(TF_amplitude amp){
		if(x1_gen_flag && x2_gen_flag){
			if(x1_gen_clicked && (Integer.parseInt(main.tf_x1_amplitude.getText()) > Integer.parseInt(main.tf_x2_amplitude.getText()))){
				main.lbl_y_axis_0.setText(String.valueOf(Integer.parseInt(main.tf_x1_amplitude.getText()) * 3));
				main.lbl_y_axis_1.setText(String.valueOf(Integer.parseInt(main.tf_x1_amplitude.getText()) * 2));
				main.lbl_y_axis_2.setText(String.valueOf(Integer.parseInt(main.tf_x1_amplitude.getText()) * 1));
				main.lbl_y_axis_3.setText("0");
				main.lbl_y_axis_4.setText(String.valueOf(Integer.parseInt(main.tf_x1_amplitude.getText()) * -1));
				main.lbl_y_axis_5.setText(String.valueOf(Integer.parseInt(main.tf_x1_amplitude.getText()) * -2));
				main.lbl_y_axis_6.setText(String.valueOf(Integer.parseInt(main.tf_x1_amplitude.getText()) * -3));
			}
			else if(x2_gen_clicked && (Integer.parseInt(main.tf_x1_amplitude.getText()) < Integer.parseInt(main.tf_x2_amplitude.getText()))){
				main.lbl_y_axis_0.setText(String.valueOf(Integer.parseInt(main.tf_x2_amplitude.getText()) * 3));
				main.lbl_y_axis_1.setText(String.valueOf(Integer.parseInt(main.tf_x2_amplitude.getText()) * 2));
				main.lbl_y_axis_2.setText(String.valueOf(Integer.parseInt(main.tf_x2_amplitude.getText()) * 1));
				main.lbl_y_axis_3.setText("0");
				main.lbl_y_axis_4.setText(String.valueOf(Integer.parseInt(main.tf_x2_amplitude.getText()) * -1));
				main.lbl_y_axis_5.setText(String.valueOf(Integer.parseInt(main.tf_x2_amplitude.getText()) * -2));
				main.lbl_y_axis_6.setText(String.valueOf(Integer.parseInt(main.tf_x2_amplitude.getText()) * -3));
			}
			else{
				main.lbl_y_axis_0.setText(String.valueOf(Integer.parseInt(amp.getText()) * 3));
				main.lbl_y_axis_1.setText(String.valueOf(Integer.parseInt(amp.getText()) * 2));
				main.lbl_y_axis_2.setText(String.valueOf(Integer.parseInt(amp.getText()) * 1));
				main.lbl_y_axis_3.setText("0");
				main.lbl_y_axis_4.setText(String.valueOf(Integer.parseInt(amp.getText()) * -1));
				main.lbl_y_axis_5.setText(String.valueOf(Integer.parseInt(amp.getText()) * -2));
				main.lbl_y_axis_6.setText(String.valueOf(Integer.parseInt(amp.getText()) * -3));
			}
		}
		else{
			main.lbl_y_axis_0.setText(String.valueOf(Integer.parseInt(amp.getText()) * 3));
			main.lbl_y_axis_1.setText(String.valueOf(Integer.parseInt(amp.getText()) * 2));
			main.lbl_y_axis_2.setText(String.valueOf(Integer.parseInt(amp.getText()) * 1));
			main.lbl_y_axis_3.setText("0");
			main.lbl_y_axis_4.setText(String.valueOf(Integer.parseInt(amp.getText()) * -1));
			main.lbl_y_axis_5.setText(String.valueOf(Integer.parseInt(amp.getText()) * -2));
			main.lbl_y_axis_6.setText(String.valueOf(Integer.parseInt(amp.getText()) * -3));
		}
	}
	
}
