package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// Do while
        int number;
        // show a data output  depending on of the number selected;
        do{
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number by 1 to 5"));
            switch (number){
                case 1:
                System.out.println("Is 1 as selected");
                break;
                case 2:
                    System.out.println("Is 2 as selected");
                    break;
                case 3:
                    System.out.println("Is 3 as selected");
                    break;
                case 4:
                    System.out.println("Is 4 as selected");
                    break;
                case 5:
                    System.out.println("Is 5 as selected");
                    System.out.println("Program is finish");
                    break;
                default:
                    System.out.println("Any number selected");
                    break;
            }

        }while (number!=5);
    }
}
