package by.company.molochko.triangle_point.runner;

import by.company.molochko.triangle_point.entity.Point;
import by.company.molochko.triangle_point.service.PointService;

public class Runner {
    public static void main(String[] args) {
        PointService pointService = new PointService();
//        TriangleService triangleService = new TriangleService();
//        double result = triangleService.calculatePerimeter(5.7, 8.9, 9.1);
//        System.out.println(result);
//
//        double result2 = triangleService.calculateSquare(5.5, 12);
//        System.out.println(result2);
//
//        boolean result3 = false;
//        try {
//            result3 = triangleService.isRectangular(60, 90, 30);
//            System.out.println(result3);
//        } catch (IncorrectAnglesSumException e) {
//            System.out.println("Sum should be 180");;
//        }
//
//        boolean result4 = triangleService.isIsosceles(12, 12, 25);
//        System.out.println(result4);
//
//        boolean result5 = triangleService.isEquilateral(12, 12, 12);
//        System.out.println(result5);
//
//        try {
//            boolean result6 = triangleService.isAcuteAngled(60, 60, 60);
//        } catch (IncorrectAnglesSumException e) {
//            System.out.println("Sum should be 180");
//        }
//
//        boolean result7 = false;
//        try {
//            result7 = triangleService.isObtuse(100, 40, 40);
//        } catch (IncorrectAnglesSumException e) {
//            System.out.println("Sum should be 180");
//        }
//        System.out.println(result7);

        Point point = new Point("a", 1, 1);
        Point point1 = new Point("b", 2, 2);
        Point point2 = new Point("c", 3, 1);
        boolean result8 = pointService.isLine(point, point1, point2);
        System.out.println(result8);
    }
}
