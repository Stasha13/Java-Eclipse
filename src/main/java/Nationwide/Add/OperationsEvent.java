package Nationwide.Add;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationsEvent implements ActionListener{
    TextField T1;
    int FirstNumber;
    String opt;
    public OperationsEvent(TextField A) {
        T1=A;
    }
    public void actionPerformed(ActionEvent e) {
               Button btn=(Button) e.getSource();
        opt=btn.getLabel();
        if (opt.equals("C")){
            T1.setText("");
        }
        else {
                FirstNumber=Integer.parseInt(T1.getText());
                if (opt.equals("=")){
                    
                }
        } 
    }

}
