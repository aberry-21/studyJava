/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Сalendar.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/15 17:59:20 by aberry            #+#    #+#             */
/*   Updated: 2021/03/15 17:59:20 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/**
 * Измените представленную в этой главе программу вывода календаря таким об­разом,
 * чтобы неделя начиналась с воскресенья. Кроме того, организуйте пере­вод
 * на новую строку в конце предыдущей, но только один раз.
 *
 * Original version:
 *
 * Mon Tue Wed Thu Fri Sat Sun
 * 1   2   3   4   5   6   7
 * 8   9   10  11  12  13  14
 * 15  16  17  18  19  20  21
 * 22  23  24  25  26  27  28
 * 29  30
 *
 * My version:
 *
 * Sun Mon Tue Wed Thu Fri Sat
 *     1   2   3   4   5   6
 * 7   8   9   10  11  12  13
 * 14  15  16  17  18  19  20
 * 21  22  23  24  25  26  27
 * 28  29  30
 *
 */

package ch02.ex01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class NowСalendar {

    private static int[] createMonthArray(LocalDate date){
        int[] arrayMonth = new int[42];
        int index = date.getDayOfWeek().getValue();
        for (int i = 1; i < 32; i++) {
            arrayMonth[index] = i;
            index++;
        }
        return (arrayMonth);
    }

    public static void main(String[] args) {
        System.out.println(
                "╔══╗╔══╗╔╗──╔═══╗╔╗─╔╗╔══╗─╔══╗╔═══╗\n"+
                "║╔═╝║╔╗║║║──║╔══╝║╚═╝║║╔╗╚╗║╔╗║║╔═╗║\n"+
                "║║──║╚╝║║║──║╚══╗║╔╗─║║║╚╗║║╚╝║║╚═╝║\n"+
                "║║──║╔╗║║║──║╔══╝║║╚╗║║║─║║║╔╗║║╔╗╔╝\n"+
                "║╚═╗║║║║║╚═╗║╚══╗║║─║║║╚═╝║║║║║║║║║\n"+
                "╚══╝╚╝╚╝╚══╝╚═══╝╚╝─╚╝╚═══╝╚╝╚╝╚╝╚╝");
        for (int month = 1; month < 13; month++) {
            System.out.println("\n\n\t\t" + Month.of(month).toString() + '\n');
            System.out.print(DayOfWeek.of(7).toString().substring(0, 3) + ' ');
            for (int i = 1; i < 7; i++) {
                System.out.print(DayOfWeek.of(i).toString().substring(0, 3) + ' ');
            }
            System.out.println();
            LocalDate date = LocalDate.of(2021, month, 1);
            int[] arrayMonth = createMonthArray(date);
            int IndexEnd = date.getDayOfWeek().getValue() + 31;
            for (int i = 0; i < IndexEnd; i++) {
                if (arrayMonth[i] == 0){
                    System.out.print(" " + '\t');
                } else {
                    System.out.print(Integer.toString(arrayMonth[i]) + '\t');
                }
                if (i > 0 && (i + 1) % 7 == 0) {
                    System.out.println();
                }
            }
        }
    }

}


