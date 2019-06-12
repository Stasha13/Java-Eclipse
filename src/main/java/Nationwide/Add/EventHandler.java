package Nationwide.Add;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener{
	TextField result;
	public EventHandler(TextField T) {
		result=T;
	}
	public void actionPerformed (ActionEvent e) {
		Button btn = (Button) e.getSource();
		result.setText (result.getText()+btn.getLabel());
	
	}
}
