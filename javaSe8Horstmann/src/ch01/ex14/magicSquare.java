/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   magicSquare.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/11 15:59:48 by aberry            #+#    #+#             */
/*   Updated: 2021/03/11 15:59:48 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/**
 * Напишите программу, вводящую двумерный массив целочисленных значений
 * и определяющую, содержится ли в нем магический квадрат
 * (т.е. одинаковая сумма значений во всех строках, столбцах и диагоналях).
 * Принимая строки вводимых данных, разбивайте их на отдельные целочисленные
 * значения, прекратив этот процесс, когда пользователь введет пустую строку.
 *
 * Example: Magic Square has been found! ;)
 * 1 2 3 5 6
 * 2 5 2 3 4
 * 1 3 3 3 4 2 5 8
 * 4 1 4 3 4 2 6 8
 * 5 6 7 8 9 0 8 8
 * 1 2
 * 1 1
 * 1 1
 * 1 1
 *
 * Example: Magic Square has not been found! :(
 * 16 3 2 13
 * 3 10 11 8
 * 9 6 7 12
 * 4 15 14 1
 *
 * Example: Magic Square has been found! ;)
 * 1 2 3 5 6
 * 2 5 2 3 4
 * 1 3 3 3 4 2 5 8
 * 4 1 4 3 4 2 6 8
 * 5 6 7 8 9 0 8 8
 * 1 2 2 5 2 3 3 3
 * 1 1 3 1 3 5 3 33
 * 1 2 4 1 4 33 33 1 1 1
 * 1 1 4 5 6 7 8 33 1 1
 */

package ch01.ex14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class magicSquare {

    private static final ArrayList<Integer> arrayLengthLine = new ArrayList<>();

//****************************************************************************\\
//**************************Initialization array******************************\\
//****************************************************************************\\
    private static ArrayList<String> initializationArrayInput(){
        Scanner input = new Scanner(System.in);
        ArrayList<String> arrayInput = new ArrayList<>();
        for (;;) {
            String newLine = input.nextLine();
            if ("".equals(newLine)) {
                break;
            }
            arrayInput.add(newLine.trim());
        }
        return (arrayInput);
    }

    private static void checkStringIsDigit(String lineArray){
        if (!lineArray.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println("Error: Elements of the array must be digits.");
            exit(1);
        }
    }

    private static int getLengthArray(ArrayList<String> array){
        int length = -1;
        for (String elem : array) {
            int lengthLine = elem.split("\\s+").length;
            arrayLengthLine.add(lengthLine);
            if (length < lengthLine) {
                length = lengthLine;
            }
        }
        return (length);
    }

    private static int[][] initializationArrayInt(ArrayList<String>
                                                                    array){
        int[][] arrayToInt = new int[array.size()][getLengthArray(array)];
        for (int i = 0; i < array.size(); i++) {
            String[] lineArray = array.get(i).split("\\s+");
            for (int j = 0; j < lineArray.length; j++) {
                checkStringIsDigit(lineArray[j]);
                arrayToInt[i][j] = Integer.parseInt(lineArray[j]);
            }
        }
        return (arrayToInt);
    }

//****************************************************************************\\
//************************Find Magic Square in array**************************\\
//****************************************************************************\\

    private static boolean checkWidthArray(int[][] arrayMagicSquare){
        int originalSize = Arrays.stream(arrayMagicSquare[0]).sum();
        for (int[] line : arrayMagicSquare) {
            int heightSize = 0;
            for (int j = 0; j < arrayMagicSquare.length; j++) {
                heightSize += line[j];
            }
            if(originalSize != heightSize){
                return (false);
            }
        }
        return (true);
    }

    private static boolean checkHeightArray(int[][] arrayMagicSquare){
        int originalSize = Arrays.stream(arrayMagicSquare[0]).sum();
        for (int j = 0; j < arrayMagicSquare.length; j++) {
            int heightSize = 0;
            for (int[] column : arrayMagicSquare) {
                heightSize += column[j];
            }
            if(originalSize != heightSize){
                return (false);
            }
        }
        return (true);
    }

    private static boolean checkDiagonalArray(int[][] arrayMagicSquare){
        int originalSize = Arrays.stream(arrayMagicSquare[0]).sum();
        int mainDiagonal = 0;
        int collateralDiagonal = 0;
        for (int i = 0; i < arrayMagicSquare.length; i++) {
            mainDiagonal += arrayMagicSquare[i][i];
            collateralDiagonal += arrayMagicSquare[i][arrayMagicSquare.length
                                                                        - i - 1];
        }
        return(originalSize == mainDiagonal
                && originalSize == collateralDiagonal);
    }

    private static boolean checkSubArrayMagicSquare(int[][] arrayMagicSquare) {
        return(
                checkHeightArray(arrayMagicSquare)
                && checkWidthArray(arrayMagicSquare)
                && checkDiagonalArray(arrayMagicSquare));
    }

//****************************************************************************\\
//*****************************Find Magic Square******************************\\
//****************************************************************************\\
    private static int[][] createSubArrayMagicSquare(int step,
                                                     int[][] arrayMagicSquare,
                                                     int i,
                                                     int j) {
        int[][] subArray = new int[step][step];
        int endWight = j + step;
        int endHeight = i + step;
        for (int x = 0; i < endHeight; x++, i++) {
            int y = 0;
            for (; j < endWight; y++, j++) {
                if (i >= arrayMagicSquare.length || j >= arrayLengthLine.get(i)){
                    return (null);
                }
                subArray[x][y] = arrayMagicSquare[i][j];
            }
            j -= y;
        }
        return (subArray);
    }

    private static void printFindArray(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static boolean findArrayMagicSquare(int step,
                                                int[][] arrayMagicSquare) {
        if (step > arrayMagicSquare.length) {
            System.out.println("Magic Square has not been found! :(");
            return (false);
        }
        for (int i = 0; i < arrayMagicSquare.length - 1; i++) {
            for (int j = 0; j < arrayLengthLine.get(i) - 1; j++) {
                int[][] subArray = createSubArrayMagicSquare(step,
                                                        arrayMagicSquare, i, j);
                if (subArray != null && checkSubArrayMagicSquare(subArray)){
                    System.out.println("Magic Square has been found! ;)"
                            + "\nIndex: " + i + ";" + j
                            + "\nArray:");
                    printFindArray(subArray);
                    return (true);
                }
            }
        }
        return(findArrayMagicSquare(step + 1, arrayMagicSquare));
    }

    public static void main(String[] args) {
        ArrayList<String> arrayInput = initializationArrayInput();
        if (arrayInput.isEmpty()) {
           System.out.println("Magic Square has not been found! :(");
           exit(0);
        }
        int[][] arrayMagicSquare = initializationArrayInt(arrayInput);
        findArrayMagicSquare(2, arrayMagicSquare);
    }

}
