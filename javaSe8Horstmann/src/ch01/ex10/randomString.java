/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   randomString.java                                  :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/09 20:53:03 by aberry            #+#    #+#             */
/*   Updated: 2021/03/09 20:53:03 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/**
 * Напишите программу, составляющую произвольную символьную строку из букв и
 * цифр,генерируя произвольное значение типа long и выводя его по основанию 36.
 */
package ch01.ex10;

import java.util.Random;

public class randomString {

    public static void main(String[] args) {
        long randomDigit = new Random().nextLong();
        System.out.println(Long.toString(randomDigit, 36));
    }

}
