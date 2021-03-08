/*
Напишите программу, вводящую целочисленное значение и выводящую его в двоичной,восьмеричной и шестнадцатеричной форме.
Организуйте вывод обратного значения в виде шестнадцатеричного числа с плавающей точкой.
 */

import java.util.Scanner;

public class ConverterDigit {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Insert digit: ");
        int digit = in.nextInt();
        System.out.println("Conversion to binary system: " + Integer.toString(digit, 2));
        System.out.println("Conversion to octal system: " + Integer.toString(digit, 8));
        System.out.println("Conversion to hexadecimal system: " + Integer.toString(digit, 16));
        System.out.println("Conversion reverse digit to hexadecimal system: " + Double.toHexString(1.0/digit));
    }
}