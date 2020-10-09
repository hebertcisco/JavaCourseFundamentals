package br.com.tecnobert;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	int number1, number2, totalIntegerSum, totalIntegerRest, totalIntegerMultiplication,totalIntegerDivision;
	double num1, num2, totalDoubleSum, totalDoubleRest, totalDoubleMultiplication,totalDoubleDivision;

	// Integer
	number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the data 1 value"));
	number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the data 2 value"));

	    totalIntegerSum = number1+number2;
        totalIntegerRest = number1-number2;
        totalIntegerMultiplication = number1*number2;
        totalIntegerDivision = number1/number2;

        System.out.println("The sum is: "+totalIntegerSum);
        System.out.println("The rest is: "+totalIntegerRest);
        System.out.println("The multiplication is: "+totalIntegerMultiplication);
        System.out.println("The division is: "+totalIntegerDivision);

        // Double
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the data 1 value"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the data 2 value"));

        totalDoubleSum = num1+num2;
        totalDoubleRest = num1-num2;
        totalDoubleMultiplication = num1*num2;
        totalDoubleDivision = num1/num2;

        System.out.println("The sum is: "+totalDoubleSum);
        System.out.println("The rest is: "+totalDoubleRest);
        System.out.println("The multiplication is: "+totalDoubleMultiplication);
        System.out.println("The division is: "+totalDoubleDivision);
    }
}
