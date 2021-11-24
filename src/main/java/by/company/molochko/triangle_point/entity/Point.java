package by.company.molochko.triangle_point.entity;

public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
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
        result = prime * result + getX();
        result = prime * result + getY();
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