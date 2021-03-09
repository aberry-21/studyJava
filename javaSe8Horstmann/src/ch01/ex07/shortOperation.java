/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   shortOperation.java                                :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/09 15:17:54 by aberry            #+#    #+#             */
/*   Updated: 2021/03/09 15:17:54 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/*
Напишите программу, вводящую два числа в пределах от 0 до 65535, сохраняющую их
в переменных типа short и вычисляющую их сумму, разность, про­ изведение,
частное и остаток без знака, не преобразуя эти величины в тип int.
 */

package ch01.ex07;

public class shortOperation {

    public static int printResultOperation(int originDigitFirst,
                                            int originDigitSecond) {
        short shortDigitFirst = (short) (-32768 + originDigitFirst);
        short shortDigitSecond = (short) (-32768 + originDigitSecond);
        int returnValue = -1;
/*                                print addition                              */
        if (shortDigitFirst + shortDigitSecond + 65536
                != originDigitFirst + originDigitSecond){
            System.out.println("\uD83D\uDCDB" +
                    "Fail in Addition\uD83D\uDCDB\n"
                    +"My output:" + (shortDigitFirst
                    + shortDigitSecond + 65536) + "\n"
                    +"Java output:" + (originDigitFirst + originDigitSecond));
        }
/*                                print multiplication                        */
        else if (shortDigitFirst - shortDigitSecond
                != originDigitFirst - originDigitSecond){
            System.out.println("\uD83D\uDCDB" +
                    "Fail in Multiplication\uD83D\uDCDB\n"
                    +"My output:" + (shortDigitFirst
                    - shortDigitSecond) + "\n"
                    +"Java output:" + (originDigitFirst - originDigitSecond));
        }
/*                                print product                               */
        else if (((shortDigitFirst + 32768) * (shortDigitSecond + 32768))
                != originDigitFirst * originDigitSecond){
            System.out.println("\uD83D\uDCDBFail in Product\uD83D\uDCDB\n"
                    +"My output:" + (shortDigitFirst + 32768)
                    * (shortDigitSecond + 32768) + "\n"
                    +"Java output:" + originDigitFirst * originDigitSecond);
        }
/*                                print division                              */
        else if (originDigitSecond != 0
                && (shortDigitFirst + 32768) / (shortDigitSecond + 32768)
                != originDigitFirst / originDigitSecond){
            System.out.println("\uD83D\uDCDBFail in Division\uD83D\uDCDB\n"
                    +"My output:" + (shortDigitFirst + 32768)
                    / (shortDigitSecond + 32768) + "\n"
                    +"Java output:" + originDigitFirst / originDigitSecond);
        }
/*                                print remainder                             */
        else if (originDigitSecond != 0
                && (shortDigitFirst + 32768) % (shortDigitSecond + 32768)
                != originDigitFirst % originDigitSecond){
            System.out.println("\uD83D\uDCDBFail in Remainder\uD83D\uDCDB\n"
                    +"My output:" + (shortDigitFirst + 32768)
                    % (shortDigitSecond + 32768) + "\n"
                    +"Java output:" + originDigitFirst % originDigitSecond);
        } else {
            System.out.println("✅Test success✅");
            returnValue = 0;
        }
        System.out.println("");
        return (returnValue);
    }

    public static void testAlgorithm() {
        for (int i = 0, j = 0 ; i < 65535 || j <= 65535 ; ) {
            System.out.println("First digit: " + i);
            System.out.println("Second digit: " + j);
            System.out.println("Test number: " + (i + j));
            if (printResultOperation(i, j) == -1) {
                break;
            }
            if (i > 65534) {
                j++;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        testAlgorithm();
    }

}
