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
 * Повторите предыдущее упражнение, но на этот раз сделайте методы translate ()
 * и scale () модифицирующими.
 */

package ch02.ex06;

/**
 * Объект класса Point представляет точку с координатами x, y.
 * @author Aaron Berry
 * @version 1.0
 */
class Point{

    /* *
     * Координата по оси x.
     */
    public double x;

    /* *
     * Координата по оси y.
     */
    public double y;

    /**
     * Конструктор - создание нового объекта с значениями по умолчанию.
     * @see Point#Point()
     */
    public Point() {
        new Point(0.0, 0.0);
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
     */
    public void translate(double x, double y){
        this.x += x;
        this.y += y;
    }

    /**
     * Изменяет масштаб по обеим координатам на заданный коэф­фициент.
     * @рaram Масштабирующий коэффициент.
     */
    public void scale(double scaleValue){
        this.x *= scaleValue;
        this.y *= scaleValue;
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

public class ClassPointPublic {

    public static void main(String[] args) {
        Point p = new Point(3, 4);
        p.translate(1, 3);
        p.scale(0.5);
        System.out.println("Coordinates: x:" + p.getX() + " y:" + p.getY());
    }

}

