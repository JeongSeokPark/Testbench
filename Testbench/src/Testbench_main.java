
import javax.swing.JApplet;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Testbench_main extends JApplet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Testbench_main() {
		
	}
	
	Canvas_class canvas;
	public TF_duration tf_duration_start;
	public TF_duration tf_duration_finish;
	public TF_amplitude tf_x1_amplitude;
	public TF_amplitude tf_x2_amplitude;
	public TF_frequency tf_x1_frequency;
	public TF_frequency tf_x2_frequency;
	public TF_phase tf_x1_phase;	
	public TF_phase tf_x2_phase;
	
	public JButton btn_x1_sine = new JButton("Sine");
	public JButton btn_x1_Cosine = new JButton("Cosine");
	public JButton btn_x2_sine = new JButton("Sine");
	public JButton btn_x2_Cosine = new JButton("Cosine");
	public JButton btn_x1_gen = new JButton("Gen");
	public JButton btn_x2_gen = new JButton("Gen");
	public JButton btn_x3_gen_a = new JButton("Gen ( + )");
	public JButton btn_x3_gen_m = new JButton("Gen ( * )");
	public JButton btn_reset = new JButton("Reset Graph");
	
	public JLabel lbl_x1_SineCosine = new JLabel("Cos(2\u03C0");
	public JLabel lbl_x2_SineCosine = new JLabel("Cos(2\u03C0");
	public JLabel lbl_x1_tplus = new JLabel("t +");
	public JLabel lbl_x2_tplus = new JLabel("t +");
	public JLabel lbl_equal1 = new JLabel(") = ");
	public JLabel lbl_equal2 = new JLabel(") = ");
	public JLabel lbl_X1_result = new JLabel("10000 Cos(2\u03C0200t + 100)");
	public JLabel lbl_X2_result = new JLabel("10000 Cos(2\u03C0200t + 100)");
	public JLabel lbl_x3 = new JLabel("X\u2083(t) = X\u2081(t) + X\u2082(t)");
	
	public JLabel lbl_x_axis_0;
	public JLabel lbl_x_axis_1;
	public JLabel lbl_x_axis_2;
	public JLabel lbl_x_axis_3;
	public JLabel lbl_x_axis_4;
	public JLabel lbl_x_axis_5;
	public JLabel lbl_x_axis_6;
	public JLabel lbl_x_axis_7;
	public JLabel lbl_x_axis_8;
	public JLabel lbl_x_axis_9;
	public JLabel lbl_x_axis_10;
	
	public JLabel lbl_y_axis_0;
	public JLabel lbl_y_axis_1;
	public JLabel lbl_y_axis_2;
	public JLabel lbl_y_axis_3;
	public JLabel lbl_y_axis_4;
	public JLabel lbl_y_axis_5;
	public JLabel lbl_y_axis_6;
	
	private JLabel lbl_Plot_Duration = new JLabel("\uAD6C\uAC04 \uC124\uC815 : ");
	private JLabel lbl_to = new JLabel("~");
	private JLabel lbl_sec = new JLabel("\uCD08");
	private JLabel lbl_x1 = new JLabel("X\u2081(t) = ");	
	private JLabel lbl_x2 = new JLabel("X\u2082(t) = ");
	
	private int y_modify;
	private PN_grid pn_grid;
	private Image image;	
	
	public void init(){
		canvas = new Canvas_class(this);
		this.setSize(800, 700);
		getContentPane().setLayout(null);
		y_modify = 50;
		
		// You have to determine absolute path which is indicating 'Grid.png' image path to show the Grid image.
		image = Toolkit.getDefaultToolkit().getImage("D:/Dev_Projects/GitHub/Local_Storage/Testbench/Grid.png");
		pn_grid = new PN_grid(image);
		
		lbl_Plot_Duration.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_Plot_Duration.setBounds(50, 460 + y_modify, 75, 20);
		getContentPane().add(lbl_Plot_Duration);
		
		tf_duration_start = new TF_duration();
		tf_duration_start.setBounds(125, 460 + y_modify, 30, 20);
		getContentPane().add(tf_duration_start);
		tf_duration_start.setColumns(10);
		
		lbl_to.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_to.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lbl_to.setBounds(155, 460 + y_modify, 15, 20);
		getContentPane().add(lbl_to);
		
		tf_duration_finish = new TF_duration();
		tf_duration_finish.setBounds(170, 460 + y_modify, 30, 20);
		getContentPane().add(tf_duration_finish);
		tf_duration_finish.setColumns(10);
		
		lbl_sec.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_sec.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_sec.setBounds(200, 460 + y_modify, 30, 20);
		getContentPane().add(lbl_sec);
		
		lbl_x1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_x1.setBounds(50, 490 + y_modify, 50, 20);
		getContentPane().add(lbl_x1);
		
		tf_x1_amplitude = new TF_amplitude();
		tf_x1_amplitude.setBounds(100, 490 + y_modify, 40, 20);
		getContentPane().add(tf_x1_amplitude);
		tf_x1_amplitude.setColumns(10);

		lbl_x1_SineCosine.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_x1_SineCosine.setBounds(145, 490 + y_modify, 50, 20);
		getContentPane().add(lbl_x1_SineCosine);
		
		tf_x1_frequency = new TF_frequency();
		tf_x1_frequency.setBounds(195, 490 + y_modify, 40, 20);
		getContentPane().add(tf_x1_frequency);
		tf_x1_frequency.setColumns(10);

		lbl_x1_tplus.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_x1_tplus.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_x1_tplus.setBounds(240, 490 + y_modify, 20, 20);
		getContentPane().add(lbl_x1_tplus);
		
		tf_x1_phase = new TF_phase();
		tf_x1_phase.setBounds(265, 490 + y_modify, 40, 20);
		getContentPane().add(tf_x1_phase);
		tf_x1_phase.setColumns(10);

		lbl_equal1.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_equal1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_equal1.setBounds(305, 490 + y_modify, 30, 20);
		getContentPane().add(lbl_equal1);

		lbl_X1_result.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_X1_result.setBounds(335, 490 + y_modify, 185, 20);
		getContentPane().add(lbl_X1_result);

		lbl_x2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_x2.setBounds(50, 520 + y_modify, 50, 20);
		getContentPane().add(lbl_x2);
		
		tf_x2_amplitude = new TF_amplitude();
		tf_x2_amplitude.setBounds(100, 520 + y_modify, 40, 20);
		getContentPane().add(tf_x2_amplitude);
		tf_x2_amplitude.setColumns(10);

		lbl_x2_SineCosine.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_x2_SineCosine.setBounds(145, 520 + y_modify, 50, 20);
		getContentPane().add(lbl_x2_SineCosine);
		
		tf_x2_frequency = new TF_frequency();
		tf_x2_frequency.setBounds(195, 520 + y_modify, 40, 20);
		getContentPane().add(tf_x2_frequency);
		tf_x2_frequency.setColumns(10);

		lbl_x2_tplus.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_x2_tplus.setBounds(240, 520 + y_modify, 20, 20);
		getContentPane().add(lbl_x2_tplus);
		
		tf_x2_phase = new TF_phase();
		tf_x2_phase.setBounds(265, 520 + y_modify, 40, 20);
		getContentPane().add(tf_x2_phase);
		tf_x2_phase.setColumns(10);

		lbl_equal2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_equal2.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_equal2.setBounds(305, 520 + y_modify, 30, 20);
		getContentPane().add(lbl_equal2);

		lbl_X2_result.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_X2_result.setBounds(335, 520 + y_modify, 185, 20);
		getContentPane().add(lbl_X2_result);

		lbl_x3.setFont(new Font("³ª´®°íµñ", Font.PLAIN, 15));
		lbl_x3.setBounds(50, 550 + y_modify, 150, 20);
		getContentPane().add(lbl_x3);
		
		btn_x1_sine.setBounds(520, 490 + y_modify, 65, 20);
		getContentPane().add(btn_x1_sine);
		
		btn_x1_Cosine.setBounds(590, 490 + y_modify, 80, 20);
		getContentPane().add(btn_x1_Cosine);
		
		btn_x2_sine.setBounds(520, 520 + y_modify, 65, 20);
		getContentPane().add(btn_x2_sine);
		
		btn_x2_Cosine.setBounds(590, 520 + y_modify, 80, 20);
		getContentPane().add(btn_x2_Cosine);
		
		btn_x1_gen.setBounds(680, 490 + y_modify, 60, 20);
		getContentPane().add(btn_x1_gen);
		
		btn_x2_gen.setBounds(680, 520 + y_modify, 60, 20);
		getContentPane().add(btn_x2_gen);
		
		btn_x3_gen_a.setBounds(195, 550 + y_modify, 90, 20);
		getContentPane().add(btn_x3_gen_a);
		
		btn_x3_gen_m.setBounds(290, 550 + y_modify, 90, 20);
		getContentPane().add(btn_x3_gen_m);
		
		btn_reset.setBounds(50, 580 + y_modify, 105, 20);
		getContentPane().add(btn_reset);
		
		canvas.addMouseListener(canvas);
		btn_x1_Cosine.addMouseListener(canvas);
		btn_x2_Cosine.addMouseListener(canvas);
		btn_x1_sine.addMouseListener(canvas);
		btn_x2_sine.addMouseListener(canvas);
		btn_x1_gen.addMouseListener(canvas);
		btn_x2_gen.addMouseListener(canvas);
		btn_x3_gen_a.addMouseListener(canvas);
		btn_x3_gen_m.addMouseListener(canvas);
		btn_reset.addMouseListener(canvas);
		tf_duration_start.addKeyListener(tf_duration_start);
		tf_duration_finish.addKeyListener(tf_duration_finish);
		tf_x1_amplitude.addKeyListener(tf_x1_amplitude);
		tf_x2_amplitude.addKeyListener(tf_x2_amplitude);
		tf_x1_frequency.addKeyListener(tf_x1_frequency);
		tf_x2_frequency.addKeyListener(tf_x2_frequency);
		tf_x1_phase.addKeyListener(tf_x1_phase);
		tf_x2_phase.addKeyListener(tf_x2_phase);
			
		pn_grid.setBounds(50, 30, 670, 470);
		getContentPane().add(pn_grid);
		pn_grid.setLayout(null);
		
		lbl_x_axis_0 = new JLabel("000");
		lbl_x_axis_1 = new JLabel("111");
		lbl_x_axis_2 = new JLabel("112");
		lbl_x_axis_3 = new JLabel("113");
		lbl_x_axis_4 = new JLabel("114");
		lbl_x_axis_5 = new JLabel("115");
		lbl_x_axis_6 = new JLabel("116");
		lbl_x_axis_7 = new JLabel("117");
		lbl_x_axis_8 = new JLabel("118");
		lbl_x_axis_9 = new JLabel("119");
		lbl_x_axis_10 = new JLabel("110");
		lbl_x_axis_10.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lbl_y_axis_0 = new JLabel("-10000");
		lbl_y_axis_0.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_y_axis_1 = new JLabel("99999");
		lbl_y_axis_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_y_axis_2 = new JLabel("112");
		lbl_y_axis_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_y_axis_3 = new JLabel("113");
		lbl_y_axis_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_y_axis_4 = new JLabel("114");
		lbl_y_axis_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_y_axis_5 = new JLabel("115");
		lbl_y_axis_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_y_axis_6 = new JLabel("116");
		lbl_y_axis_6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		pn_grid.add(lbl_x_axis_0);
		pn_grid.add(lbl_x_axis_1);
		pn_grid.add(lbl_x_axis_2);
		pn_grid.add(lbl_x_axis_3);
		pn_grid.add(lbl_x_axis_4);
		pn_grid.add(lbl_x_axis_5);
		pn_grid.add(lbl_x_axis_6);
		pn_grid.add(lbl_x_axis_7);
		pn_grid.add(lbl_x_axis_8);
		pn_grid.add(lbl_x_axis_9);
		pn_grid.add(lbl_x_axis_10);
		
		pn_grid.add(lbl_y_axis_0);
		pn_grid.add(lbl_y_axis_1);
		pn_grid.add(lbl_y_axis_2);
		pn_grid.add(lbl_y_axis_3);
		pn_grid.add(lbl_y_axis_4);
		pn_grid.add(lbl_y_axis_5);
		pn_grid.add(lbl_y_axis_6);
		
		lbl_x_axis_0.setBounds(70, 430, 30, 20);
		lbl_x_axis_1.setBounds(130, 430, 30, 20);
		lbl_x_axis_2.setBounds(190, 430, 30, 20);
		lbl_x_axis_3.setBounds(250, 430, 30, 20);
		lbl_x_axis_4.setBounds(310, 430, 30, 20);
		lbl_x_axis_5.setBounds(370, 430, 30, 20);
		lbl_x_axis_6.setBounds(430, 430, 30, 20);
		lbl_x_axis_7.setBounds(490, 430, 30, 20);
		lbl_x_axis_8.setBounds(550, 430, 30, 20);
		lbl_x_axis_9.setBounds(610, 430, 30, 20);
		lbl_x_axis_10.setBounds(640, 430, 30, 20);
		
		lbl_y_axis_0.setBounds(25, 0, 40, 20);
		lbl_y_axis_1.setBounds(25, 60, 40, 20);
		lbl_y_axis_2.setBounds(25, 130, 40, 20);
		lbl_y_axis_3.setBounds(25, 200, 40, 20);
		lbl_y_axis_4.setBounds(25, 270, 40, 20);
		lbl_y_axis_5.setBounds(25, 340, 40, 20);
		lbl_y_axis_6.setBounds(25, 400, 40, 20);
		
		getContentPane().add(canvas);
	}
}
