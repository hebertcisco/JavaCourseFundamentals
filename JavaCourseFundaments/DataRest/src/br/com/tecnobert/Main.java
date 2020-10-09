package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Rest to integer data
        int num1, num2, total;
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number one to made the rest"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number two to made the rest"));
        total = num1-num2;
        System.out.println("The integer rest data is: "+total);

        // Rest to double data
        double x,y,rest;
        x = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the number one to made the rest"));
        y = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the number two to made the rest"));
        rest = x-y;
        System.out.println("The integer rest data is: "+rest);
    }
}
