/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   pascalTriangle.java                                :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/14 17:47:21 by aberry            #+#    #+#             */
/*   Updated: 2021/03/14 17:47:21 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/***
 * Напишите программу, сохраняющую треугольник Паскаля вплоть до заданной
 * величины п в переменной типа ArrayList<ArrayList<Integer>>.
 */

package ch01.ex15;

import java.util.ArrayList;
import java.util.Scanner;

public class pascalTriangle {

    private static ArrayList<ArrayList<Integer>> createPascalTriangle(int n) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(0, 1);
            for (int j = 1; j < i; j++) {
                newList.add(triangle.get(i - 1).get(j - 1)
                        + triangle.get(i - 1).get(j));
            }
            if (i != 0) {
                newList.add(i, 1);
            }
            triangle.add(newList);
        }
        return (triangle);
    }

    private static void printPascalTriangle(ArrayList<ArrayList<Integer>>
                                                    triangle) {
        for (ArrayList<Integer> list : triangle) {
            for (Integer elemList : list) {
                System.out.print(elemList + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert size triangle: ");
        ArrayList<ArrayList<Integer>> triangle
                = createPascalTriangle(in.nextInt());
        printPascalTriangle(triangle);
    }

}
