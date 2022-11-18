public class Circle {
    int radius;
    public Circle() {
    }
    public Circle(int radius) {
        this.radius=radius;
    }

    public double getArea() {
        return 3.14*this.radius*this.radius;
    }

    public static void main(String[] args) {
        Circle c [] = new Circle[5];
        for(int i=0; i<c.length; i++) {
            c[i] = new Circle(i);
            System.out.print((int)c[i].getArea() + " ");
        }
    }
}
