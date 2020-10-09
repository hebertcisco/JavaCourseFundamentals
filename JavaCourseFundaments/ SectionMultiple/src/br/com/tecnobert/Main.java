package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// Determine if the number is major or minor to zero
        // Neutral = 0;
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number"));
        if(number==0) {
            System.out.println("The number is equal to zero");

        }else if(number>0){
            System.out.println("The number is mayor to zero");
        }else {
            System.out.println("The number is minor to zero");
        }
        System.out.println("Program is finish...");
    }
}
