/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   factorialWithBiglnteger.java                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/09 14:41:00 by aberry            #+#    #+#             */
/*   Updated: 2021/03/09 14:41:00 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/**
 * Напишите программу, вычисляющую факториал п!,используя класс Biglnteger.
 * Вычислите факториал числа 1000.
 */

package ch01.ex06;

import java.math.BigInteger;

public class factorialWithBiglnteger {

    public static BigInteger factorialInt(BigInteger finalDigit) {
        return (finalDigit.compareTo(BigInteger.valueOf(2)) == 0)
                ? finalDigit
                : finalDigit.multiply(factorialInt(
                        finalDigit.subtract(BigInteger.valueOf(1))));
    }

    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(1000);
        if (n.compareTo(BigInteger.valueOf(0)) <= 0){
            System.out.println(BigInteger.valueOf(1));
        }else{
            System.out.println(factorialInt(n));
        }
    }

}
