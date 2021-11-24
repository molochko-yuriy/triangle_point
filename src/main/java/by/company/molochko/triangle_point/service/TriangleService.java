package by.company.molochko.triangle_point.service;

import by.company.molochko.triangle_point.entity.Point;
import by.company.molochko.triangle_point.entity.Triangle;
import by.company.molochko.triangle_point.exception.TriangleException;

import java.util.ArrayList;
import java.util.List;

public class TriangleService {
    private static final String ERROR_MESSAGE = "Error data! Null triangle!";

    public double findSquare(Triangle triangle) throws TriangleException {
        if (triangle == null) {
            throw new TriangleException(ERROR_MESSAGE);
        }
        List<Double> sides = findSides(triangle);
        double halfPerimeter = findPerimeter(triangle) * 0.5;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sides.get(0))
                * (halfPerimeter - sides.get(1)) * (halfPerimeter - sides.get(2)));
    }

    private List<Double> findSides(Triangle triangle) {
        return new ArrayList<Double>() {{
            add(findSide(triangle.getPointA(), triangle.getPointB()));
            add(findSide(triangle.getPointB(), triangle.getPointC()));
            add(findSide(triangle.getPointA(), triangle.getPointC()));
        }};
    }

    private double findSide(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));
    }

    public double findPerimeter(Triangle triangle) throws TriangleException {
        if (triangle == null) {
            throw new TriangleException(ERROR_MESSAGE);
        }
        List<Double> sides = findSides(triangle);
        return sides.stream().mapToDouble(side -> side).sum();
    }

    public boolean isIsosceles(Triangle triangle) throws TriangleException {
        if (triangle == null) {
            throw new TriangleException(ERROR_MESSAGE);
        }
        List<Double> sides = findSides(triangle);
        return checkEquality(sides.get(0), sides.get(1)) || checkEquality(sides.get(0), sides.get(2))
                || checkEquality(sides.get(1), sides.get(2));
    }

    private boolean checkEquality(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }

    public boolean isEquilateral(Triangle triangle) throws TriangleException {
        if (triangle == null) {
            throw new TriangleException(ERROR_MESSAGE);
        }
        List<Double> sides = findSides(triangle);
        return checkEquality(sides.get(0), sides.get(1)) && checkEquality(sides.get(0), sides.get(2));
    }

    public boolean isRectangular(Triangle triangle) throws TriangleException {
        if (triangle == null) {
            throw new TriangleException(ERROR_MESSAGE);
        }
        List<Double> sides = findSides(triangle);
        boolean first = sides.get(0) == Math.sqrt(Math.pow(sides.get(1), 2) + Math.pow(sides.get(2), 2));
        boolean second = sides.get(1) == Math.sqrt(Math.pow(sides.get(0), 2) + Math.pow(sides.get(2), 2));
        boolean third = sides.get(2) == Math.sqrt(Math.pow(sides.get(1), 2) + Math.pow(sides.get(0), 2));
        return first || second || third;
    }

    public boolean isAcute(Triangle triangle) throws TriangleException {
        if (triangle == null) {
            throw new TriangleException(ERROR_MESSAGE);
        }
        List<Double> sides = findSides(triangle);
        return Math.pow(sides.get(0), 2) + Math.pow(sides.get(1), 2) > Math.pow(sides.get(2), 2);
    }

    public boolean isObtuse(Triangle triangle) throws TriangleException {
        if (triangle == null) {
            throw new TriangleException(ERROR_MESSAGE);
        }
        List<Double> sides = findSides(triangle);
        return Math.pow(sides.get(0), 2) + Math.pow(sides.get(1), 2) < Math.pow(sides.get(2), 2);
    }
}