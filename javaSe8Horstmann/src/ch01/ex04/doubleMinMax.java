/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   doubleMinMax.java                                  :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/09 13:49:26 by aberry            #+#    #+#             */
/*   Updated: 2021/03/09 13:49:26 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/*
Напишите программу, выводящую наименьшее и наибольшее положитель­ ные значения
типа double.Подсказка: воспользуйтесь методом Math.nextUp ()
из прикладного программного интерфейса Java API.
 */

package ch01.ex04;

import java.lang.Math;

public class doubleMinMax {

    public static void main(String[] args) {
        double digit = 0.0;
        digit = Math.nextUp(digit);
        if (digit == Double.MIN_VALUE) {
            System.out.println("MIN_VALUE Double = " + digit);
        }
        digit = Double.MAX_VALUE - 0.00000000001;
        while (Math.nextUp(digit) != Double.POSITIVE_INFINITY) {
            digit = Math.nextUp(digit);
        }
        if (digit == Double.MAX_VALUE) {
            System.out.println("MAX_VALUE Double = " + digit);
        }
    }

}
