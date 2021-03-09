/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   noEmptySubstring.java                              :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/09 17:49:08 by aberry            #+#    #+#             */
/*   Updated: 2021/03/09 17:49:08 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/**
 * Напишите программу, вводящую символьную строку
 * и выводящую все ее непустые подстроки.
 */

package ch01.ex08;

import java.util.Scanner;

public class noEmptySubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Original string : ");
        String[] arrayString = in.nextLine().split("\\s+");
        for (String str : arrayString){
            System.out.println("Substring : " + str);
        }
    }

}
