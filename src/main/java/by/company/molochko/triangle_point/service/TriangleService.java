package by.company.molochko.triangle_point.service;

import by.company.molochko.triangle_point.exception.IncorrectAnglesSumException;

public class TriangleService {
    private static final double CONSTANT_VALUE = 0.5;

    public double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public double calculateSquare(double height, double base) {
        return CONSTANT_VALUE * height * base;
    }

    public boolean isRectangular(int firstCorner, int secondCorner, int thirdCorner) throws IncorrectAnglesSumException {
        if (firstCorner + secondCorner + thirdCorner != 180) {
            throw new IncorrectAnglesSumException("Sum should be 180");
        }
        if (firstCorner == 90 || secondCorner == 90 || thirdCorner == 90) {
            System.out.println("треугольник прямоугольный");
            return true;
        }
        return false;
    }

    public boolean isIsosceles(int firsSide, int secondSide, int thirdSide) {
        if (firsSide == secondSide || secondSide == thirdSide || thirdSide == firsSide) {
            System.out.println("треугольник равнобедренный");
            return true;
        }
        return false;
    }

    public boolean isEquilateral(int firsSide, int secondSide, int thirdSide) {
        if (firsSide == secondSide && secondSide == thirdSide) {
            System.out.println("треугольник равносторонний");
            return true;
        }
        return false;
    }

    public boolean isAcuteAngled(int firstCorner, int secondCorner, int thirdCorner) throws IncorrectAnglesSumException {
        if (firstCorner + secondCorner + thirdCorner != 180) {
            throw new IncorrectAnglesSumException("Sum should be 180");
        }
        if (firstCorner < 90 && secondCorner < 90 && thirdCorner < 90) {
            System.out.println("треугольник остроугольный");
            return true;
        }
        return false;
    }

    public  boolean  isObtuse(int firstCorner, int secondCorner, int thirdCorner) throws IncorrectAnglesSumException {
        if (firstCorner + secondCorner + thirdCorner != 180) {
            throw new IncorrectAnglesSumException("Sum should be 180 ");
        }
        if(firstCorner > 90 || secondCorner > 90 || thirdCorner > 90) {
            System.out.println("треугольник тупоугольный");
            return true;
        }
        return false;
    }

}