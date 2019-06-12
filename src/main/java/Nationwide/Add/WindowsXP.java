package Nationwide.Add;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class WindowsXP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame F= new Frame("Calculation");
		TextField T1, T2, T3;
		Label L1, L2, L3;
		Button B1 = new Button("+");
		Button B2 = new Button("-");
		Button B3 = new Button("*");
		Button B4 = new Button("/");
		L1 = new Label ("First number:");
		L2 = new Label ("Second number:");
		L3 = new Label ("Result:");
		T1 = new TextField(10);
		T2 = new TextField(10);
		T3 = new TextField(10);
		FlowLayout FL = new FlowLayout();
		F.setLayout(FL);

	Ehandler E = new Ehandler(T1,T2,T3);
	Shandler S = new Shandler(T1,T2,T3);
	Mhandler M = new Mhandler(T1,T2,T3);
	Dhandler D = new Dhandler(T1,T2,T3);
	B1.addActionListener(E);
	B2.addActionListener(S);
	B3.addActionListener(M);
	B4.addActionListener(D);
	F.add(L1);
	F.add(T1);
	F.add(L2);
	F.add(T2);
	F.add(B1);
	F.add(B2);
	F.add(B3);
	F.add(B4);
	F.add(L3);
	F.add(T3);
	F.setSize(400,400);
	F.setVisible(true);
	}
}
