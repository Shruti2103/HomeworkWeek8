package cylinder;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }


    }

    // instance method
    public double getHeight() {
        return height;
    }

    // volume instance method
    public double getVolume() {

        return this.height * this.getArea();

    }




}
