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

/**
 * Напишите программу, выводящую наименьшее и наибольшее положительные значения
 * типа double .Подсказка: воспользуйтесь методом Math.nextUp ()
 * из прикладного программного интерфейса Java API.
 */

package ch01.ex04;

import java.lang.Math;

public class doubleMinMax {

    public static void main(String[] args) {
        System.out.println("MIN_VALUE Double = " + Math.nextUp(0.0));
        System.out.println("MAX_VALUE Double = " + Double.MAX_VALUE);
    }

}
