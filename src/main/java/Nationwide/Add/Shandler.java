package Nationwide.Add;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Shandler implements ActionListener{
	
	TextField No1,No2,Result;

	public Shandler (TextField A, TextField B, 
	TextField C){
	No1=A;
	No2=B;
	Result=C;
}

	public void actionPerformed(ActionEvent x){
		int A,B,C;
		A = Integer.parseInt(No1.getText());
		B = Integer.parseInt(No2.getText());
		C=A-B;
		Result.setText(Integer.toString(C));
	}
}
