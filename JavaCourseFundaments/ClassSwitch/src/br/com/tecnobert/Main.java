package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int number;
        number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number"));
        switch (number){
            case 1:
                System.out.println("Number 1 is selected.");
                break;
            case 2:
                System.out.println("Number 2 is selected.");
                break;
            case 3:
                System.out.println("Number 3 is selected.");
                break;
            default:
                System.out.println("Any number selected");
        }
    }
}
