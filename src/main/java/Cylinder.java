public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    //ublic Cylinder() {
     //   super();
   // }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSurfaceArea() {
        double baseArea = super.getArea();
        double lateralArea = 2 * Math.PI * getRadius() * height;
        return 2 * baseArea + lateralArea;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
