package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Integer division
	int num1,num2, total;
	num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the first integer num"));
	num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the second integer num"));
    total = num1/num2;
    System.out.println("The integer division result is: " + total);
	// Double division
        double x,y, division;
        x = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the first double num"));
        y = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the second double num"));
        division = num1/num2;
    }
}
