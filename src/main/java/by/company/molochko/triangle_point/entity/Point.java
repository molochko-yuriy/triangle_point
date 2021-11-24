package by.company.molochko.triangle_point.entity;

public class Point {
    private double x;
    private double y;

    public Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Point aThat = (Point) object;

        if (getX() == aThat.getX()){
            return true;
        }
        return getY() == aThat.getY();
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 31;
        result = prime * result + Double.hashCode(getX());
        result = prime * result + Double.hashCode(getY());
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                ", x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}