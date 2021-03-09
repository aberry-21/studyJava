/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   compareString.java                                 :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/09 18:48:52 by aberry            #+#    #+#             */
/*   Updated: 2021/03/09 18:48:52 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/*
В разделе 1.5.3 был приведен пример сравнения двух символьных строк s и t
при вызове метода s.equals(t),но не с помощью операции s != t.
Придумайте другой пример, в котором не применяется метод substring ().
 */

package ch01.ex09;

public class compareString {

    public static void main(String[] args) {
/*                                First Version                               */
        String originalString = "Hello World";
        String subString = originalString.split(" ")[1];
        if (subString == "World") {
            System.out.println("Fail!");
        }
/*                                Second Version                              */
        originalString = "     World       ";
        subString = originalString.trim();
        if (subString == "World") {
            System.out.println("Fail!");
        }

        System.out.println("Success!");
    }

}
