//package Shape;

public abstract class Shape {
    public abstract void perimeter();

    public abstract void area();
}

class Rectangle extends Shape {

    private double len;
    private double bre;

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public double getBre() {
        return bre;
    }

    public void setBre(double bre) {
        this.bre = bre;
    }

    public Rectangle(double len, double bre) {
        this.len = len;
        this.bre = bre;
    }

    
    public void area() {
        System.out.println("Area of Reactangle : " + len * bre);
    }

   public  void perimeter() {
        System.out.println("Perimeter of Reactangle : " + 2 * (len+ bre));
    }
}


 class Circle extends Shape {

    private double radi;

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public Circle(double radi) {
        this.radi = radi;
    }

   public  void area() {
        System.out.println("Area of Circle : " + 3.14* radi * radi);
    }

    
    public void perimeter() {
        System.out.println("Perimeter of Circle : " + 2 * 3.14 * radi);
    }

}

class Test {
    public static void main(String[] args) {
        Circle c = new Circle(13);
        c.area();
        c.perimeter();

        Rectangle r = new Rectangle(13,10);
        r.area();
        r.perimeter();
        
    
}
}
