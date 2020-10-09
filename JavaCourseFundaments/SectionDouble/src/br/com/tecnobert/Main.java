package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// Determine if a number is minor or mayor of zero;
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog(null,"Input the number"));
        if(number>0){
            System.out.println("Is mayor of zero");
        }else {
            System.out.println("Is minor of zero");
        }
        System.out.println("Program finish...");
    }
}
