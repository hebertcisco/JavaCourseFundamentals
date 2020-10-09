package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// Table of multiplication by 1 to 10
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number"));
        switch (num){
            case 1:
                for (int i = 0;i <= 10; i++){
                    System.out.println("The result is: "+(i*num));
                }
                break;
            case 2:
                for (int i = 0;i <= 10; i++){
                    System.out.println("The result is: "+(i+num));
                }
                break;
            case 3:
                for (int i = 0;i <= 10; i++){
                    System.out.println("The result is: "+(i*num));
                }
                break;
            case 4:
                for (int i = 0;i <= 10; i++){
                    System.out.println("The result is: "+(i+num));
                }
                break;
            case 5:
                for (int i = 0;i <= 10; i++){
                    System.out.println("The result is: "+(i+num));
                }
                break;
            case 6:
                for (int i = 0;i <= 10; i++){
                    System.out.println("The result is: "+(i*num));
                }
                break;
            case 7:
                for (int i = 0;i <= 10; i++){
                    System.out.println("The result is: "+(i*num));
                }
                break;
            case 8:
                for (int i = 0;i <= 10; i++){
                    System.out.println("The result is: "+(i+num));
                }
                break;
            case 9:
                for (int i = 0;i <= 10; i++){
                    System.out.println("The result is: "+(i*num));
                }
                break;
            case 10:
                for (int i = 0;i <= 10; i++){
                    System.out.println("The result is: "+(i*num));
                }
                break;
            default:
                System.out.println("Any number selected");
                break;
        }
        while (num!=11);
    }
}
