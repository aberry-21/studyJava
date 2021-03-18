/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ClassPoint.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: aberry <aberry@student.42.fr>              +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/03/15 23:19:03 by aberry            #+#    #+#             */
/*   Updated: 2021/03/15 23:19:03 by aberry           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

/***
 * Реализуйте неизменяемый класс Point, описывающий̆ точку на плоскости.
 * Предоставьте его конструктор, чтобы задать конкретную точку;
 * конструктор без аргументов, чтобы задать точку в начале координат;
 * а также методы getX(), getY(), translate() и scale().
 * В частности, метод translate() должен перемещать точку на определенное
 * расстояние в направлении координат х и у,
 * а метод scale() — изменять масштаб по обеим координатам на заданный коэф­фициент.
 * Реализуйте эти методы таким образом, чтобы они возвращали новые точки
 * в качестве результата.
 * Например, в следующей строке кода:
 *
 * Point р = new Point(3, 4).translate(1, 3).scale(0.5);
 * в переменной р должна быть установлена точка с координатами (2, 3,5).
 *
 */

package ch02.ex05;

/**
 * Объект класса Point представляет точку с координатами x, y.
 * @author Aaron Berry
 * @version 1.0
 */
class Point{

    /* *
     * Координата по оси x.
     */
    private final double x;

    /* *
     * Координата по оси y.
     */
    private final double y;

    /**
     * Конструктор - создание нового объекта с значениями по умолчанию.
     * @see Point#Point()
     */
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
        System.out.println("Create object with coordinates: x:"
                + this.getX() + " y:" + this.getY());
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями.
     * @param x - Координата по оси x.
     * @param y - Координата по оси y.
     * @see Point#Point()
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Create object with coordinates: x:"
                + this.getX() + " y:" + this.getY());
    }

    /**
     * Перемещает точку на определенное расстояние в направлении координат х и у.
     * @рaram Значение на сколько требуется переместить точку.
     * @return Объект класса Point с новыми координатами.
     */
    public Point translate(double x, double y){
        return (new Point(this.x + x, this.y + y));
    }

    /**
     * Изменяет масштаб по обеим координатам на заданный коэф­фициент.
     * @рaram Масштабирующий коэффициент.
     * @return Объект класса Point с новыми координатами.
     */
    public Point scale(double scaleValue){
        return (new Point(this.x * scaleValue, this.y * scaleValue));
    }

    /**
     * Возвращает значение поля х объекта.
     * @return значение поля х типа double.
     */
    public double getX(){
        return (this.x);
    }

    /**
     * Возвращает значение поля у объекта.
     * @return значение поля у типа double.
     */
    public double getY(){
        return (this.y);
    }

}

public class ClassPoint {

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("Coordinates: x:" + p.getX() + " y:" + p.getY());
    }

}

