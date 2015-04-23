
public class CRC {
	TF_duration duration_start, duration_finish;
	
	public CRC(){
		
	}
	
	public void CRC_duration(TF_duration duration_start, TF_duration duration_finish){
		if(duration_start.getText().trim().length() == 0){
			duration_start.setText("0.0");
		}
		if(duration_finish.getText().trim().length() == 0){
			duration_finish.setText("0.1");
		}
	}
	
	public void CRC_function_variable(TF_amplitude amp, TF_frequency fre, TF_phase pha){
		if(amp.getText().trim().length() == 0){
			amp.setText("1");
		}
		if(fre.getText().trim().length() == 0){
			fre.setText("1");
		}
		if(pha.getText().trim().length() == 0){
			pha.setText("0");
		}
	}
}
