package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Simple Section
        // If
        // Evaluate if number is > 0.
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number"));
        if(number>0){
            System.out.println("The number is > 0");
        }
        System.out.println("Finish program...");
    }
}
