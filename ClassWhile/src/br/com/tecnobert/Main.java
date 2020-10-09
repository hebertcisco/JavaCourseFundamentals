package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// While
        // Loop cycle
        int num = 1;
        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number to counter: "));
        while (num<=number){
            System.out.println("The counter have the number: " + num);
            num++;


        }
    }
}
