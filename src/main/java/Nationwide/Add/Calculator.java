package Nationwide.Add;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Calculator {
	public static void main (String args[]) {
		Frame F= new Frame("Calculator");
		Panel P1 = new Panel();
		Panel P2 = new Panel();
		GridLayout G = new GridLayout(4,4);
		P2.setLayout(G);
		
		TextField T = new TextField(50);
		EventHandler EH = new EventHandler(T);
		OperationsEvent OE=new OperationsEvent(T);
		
		Button B0,B1,B2,B3,B4,B5,B6,B7,B8,B9;
		Button Btn_add, Btn_sub, Btn_mul, Btn_div;
		Button Btn_equals, Btn_clear;
	
		B1 = new Button("1");
		B2 = new Button("2");
		B3 = new Button("3");
		Btn_add = new Button("+");
		B4 = new Button("4");
		B5 = new Button("5");
		B6 = new Button("6");
		Btn_sub = new Button("-");
		B7 = new Button("7");
		B8 = new Button("8");
		B9 = new Button("9");
		Btn_mul = new Button("*");
		Btn_clear = new Button("C");
		B0 = new Button("0");
		Btn_equals = new Button("=");
		Btn_div = new Button("/");
		
		B1.addActionListener(EH);
		B2.addActionListener(EH);
		B3.addActionListener(EH);
		B4.addActionListener(EH);
		B5.addActionListener(EH);
		B6.addActionListener(EH);
		B7.addActionListener(EH);
		B8.addActionListener(EH);
		B9.addActionListener(EH);
		B0.addActionListener(EH);
		
		Btn_add.addActionListener(OE);
		Btn_sub.addActionListener(OE);
		Btn_mul.addActionListener(OE);
		Btn_div.addActionListener(OE);
		Btn_clear.addActionListener(OE);	
		Btn_equals.addActionListener(OE);
		
		
		P1.add(T);
		P2.add(B1);
		P2.add(B2);
		P2.add(B3);
		P2.add(Btn_add);
		P2.add(B4);
		P2.add(B5);
		P2.add(B6);
		P2.add(Btn_sub);
		P2.add(B7);
		P2.add(B8);
		P2.add(B9);
		P2.add(Btn_mul);
		P2.add(Btn_clear);
		P2.add(B0);
		P2.add(Btn_equals);
		P2.add(Btn_div);
		
		F.add(P1,BorderLayout.NORTH);
		F.add(P2,BorderLayout.CENTER);
		
		F.setSize(700,400);
		F.setVisible(true);
	}
}
