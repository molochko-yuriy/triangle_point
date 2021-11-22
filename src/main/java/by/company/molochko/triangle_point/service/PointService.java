package by.company.molochko.triangle_point.service;

import by.company.molochko.triangle_point.entity.Point;

public class PointService {
    public boolean isLine(Point a, Point b, Point c) {
//        if (((b.getX() - a.getX()) * (c.getY() - a.getY()) - c.getX() - a.getX()) * (b.getY() - a.getY()) == 0) {
//            System.out.println("точки образуют прямую");
//            return true;
//        }
        if ((c.getX() - a.getX()) / (b.getX() - a.getX()) == (c.getY() - a.getY()) / (b.getY() - a.getY())) {
            System.out.println("точки образуют прямую");
            return true;
        }
        System.out.println("точки образуют треугольник");
        return false;
    }
}
