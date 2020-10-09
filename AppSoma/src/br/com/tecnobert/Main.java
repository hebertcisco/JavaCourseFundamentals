package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

	    // Integer sum
        int a,b,sum;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Input the A value"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Input the B value"));
        sum = a+b;
        System.out.println("The sum is: "+sum);

        // Floats sum
        double x,y,total;
        x = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the X value: "));
        y = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the Y value: "));
        total = x+y;
        System.out.println("The sum of the variables is: "+total);

    }
}
