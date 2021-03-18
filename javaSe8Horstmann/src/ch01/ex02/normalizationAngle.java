/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   normalizationAngle.java                            :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/08 16:59:32 by aberry            #+#    #+#             */
/*   Updated: 2021/03/08 16:59:32 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/**
 * Напишите программу, вводящую целочисленное значение угла
 * (как положительное, так и отрицательное) и нормализующую его в пределах[0:360].
 * Попробуйте сделать это сначала с помощью операции %, а затем метода floorMod().
 */

package ch01.ex02;

import java.util.Scanner;
import java.lang.Math;

public class normalizationAngle {

    public static void normalizationAngleFirstVersion(int digit) {
        digit = digit % 360;
        System.out.println("First version angle value: " + ((digit < 0) ? digit + 360 : digit));
    }

    public static void normalizationAngleSecondVersion(int digit) {
        System.out.println("Second version angle value: "
                + Math.floorMod(digit, 360));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert digit: ");
        int digit = in.nextInt();
        normalizationAngleFirstVersion(digit);
        normalizationAngleSecondVersion(digit);
    }

}
