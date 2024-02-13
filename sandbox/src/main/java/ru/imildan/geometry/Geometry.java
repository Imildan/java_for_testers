package ru.imildan.geometry;

import ru.imildan.geometry.figures.Rectangle;
import ru.imildan.geometry.figures.Square;
import ru.imildan.geometry.figures.Triangle;


public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(5.0));
        Square.printSquareArea(new Square(3.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

        Triangle triangleOne = new Triangle(2.0, 4.0, 5.0);
        Triangle triangleTwo = new Triangle(23.3, 23.5, 23.2);

        System.out.println(triangleOne);
        System.out.println(triangleTwo);
        System.out.println(triangleOne.squareOfTriangle() + " Квадрат первого треугольника ");
        System.out.println(triangleTwo.squareOfTriangle() + " Квадрат второго треугольника ");

    }

}

