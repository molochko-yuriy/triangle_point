package by.company.molochko.triangle_point.entity;

public class Triangle {
    private String name = "triangle name";
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {}

    public Triangle(String name, Point a, Point b, Point c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
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

        if (getName() == null) {
            if (aThat.getName()  != null) { return false;}
        } else if (!getName().equals(aThat.getName())) { return false;}

        if (getA() == null) {
            if (aThat.getA()  != null) { return false;}
        } else if (!getA().equals(aThat.getA())) { return false;}

        if (getB() == null) {
            if (aThat.getB()  != null) { return false;}
        } else if (!getB().equals(aThat.getB())) { return false;}

        if (getC() == null) {
            if (aThat.getC()  != null) { return false;}
        } else if (!getC().equals(aThat.getC())) { return false;}

        return getC().equals(aThat.getC());
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 31;
        result = prime * result + (getName() != null ? getName().hashCode() : 0);
        result = prime * result + (getA() != null ? getA().hashCode() : 0);
        result = prime * result + (getB() != null ? getB().hashCode() : 0);
        result = prime * result + (getC() != null ? getC().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + getName() + '\'' +
                ", a=" + getA() +
                ", b=" + getB() +
                ", c=" + getC() +
                '}';
    }
}
