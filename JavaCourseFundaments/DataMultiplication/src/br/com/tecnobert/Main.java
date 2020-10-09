package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

	// Multiplication of integer data
        int num1, num2, total;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number one"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number two"));
        total = num1 * num2;
        System.out.println("The integer multiplication is: " + total);
        // Multiplication of integer data
        double x, y, multiplication;
        x = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the number one"));
        y = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the number two"));
        multiplication = x * y;
        System.out.println("The double multiplication is: " + multiplication);
    }
}
