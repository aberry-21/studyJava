/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ClassСаг.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/16 01:15:52 by aberry            #+#    #+#             */
/*   Updated: 2021/03/16 01:15:52 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/***
 * Реализуйте класс Саr, моделирующий передвижение автомобиля на бензино­вом
 * топливе по оси х.
 * Предоставьте методы для передвижения автомобиля на заданное количество
 * километров, заполнения топливного бака заданным количеством литров бензина,
 * вычисления расстояния, пройденного от начала координат,
 * а также уровня топлива в баке.
 * Укажите расход топлива (в км/л) в качестве параметра конструктора данного
 * класса.
 * Должен ли этот класс быть неизменяемым и почему?
 *
 * Ответ:
 * Определенные поля можно изменять, только через методы объекта,
 * поэтому поля класса являются приватными.
 *
 */

package ch02.ex07;

/**
 * Объект класса Car представляет объект машины, моделирующий передвижение
 * автомобиля на бензиновом топливе по оси х.
 * @author Aaron Berry
 * @version 1.0
 */
final class Car{

    /* *
     * Максимальный объем бака.
     */
    private final double MAXVALUETANK = 60.0;

    /* *
     * Пройденная дистанция.
     */
    private double distance;

    /* *
     * Остаток топлива в баке.
     */
    private double fuelTank;

    /* *
     * Расход автомобиля на 100км .
     */
    private final double fuelСonsumption;

    /**
     * Конструктор - создание нового объекта с определенными значениями.
     * @param fuelСonsumption - Расход машины.
     */
    public Car(double fuelСonsumption){
        this.distance = 0.0;
        this.fuelTank = 0.0;
        this.fuelСonsumption = fuelСonsumption;
        System.out.println("The car create!");
        System.out.println("Maximum value tank: " + MAXVALUETANK);
        System.out.println("Fuel consumption: " + fuelСonsumption);
    }

    /**
     * Возвращает пройденное расстояние с момента создания автомобиля.
     * @return значение поля distance типа double.
     */
    public double getDistance() {
        return (this.distance);
    }

    /**
     * Возвращает остаток топлива.
     * @return значение поля fuelTank типа double.
     */
    public double remainderFuelTank() {
        return (this.fuelTank);
    }

    /**
     * Передвижения автомобиля на заданное количество километров.
     * @рaram Количество километров.
     */
    public void drive(double kilometrs) {
        if (this.fuelTank == 0.0) {
            System.out.println("Refuel the car!");
            return ;
        }
        double maxDist = this.fuelTank / this.fuelСonsumption * 100;
        if (kilometrs > maxDist) {
            kilometrs = maxDist;
        }
        System.out.println("The car drove " + kilometrs + " kilometers.");
        this.fuelTank -= kilometrs * this.fuelСonsumption / 100;
        this.distance += kilometrs;
    }

    /**
     * Заполнения топливного бака заданным количеством литров бензина.
     * @рaram Количество литров.
     */
    public void fillUp(double litrs) {
        double maxLitrs = this.MAXVALUETANK - litrs;
        if (litrs > maxLitrs) {
            litrs = maxLitrs;
        }
        this.fuelTank += litrs;
        System.out.println("The car was filled with " + litrs + " liters.");
    }

}

public class ClassСаг {

    public static void main(String[] args) {
        Car kiaCeed = new Car(9.5);
        kiaCeed.fillUp(50);
        kiaCeed.drive(12);
        System.out.println("Remainder fuel: " + kiaCeed.remainderFuelTank());
        kiaCeed.drive(532);
        System.out.println("Distance traveled: " + kiaCeed.getDistance());
    }

}
