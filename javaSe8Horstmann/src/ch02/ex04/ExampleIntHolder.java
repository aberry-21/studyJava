/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ExampleIntHolder.java                              :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/15 22:20:50 by aberry            #+#    #+#             */
/*   Updated: 2021/03/15 22:20:50 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/***
 * Почему в Java нельзя реализовать метод, меняющий местами содержимое двух
 * переменных типа int?
 *
 * Ответ:
 * В языке Java вообще нельзя написать метод, обновляющий параметры примитив­ного
 * типа, тк аргумент будет скопирован в параметр функции.
 *
 * Вместо этого напишите метод, меняющий местами
 * содержимое двух объектов типа Integer.
 */

package ch02.ex04;

public class ExampleIntHolder {

    public static void swapIntegerValue(Integer firstElem, Integer secondElem) {
        int tmpElem = firstElem;
        firstElem = secondElem;
        secondElem = tmpElem;
    }

    public static void main(String[] args) {
        Integer firstElem = 1;
        Integer secondElem = 2;
        System.out.println(firstElem + " " + secondElem);
        swapIntegerValue(firstElem, secondElem);
        System.out.println(firstElem +  " " + secondElem);
    }

}
/***
 * Как видим результат остался таким же, тк параметры функции являются
 * копией ссылок на объекты.
 */
