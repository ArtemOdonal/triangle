package com.epam.rd.autotasks.triangle;

class Triangle {
    Point a,b,c;
    double length1,length2,length3;


    public Triangle(Point a, Point b, Point c) {


        this.a = a;
        this.b = b;
        this.c = c;

        double xDistanceSquarelength1 = Math.pow(a.getX() - b.getX(), 2);
        double yDistanceSquarelength1 = Math.pow(a.getY() - b.getY(), 2);
        double xDistanceSquarelength2 = Math.pow(a.getX() - c.getX(), 2);
        double yDistanceSquarelength2 = Math.pow(a.getY() - c.getY(), 2);
        double xDistanceSquarelength3 = Math.pow(c.getX() - b.getX(), 2);
        double yDistanceSquarelength3 = Math.pow(c.getY() - b.getY(), 2);
        this.length1 = Math.sqrt(xDistanceSquarelength1 + yDistanceSquarelength1);
        this.length2 = Math.sqrt(xDistanceSquarelength2 + yDistanceSquarelength2);
        this.length3 = Math.sqrt(xDistanceSquarelength3 + yDistanceSquarelength3);

        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("Arguments can't be null");
        }
        if (((length1+length2) <= length3)||((length1+length3) <= length2)||((length2+length3) <=  length1)) {
            throw new IllegalArgumentException();
        }
    }





    public double area() {
        double s= (length1+length2+length3)/2;
        return  Math.sqrt(s*(s-length1)*(s-length2)*(s-length3));
    }

    public Point centroid(){
        double xc= (((a.getX()+b.getX()+c.getX())/3));
        double yc= (((a.getY()+b.getY()+c.getY())/3));
        return new Point(xc, yc);
    }

}
