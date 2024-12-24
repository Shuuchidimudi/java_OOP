public class Triangle {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a; this.b = b; this.c = c;
    }

    public boolean isTriangle() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double getArea() {
        if (isTriangle()) {
            double s = (a + b + c) / 2.0;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return 0;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Is it a triangle? " + triangle.isTriangle());
        System.out.println("Area: " + triangle.getArea());
    }
}
