/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   averageFunction.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/14 18:22:18 by aberry            #+#    #+#             */
/*   Updated: 2021/03/14 18:22:18 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */
package ch01.ex16;

public class averageFunction {

    public static double average(double sum, double... values) {
        for (double v : values){
            sum += v;
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        System.out.println("Work function 'average' with first parameter" +
                "(original sum)");
        System.out.println("\nTest 0: sum: 0; ...values: 12.2, 12.34, 0");
        System.out.println("Return value = " + average(0, 12.2
                , 12.34, 0));
        System.out.println("\nTest 1: sum: 10; ...values: 12.2, 12.34, 0");
        System.out.println("Return value = " + average(10, 12.2
                , 12.34, 0));
    }

}
