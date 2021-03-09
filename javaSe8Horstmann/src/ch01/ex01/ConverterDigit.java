/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ConverterDigit.java                                :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/08 17:00:34 by aberry            #+#    #+#             */
/*   Updated: 2021/03/08 17:00:34 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/*
Напишите программу, вводящую целочисленное значение и выводящую его в двоичной,
восьмеричной и шестнадцатеричной форме.
Организуйте вывод обратного значения в виде шестнадцатеричного числа
с плавающей точкой.
 */

package ch01.ex01;

import java.util.Scanner;

public class ConverterDigit {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Insert digit: ");
        int digit = in.nextInt();
        System.out.println("Conversion to binary system: "
                + Integer.toString(digit, 2));
        System.out.println("Conversion to octal system: "
                + Integer.toString(digit, 8));
        System.out.println("Conversion to hexadecimal system: "
                + Integer.toString(digit, 16));
        System.out.println("Conversion reverse digit to hexadecimal system: "
                + Double.toHexString(1.0/digit));
    }

}
