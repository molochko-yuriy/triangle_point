package by.company.molochko.triangle_point.service;

import by.company.molochko.triangle_point.entity.Point;
import by.company.molochko.triangle_point.entity.Triangle;
import by.company.molochko.triangle_point.exception.TriangleException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleServiceTest {
    private TriangleService triangleService;
    private Triangle triangle;

    @Before
    public void init() {
        triangleService = new TriangleService();
        triangle = new Triangle(new Point(2.0, 0.0), new Point(1.5, 2.0), new Point(4.5, 2.0));
    }

    @Test
    public void findSquareTest_validData() throws TriangleException {
        //given
        double expected = 3.00;

        //when
        double actual = triangleService.findSquare(triangle);

        //then
        Assert.assertEquals(actual, expected, 3);
    }

    @Test(expected = TriangleException.class)
    public void findSquareTest_invalidData() throws TriangleException {
        //given && when && then
        triangleService.findSquare(null);
    }

    @Test
    public void findPerimeterTest_validData() throws TriangleException {
        //given
        double expected = 8.26;

        //when
        double actual = triangleService.findPerimeter(triangle);

        //then
        Assert.assertEquals(actual, expected, 2);
    }

    @Test(expected = TriangleException.class)
    public void findPerimeterTest_invalidData() throws TriangleException {
        //given && when && then
        triangleService.findPerimeter(null);
    }

    @Test
    public void isIsoscelesTest_validData() throws TriangleException {
        //given
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(4, 0));

        //when
        boolean actual = triangleService.isIsosceles(triangle);

        //then
        Assert.assertTrue(actual);
    }

    @Test(expected = TriangleException.class)
    public void isIsoscelesTest_invalidData() throws TriangleException {
        //given && when && then
        triangleService.isIsosceles(null);
    }

    @Test(expected = TriangleException.class)
    public void isEquilateralTest_invalidData() throws TriangleException {
        //given && when && then
        triangleService.isEquilateral(null);
    }

    @Test
    public void isRectangularTest_validData() throws TriangleException {
        //given
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(4, 0));

        //when
        boolean actual = triangleService.isRectangular(triangle);

        //then
        Assert.assertTrue(actual);
    }

    @Test(expected = TriangleException.class)
    public void isRectangularTest_invalidData() throws TriangleException {
        //given && when && then
        triangleService.isRectangular(null);
    }

    @Test
    public void isAcuteTest_validData() throws TriangleException {
        //given
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(4, 0));

        //when
        boolean actual = triangleService.isAcute(triangle);

        //then
        Assert.assertTrue(actual);
    }

    @Test(expected = TriangleException.class)
    public void isAcuteTest_invalidData() throws TriangleException {
        //given && when && then
        triangleService.isAcute(null);
    }

    @Test
    public void isObtuseTest_validData() throws TriangleException {
        //given
        Triangle triangle = new Triangle(new Point(2, -10), new Point(0, 0), new Point(0, 4));

        //when
        boolean actual = triangleService.isObtuse(triangle);

        //then
        Assert.assertTrue(actual);
    }

    @Test(expected = TriangleException.class)
    public void isObtuseTest_invalidData() throws TriangleException {
        //given && when && then
        triangleService.isObtuse(null);
    }
}