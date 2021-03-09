/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   findMaxValue.java                                  :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/08 16:51:46 by aberry            #+#    #+#             */
/*   Updated: 2021/03/08 16:51:46 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/**
 * Напишите программу, вводящую три целочисленных значения и выводящую самое
 * большое из них, используя только условную операцию.
 * Сделайте то же самое с помощью метода Math.шах ().
 */

package ch01.ex03;

import java.util.Scanner;

public class findMaxValue {

    public static int findMaxValueFirstVersion(int[] numbers) {
        if (numbers[0] > numbers[1]) {
            return (numbers[0] > numbers[2] ? numbers[0] : numbers[2]);
        }
        return (numbers[1] > numbers[2] ? numbers[1] : numbers[2]);
    }

    public static int findMaxValueSecondVersion(int[] numbers) {
        return (Math.max(Math.max(numbers[0],numbers[1]),numbers[2]));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i = 0; i < 3; ++i) {
            System.out.print("Insert " + (i + 1) + " value and press enter: ");
            numbers[i] = in.nextInt();
        }
        System.out.println("Max value in the first version:"
                + findMaxValueFirstVersion(numbers));
        System.out.println("Max value in the second version:"
                + findMaxValueSecondVersion(numbers));
    }

}
