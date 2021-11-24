package by.company.molochko.triangle_point.entity;

public class Triangle {
    private Long id;
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {}

    public Triangle(Point a, Point b, Point c) {
        this.pointA = a;
        this.pointB = b;
        this.pointC = c;
    }

    public Long getId() {
        return id;
    }

    public void setId(String name) {
        this.id = id;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Triangle aThat = (Triangle) object;

        if (getId() == null) {
            if (aThat.getId()  != null) { return false;}
        } else if (!getId().equals(aThat.getId())) { return false;}

        if (getPointA() == null) {
            if (aThat.getPointA()  != null) { return false;}
        } else if (!getPointA().equals(aThat.getPointA())) { return false;}

        if (getPointB() == null) {
            if (aThat.getPointB()  != null) { return false;}
        } else if (!getPointB().equals(aThat.getPointB())) { return false;}

        if (getPointC() == null) {
            if (aThat.getPointC()  != null) { return false;}
        } else if (!getPointC().equals(aThat.getPointC())) { return false;}

        return getPointC().equals(aThat.getPointC());
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 31;
        result = prime * result + (getId() != null ? getId().hashCode() : 0);
        result = prime * result + (getPointA() != null ? getPointA().hashCode() : 0);
        result = prime * result + (getPointB() != null ? getPointB().hashCode() : 0);
        result = prime * result + (getPointC() != null ? getPointC().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + getId() + '\'' +
                ", a=" + getPointA() +
                ", b=" + getPointB() +
                ", c=" + getPointC() +
                '}';
    }
}