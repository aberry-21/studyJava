/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   lotteryCombination.java                            :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/09 22:38:30 by aberry            #+#    #+#             */
/*   Updated: 2021/03/09 22:38:30 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/**
 * Напишите программу, выбирающую и выводящую лотерейную комбинацию из шести
 * отдельных чисел в пределах от 1 до 49. Чтобы выбрать шесть отдельных чисел,
 * начните со списочного массива, заполняемого числами от 1 до 49.
 * Выберите произвольный индекс и удалите элемент массива.
 * Повторите эти действия шесть раз подряд.
 * Выведите полученный результат в отсортирован­ ном порядке.
 */

package ch01.ex13;

import java.util.ArrayList;
import java.util.Collections;

public class lotteryCombination {

    public static void main(String[] args) {
        ArrayList<Integer> lotteryArray = new ArrayList<>();
        ArrayList<Integer> lotteryWinArray = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            lotteryArray.add(i);
        }
        Collections.shuffle(lotteryArray);
        for (int i = 0; i < 6; i++) {
            lotteryWinArray.add(lotteryArray.get(i));
        }
        Collections.sort(lotteryWinArray);
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + " winner is :"
                    + lotteryWinArray.get(i));
        }
    }

}
