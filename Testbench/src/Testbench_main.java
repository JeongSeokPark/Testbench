
import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
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
	private TF_duration tf_duration_start;
	private TF_duration tf_duration_finish;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	public JButton btn_x1_sine = new JButton("Sine");
	public JButton btn_x1_Cosine = new JButton("Cosine");
	public JButton btn_x2_sine = new JButton("Sine");
	public JButton btn_x2_Cosine = new JButton("Cosine");
	public JButton btn_x1_gen = new JButton("Gen");
	public JButton btn_x2_gen = new JButton("Gen");
	public JButton btn_x3_gen_a = new JButton("Gen ( + )");
	public JButton btn_x3_gen_m = new JButton("Gen ( * )");
	public JButton btn_reset = new JButton("Reset Graph");
	
	private JLabel lbl_Plot_Duration = new JLabel("\uAD6C\uAC04 \uC124\uC815 : ");
	private JLabel lbl_to = new JLabel("~");
	private JLabel lbl_sec = new JLabel("\uCD08");
	private JLabel lbl_x1 = new JLabel("X\u2081(t) = ");
	public JLabel lbl_x1_SineCosine = new JLabel("Cos(2\u03C0");
	private JLabel lbl_x1_tplus = new JLabel("t +");
	private JLabel lbl_equal1 = new JLabel(") = ");
	public JLabel lbl_X1_result = new JLabel("10000 Cos(2\u03C0200t + 100)");
	private JLabel lbl_x2 = new JLabel("X\u2082(t) = ");
	public JLabel lbl_x2_SineCosine = new JLabel("Cos(2\u03C0");
	private JLabel lbl_x2_tplus = new JLabel("t +");
	private JLabel lbl_equal2 = new JLabel(") = ");
	public JLabel lbl_X2_result = new JLabel("10000 Cos(2\u03C0200t + 100)");
	private JLabel lbl_x3 = new JLabel("X\u2083(t) = X\u2081(t) + X\u2082(t)");
	
	public void init(){
		canvas = new Canvas_class(this);
		this.setSize(800, 700);
		getContentPane().setLayout(null);
		
		lbl_Plot_Duration.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_Plot_Duration.setBounds(50, 460, 75, 20);
		getContentPane().add(lbl_Plot_Duration);
		
		tf_duration_start = new TF_duration();
		tf_duration_start.setBounds(125, 460, 30, 20);
		getContentPane().add(tf_duration_start);
		tf_duration_start.setColumns(10);
		
		lbl_to.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_to.setFont(new Font("����", Font.PLAIN, 15));
		lbl_to.setBounds(155, 460, 15, 20);
		getContentPane().add(lbl_to);
		
		tf_duration_finish = new TF_duration();
		tf_duration_finish.setBounds(170, 460, 30, 20);
		getContentPane().add(tf_duration_finish);
		tf_duration_finish.setColumns(10);
		
		lbl_sec.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_sec.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_sec.setBounds(200, 460, 30, 20);
		getContentPane().add(lbl_sec);
		
		lbl_x1.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_x1.setBounds(50, 490, 50, 20);
		getContentPane().add(lbl_x1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 490, 40, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		lbl_x1_SineCosine.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_x1_SineCosine.setBounds(145, 490, 50, 20);
		getContentPane().add(lbl_x1_SineCosine);
		
		textField_3 = new JTextField();
		textField_3.setBounds(195, 490, 40, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);

		lbl_x1_tplus.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_x1_tplus.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_x1_tplus.setBounds(240, 490, 20, 20);
		getContentPane().add(lbl_x1_tplus);
		
		textField_4 = new JTextField();
		textField_4.setBounds(265, 490, 40, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		lbl_equal1.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_equal1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_equal1.setBounds(305, 490, 30, 20);
		getContentPane().add(lbl_equal1);

		lbl_X1_result.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_X1_result.setBounds(335, 490, 185, 20);
		getContentPane().add(lbl_X1_result);

		lbl_x2.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_x2.setBounds(50, 520, 50, 20);
		getContentPane().add(lbl_x2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(100, 520, 40, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);

		lbl_x2_SineCosine.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_x2_SineCosine.setBounds(145, 520, 50, 20);
		getContentPane().add(lbl_x2_SineCosine);
		
		textField_6 = new JTextField();
		textField_6.setBounds(195, 520, 40, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);

		lbl_x2_tplus.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_x2_tplus.setBounds(240, 520, 20, 20);
		getContentPane().add(lbl_x2_tplus);
		
		textField_7 = new JTextField();
		textField_7.setBounds(265, 520, 40, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);

		lbl_equal2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_equal2.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_equal2.setBounds(305, 520, 30, 20);
		getContentPane().add(lbl_equal2);

		lbl_X2_result.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_X2_result.setBounds(335, 520, 185, 20);
		getContentPane().add(lbl_X2_result);

		lbl_x3.setFont(new Font("�������", Font.PLAIN, 15));
		lbl_x3.setBounds(50, 550, 150, 20);
		getContentPane().add(lbl_x3);
		
		btn_x1_sine.setBounds(520, 490, 65, 20);
		getContentPane().add(btn_x1_sine);
		
		btn_x1_Cosine.setBounds(590, 490, 80, 20);
		getContentPane().add(btn_x1_Cosine);
		
		btn_x2_sine.setBounds(520, 520, 65, 20);
		getContentPane().add(btn_x2_sine);
		
		btn_x2_Cosine.setBounds(590, 520, 80, 20);
		getContentPane().add(btn_x2_Cosine);
		
		btn_x1_gen.setBounds(680, 490, 60, 20);
		getContentPane().add(btn_x1_gen);
		
		btn_x2_gen.setBounds(680, 520, 60, 20);
		getContentPane().add(btn_x2_gen);
		
		btn_x3_gen_a.setBounds(195, 550, 90, 20);
		getContentPane().add(btn_x3_gen_a);
		
		btn_x3_gen_m.setBounds(290, 550, 90, 20);
		getContentPane().add(btn_x3_gen_m);
		
		btn_reset.setBounds(50, 580, 105, 20);
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
		
		getContentPane().add(canvas);
	}
}
