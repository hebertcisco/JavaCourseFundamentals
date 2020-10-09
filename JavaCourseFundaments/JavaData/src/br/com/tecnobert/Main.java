package br.com.tecnobert;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int intNumber;
        String stringChars;

        intNumber = 10;
        stringChars = "Hello World";

        //
        System.out.println("The intenger number is: ");
        System.out.println(intNumber);
        System.out.println("The string say: ");
        System.out.println(stringChars);
        //

        intNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input an integer number value"));
        stringChars = JOptionPane.showInputDialog(null, "Input a string");

        System.out.println("The intenger number is: ");
        System.out.println(intNumber);
        System.out.println("The string say: ");
        System.out.println(stringChars);
    }
}
